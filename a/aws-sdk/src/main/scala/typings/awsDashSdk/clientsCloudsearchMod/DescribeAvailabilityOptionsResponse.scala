package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAvailabilityOptionsResponse extends js.Object {
  /**
    * The availability options configured for the domain. Indicates whether Multi-AZ is enabled for the domain. 
    */
  var AvailabilityOptions: js.UndefOr[AvailabilityOptionsStatus] = js.native
}

object DescribeAvailabilityOptionsResponse {
  @scala.inline
  def apply(AvailabilityOptions: AvailabilityOptionsStatus = null): DescribeAvailabilityOptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityOptions != null) __obj.updateDynamic("AvailabilityOptions")(AvailabilityOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAvailabilityOptionsResponse]
  }
}

