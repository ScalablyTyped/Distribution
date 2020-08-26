package typings.apolloReactCommon.typesMod

import typings.apolloClient.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnSubscriptionDataOptions[TData] extends js.Object {
  var client: default[js.Object] = js.native
  var subscriptionData: SubscriptionResult[TData] = js.native
}

object OnSubscriptionDataOptions {
  @scala.inline
  def apply[TData](client: default[js.Object], subscriptionData: SubscriptionResult[TData]): OnSubscriptionDataOptions[TData] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], subscriptionData = subscriptionData.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSubscriptionDataOptions[TData]]
  }
  @scala.inline
  implicit class OnSubscriptionDataOptionsOps[Self <: OnSubscriptionDataOptions[_], TData] (val x: Self with OnSubscriptionDataOptions[TData]) extends AnyVal {
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
    def setClient(value: default[js.Object]): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionData(value: SubscriptionResult[TData]): Self = this.set("subscriptionData", value.asInstanceOf[js.Any])
  }
  
}

