package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionDefinitionVersion extends js.Object {
  /**
    * A list of subscriptions.
    */
  var Subscriptions: js.UndefOr[__listOfSubscription] = js.undefined
}

object SubscriptionDefinitionVersion {
  @scala.inline
  def apply(Subscriptions: __listOfSubscription = null): SubscriptionDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    if (Subscriptions != null) __obj.updateDynamic("Subscriptions")(Subscriptions)
    __obj.asInstanceOf[SubscriptionDefinitionVersion]
  }
}

