package typings.apolloLink.typesMod

import typings.graphql.astMod.DocumentNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLRequest extends js.Object {
  var context: js.UndefOr[Record[String, _]] = js.native
  var extensions: js.UndefOr[Record[String, _]] = js.native
  var operationName: js.UndefOr[String] = js.native
  var query: DocumentNode = js.native
  var variables: js.UndefOr[Record[String, _]] = js.native
}

object GraphQLRequest {
  @scala.inline
  def apply(query: DocumentNode): GraphQLRequest = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLRequest]
  }
  @scala.inline
  implicit class GraphQLRequestOps[Self <: GraphQLRequest] (val x: Self) extends AnyVal {
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
    def setQuery(value: DocumentNode): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: Record[String, _]): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setExtensions(value: Record[String, _]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setOperationName(value: String): Self = this.set("operationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationName: Self = this.set("operationName", js.undefined)
    @scala.inline
    def setVariables(value: Record[String, _]): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

