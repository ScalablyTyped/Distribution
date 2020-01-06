package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNotificationSubscriptionResponse extends js.Object {
  /**
    * The subscription.
    */
  var Subscription: js.UndefOr[typings.awsDashSdk.clientsWorkdocsMod.Subscription] = js.native
}

object CreateNotificationSubscriptionResponse {
  @scala.inline
  def apply(Subscription: Subscription = null): CreateNotificationSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    if (Subscription != null) __obj.updateDynamic("Subscription")(Subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNotificationSubscriptionResponse]
  }
}

