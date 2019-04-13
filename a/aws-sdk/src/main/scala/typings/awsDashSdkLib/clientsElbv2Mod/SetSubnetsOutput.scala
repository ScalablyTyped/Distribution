package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetSubnetsOutput extends js.Object {
  /**
    * Information about the subnet and Availability Zone.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
}

object SetSubnetsOutput {
  @scala.inline
  def apply(AvailabilityZones: AvailabilityZones = null): SetSubnetsOutput = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    __obj.asInstanceOf[SetSubnetsOutput]
  }
}

