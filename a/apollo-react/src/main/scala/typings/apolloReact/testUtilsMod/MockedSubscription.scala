package typings.apolloReact.testUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockedSubscription extends js.Object {
  var id: js.UndefOr[Double] = js.native
  var request: ParsedRequest = js.native
  var results: js.UndefOr[js.Array[MockedSubscriptionResult]] = js.native
}

object MockedSubscription {
  @scala.inline
  def apply(request: ParsedRequest): MockedSubscription = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockedSubscription]
  }
  @scala.inline
  implicit class MockedSubscriptionOps[Self <: MockedSubscription] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setResultsVarargs(value: MockedSubscriptionResult*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[MockedSubscriptionResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
  
}

