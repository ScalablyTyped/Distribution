package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutDeliverabilityDashboardOptionRequest extends js.Object {
  /**
    * Specifies whether to enable the Deliverability dashboard for your Amazon Pinpoint account. To enable the dashboard, set this value to true.
    */
  var DashboardEnabled: Enabled
  /**
    * An array of objects, one for each verified domain that you use to send email and enabled the Deliverability dashboard for.
    */
  var SubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions] = js.undefined
}

object PutDeliverabilityDashboardOptionRequest {
  @scala.inline
  def apply(DashboardEnabled: Enabled, SubscribedDomains: DomainDeliverabilityTrackingOptions = null): PutDeliverabilityDashboardOptionRequest = {
    val __obj = js.Dynamic.literal(DashboardEnabled = DashboardEnabled)
    if (SubscribedDomains != null) __obj.updateDynamic("SubscribedDomains")(SubscribedDomains)
    __obj.asInstanceOf[PutDeliverabilityDashboardOptionRequest]
  }
}

