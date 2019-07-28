package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceDetails extends js.Object {
  /**
    * Details on the Amazon EC2 resource.
    */
  var EC2ResourceDetails: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.EC2ResourceDetails] = js.undefined
}

object ResourceDetails {
  @scala.inline
  def apply(EC2ResourceDetails: EC2ResourceDetails = null): ResourceDetails = {
    val __obj = js.Dynamic.literal()
    if (EC2ResourceDetails != null) __obj.updateDynamic("EC2ResourceDetails")(EC2ResourceDetails)
    __obj.asInstanceOf[ResourceDetails]
  }
}

