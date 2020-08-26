package typings.apolloReact.testUtilsMod

import typings.std.Error
import typings.typedGraphql.mod.GraphQLResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockedResponse extends js.Object {
  var delay: js.UndefOr[Double] = js.native
  var error: js.UndefOr[Error] = js.native
  var newData: js.UndefOr[js.Function0[_]] = js.native
  var request: ParsedRequest = js.native
  var result: js.UndefOr[GraphQLResult] = js.native
}

object MockedResponse {
  @scala.inline
  def apply(request: ParsedRequest): MockedResponse = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockedResponse]
  }
  @scala.inline
  implicit class MockedResponseOps[Self <: MockedResponse] (val x: Self) extends AnyVal {
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
    def setRequest(value: ParsedRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setNewData(value: () => _): Self = this.set("newData", js.Any.fromFunction0(value))
    @scala.inline
    def deleteNewData: Self = this.set("newData", js.undefined)
    @scala.inline
    def setResult(value: GraphQLResult): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}

