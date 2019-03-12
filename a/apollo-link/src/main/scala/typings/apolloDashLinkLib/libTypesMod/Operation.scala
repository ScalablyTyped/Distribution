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
    getContext: () => stdLib.Record[java.lang.String, _],
    operationName: java.lang.String,
    query: graphqlLib.languageAstMod.DocumentNode,
    setContext: stdLib.Record[java.lang.String, _] => stdLib.Record[java.lang.String, _],
    toKey: () => java.lang.String,
    variables: stdLib.Record[java.lang.String, _]
  ): Operation = {
    val __obj = js.Dynamic.literal(extensions = extensions, getContext = js.Any.fromFunction0(getContext), operationName = operationName, query = query, setContext = js.Any.fromFunction1(setContext), toKey = js.Any.fromFunction0(toKey), variables = variables)
  
    __obj.asInstanceOf[Operation]
  }
}

