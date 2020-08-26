package typings.apolloLink.typesMod

import typings.graphql.astMod.DocumentNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operation extends js.Object {
  var extensions: Record[String, _] = js.native
  var operationName: String = js.native
  var query: DocumentNode = js.native
  var variables: Record[String, _] = js.native
  def getContext(): Record[String, _] = js.native
  def setContext(context: Record[String, _]): Record[String, _] = js.native
  def toKey(): String = js.native
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
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], getContext = js.Any.fromFunction0(getContext), operationName = operationName.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], setContext = js.Any.fromFunction1(setContext), toKey = js.Any.fromFunction0(toKey), variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  implicit class OperationOps[Self <: Operation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExtensions(value: Record[String, _]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetContext(value: () => Record[String, _]): Self = this.set("getContext", js.Any.fromFunction0(value))
    @scala.inline
    def setOperationName(value: String): Self = this.set("operationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: DocumentNode): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetContext(value: Record[String, _] => Record[String, _]): Self = this.set("setContext", js.Any.fromFunction1(value))
    @scala.inline
    def setToKey(value: () => String): Self = this.set("toKey", js.Any.fromFunction0(value))
    @scala.inline
    def setVariables(value: Record[String, _]): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
  
}

