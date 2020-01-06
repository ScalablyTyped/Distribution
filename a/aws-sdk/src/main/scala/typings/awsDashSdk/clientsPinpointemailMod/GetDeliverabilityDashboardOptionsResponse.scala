package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeliverabilityDashboardOptionsResponse extends js.Object {
  /**
    * The current status of your Deliverability dashboard subscription. If this value is PENDING_EXPIRATION, your subscription is scheduled to expire at the end of the current calendar month.
    */
  var AccountStatus: js.UndefOr[DeliverabilityDashboardAccountStatus] = js.native
  /**
    * An array of objects, one for each verified domain that you use to send email and currently has an active Deliverability dashboard subscription that isn’t scheduled to expire at the end of the current calendar month.
    */
  var ActiveSubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions] = js.native
  /**
    * Specifies whether the Deliverability dashboard is enabled for your Amazon Pinpoint account. If this value is true, the dashboard is enabled.
    */
  var DashboardEnabled: Enabled = js.native
  /**
    * An array of objects, one for each verified domain that you use to send email and currently has an active Deliverability dashboard subscription that's scheduled to expire at the end of the current calendar month.
    */
  var PendingExpirationSubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions] = js.native
  /**
    * The date, in Unix time format, when your current subscription to the Deliverability dashboard is scheduled to expire, if your subscription is scheduled to expire at the end of the current calendar month. This value is null if you have an active subscription that isn’t due to expire at the end of the month.
    */
  var SubscriptionExpiryDate: js.UndefOr[Timestamp] = js.native
}

object GetDeliverabilityDashboardOptionsResponse {
  @scala.inline
  def apply(
    DashboardEnabled: Enabled,
    AccountStatus: DeliverabilityDashboardAccountStatus = null,
    ActiveSubscribedDomains: DomainDeliverabilityTrackingOptions = null,
    PendingExpirationSubscribedDomains: DomainDeliverabilityTrackingOptions = null,
    SubscriptionExpiryDate: Timestamp = null
  ): GetDeliverabilityDashboardOptionsResponse = {
    val __obj = js.Dynamic.literal(DashboardEnabled = DashboardEnabled.asInstanceOf[js.Any])
    if (AccountStatus != null) __obj.updateDynamic("AccountStatus")(AccountStatus.asInstanceOf[js.Any])
    if (ActiveSubscribedDomains != null) __obj.updateDynamic("ActiveSubscribedDomains")(ActiveSubscribedDomains.asInstanceOf[js.Any])
    if (PendingExpirationSubscribedDomains != null) __obj.updateDynamic("PendingExpirationSubscribedDomains")(PendingExpirationSubscribedDomains.asInstanceOf[js.Any])
    if (SubscriptionExpiryDate != null) __obj.updateDynamic("SubscriptionExpiryDate")(SubscriptionExpiryDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeliverabilityDashboardOptionsResponse]
  }
}

