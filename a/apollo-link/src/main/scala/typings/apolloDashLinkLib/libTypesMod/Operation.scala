package typings
package apolloDashLinkLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  var extensions: stdLib.Record[java.lang.String, _]
  var operationName: java.lang.String
  var query: graphqlLib.languageAstMod.DocumentNode
  var variables: stdLib.Record[java.lang.String, _]
  def getContext(): stdLib.Record[java.lang.String, _]
  def setContext(context: stdLib.Record[java.lang.String, _]): stdLib.Record[java.lang.String, _]
  def toKey(): java.lang.String
}

object Operation {
  @scala.inline
  def apply(
    extensions: stdLib.Record[java.lang.String, _],
    getContext: js.Function0[stdLib.Record[java.lang.String, _]],
    operationName: java.lang.String,
    query: graphqlLib.languageAstMod.DocumentNode,
    setContext: js.Function1[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]],
    toKey: js.Function0[java.lang.String],
    variables: stdLib.Record[java.lang.String, _]
  ): Operation = {
    val __obj = js.Dynamic.literal(extensions = extensions, getContext = getContext, operationName = operationName, query = query, setContext = setContext, toKey = toKey, variables = variables)
  
    __obj.asInstanceOf[Operation]
  }
}

