package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionDefinitionVersion extends js.Object {
  /**
    * A list of subscriptions.
    */
  var Subscriptions: js.UndefOr[__listOfSubscription] = js.native
}

object SubscriptionDefinitionVersion {
  @scala.inline
  def apply(Subscriptions: __listOfSubscription = null): SubscriptionDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    if (Subscriptions != null) __obj.updateDynamic("Subscriptions")(Subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionDefinitionVersion]
  }
}

