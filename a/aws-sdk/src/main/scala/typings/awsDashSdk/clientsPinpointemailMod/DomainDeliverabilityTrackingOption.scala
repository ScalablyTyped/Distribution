package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainDeliverabilityTrackingOption extends js.Object {
  /**
    * A verified domain that’s associated with your AWS account and currently has an active Deliverability dashboard subscription.
    */
  var Domain: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.Domain] = js.undefined
  /**
    * An object that contains information about the inbox placement data settings for the domain.
    */
  var InboxPlacementTrackingOption: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.InboxPlacementTrackingOption] = js.undefined
  /**
    * The date, in Unix time format, when you enabled the Deliverability dashboard for the domain.
    */
  var SubscriptionStartDate: js.UndefOr[Timestamp] = js.undefined
}

object DomainDeliverabilityTrackingOption {
  @scala.inline
  def apply(
    Domain: Domain = null,
    InboxPlacementTrackingOption: InboxPlacementTrackingOption = null,
    SubscriptionStartDate: Timestamp = null
  ): DomainDeliverabilityTrackingOption = {
    val __obj = js.Dynamic.literal()
    if (Domain != null) __obj.updateDynamic("Domain")(Domain)
    if (InboxPlacementTrackingOption != null) __obj.updateDynamic("InboxPlacementTrackingOption")(InboxPlacementTrackingOption)
    if (SubscriptionStartDate != null) __obj.updateDynamic("SubscriptionStartDate")(SubscriptionStartDate)
    __obj.asInstanceOf[DomainDeliverabilityTrackingOption]
  }
}

