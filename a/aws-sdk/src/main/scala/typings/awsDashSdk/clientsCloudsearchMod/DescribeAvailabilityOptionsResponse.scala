package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAvailabilityOptionsResponse extends js.Object {
  /**
    * The availability options configured for the domain. Indicates whether Multi-AZ is enabled for the domain. 
    */
  var AvailabilityOptions: js.UndefOr[AvailabilityOptionsStatus] = js.undefined
}

object DescribeAvailabilityOptionsResponse {
  @scala.inline
  def apply(AvailabilityOptions: AvailabilityOptionsStatus = null): DescribeAvailabilityOptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityOptions != null) __obj.updateDynamic("AvailabilityOptions")(AvailabilityOptions)
    __obj.asInstanceOf[DescribeAvailabilityOptionsResponse]
  }
}

