package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutDeliverabilityDashboardOptionRequest extends js.Object {
  /**
    * Indicates whether the Deliverability dashboard is enabled. If the value is true, then the dashboard is enabled.
    */
  var DashboardEnabled: Enabled
}

object PutDeliverabilityDashboardOptionRequest {
  @scala.inline
  def apply(DashboardEnabled: Enabled): PutDeliverabilityDashboardOptionRequest = {
    val __obj = js.Dynamic.literal(DashboardEnabled = DashboardEnabled)
  
    __obj.asInstanceOf[PutDeliverabilityDashboardOptionRequest]
  }
}

