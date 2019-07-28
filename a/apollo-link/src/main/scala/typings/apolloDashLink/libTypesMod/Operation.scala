package typings.apolloDashLink.libTypesMod

import typings.graphql.languageAstMod.DocumentNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  var extensions: Record[String, _]
  var operationName: String
  var query: DocumentNode
  var variables: Record[String, _]
  def getContext(): Record[String, _]
  def setContext(context: Record[String, _]): Record[String, _]
  def toKey(): String
}

object Operation {
  @scala.inline
  def apply(
    extensions: Record[String, _],
    getContext: () => Record[String, _],
    operationName: String,
    query: DocumentNode,
    setContext: Record[String, _] => Record[String, _],
    toKey: () => String,
    variables: Record[String, _]
  ): Operation = {
    val __obj = js.Dynamic.literal(extensions = extensions, getContext = js.Any.fromFunction0(getContext), operationName = operationName, query = query, setContext = js.Any.fromFunction1(setContext), toKey = js.Any.fromFunction0(toKey), variables = variables)
  
    __obj.asInstanceOf[Operation]
  }
}

