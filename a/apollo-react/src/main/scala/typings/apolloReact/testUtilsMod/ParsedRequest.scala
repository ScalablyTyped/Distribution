package typings.apolloReact.testUtilsMod

import typings.typedGraphql.mod.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedRequest extends js.Object {
  var debugName: js.UndefOr[String] = js.native
  var query: js.UndefOr[Document] = js.native
  var variables: js.UndefOr[js.Object] = js.native
}

object ParsedRequest {
  @scala.inline
  def apply(): ParsedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParsedRequest]
  }
  @scala.inline
  implicit class ParsedRequestOps[Self <: ParsedRequest] (val x: Self) extends AnyVal {
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
    def setDebugName(value: String): Self = this.set("debugName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugName: Self = this.set("debugName", js.undefined)
    @scala.inline
    def setQuery(value: Document): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setVariables(value: js.Object): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

