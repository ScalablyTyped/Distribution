package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeliverabilityDashboardOptionsResponse extends js.Object {
  /**
    * Indicates whether the Deliverability dashboard is enabled. If the value is true, then the dashboard is enabled.
    */
  var DashboardEnabled: Enabled
}

object GetDeliverabilityDashboardOptionsResponse {
  @scala.inline
  def apply(DashboardEnabled: Enabled): GetDeliverabilityDashboardOptionsResponse = {
    val __obj = js.Dynamic.literal(DashboardEnabled = DashboardEnabled)
  
    __obj.asInstanceOf[GetDeliverabilityDashboardOptionsResponse]
  }
}

