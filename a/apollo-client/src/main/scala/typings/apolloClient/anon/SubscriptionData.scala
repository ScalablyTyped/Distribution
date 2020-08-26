package typings.apolloClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionData[TSubscriptionData, TSubscriptionVariables] extends js.Object {
  var subscriptionData: DataTSubscriptionData[TSubscriptionData] = js.native
  var variables: js.UndefOr[TSubscriptionVariables] = js.native
}

object SubscriptionData {
  @scala.inline
  def apply[TSubscriptionData, TSubscriptionVariables](subscriptionData: DataTSubscriptionData[TSubscriptionData]): SubscriptionData[TSubscriptionData, TSubscriptionVariables] = {
    val __obj = js.Dynamic.literal(subscriptionData = subscriptionData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionData[TSubscriptionData, TSubscriptionVariables]]
  }
  @scala.inline
  implicit class SubscriptionDataOps[Self <: SubscriptionData[_, _], TSubscriptionData, TSubscriptionVariables] (val x: Self with (SubscriptionData[TSubscriptionData, TSubscriptionVariables])) extends AnyVal {
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
    def setSubscriptionData(value: DataTSubscriptionData[TSubscriptionData]): Self = this.set("subscriptionData", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: TSubscriptionVariables): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

