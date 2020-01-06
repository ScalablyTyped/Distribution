package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceCapacity extends js.Object {
  /**
    * The number of instances that can be launched onto the Dedicated Host based on the host's available capacity.
    */
  var AvailableCapacity: js.UndefOr[Integer] = js.native
  /**
    * The instance type supported by the Dedicated Host.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The total number of instances that can be launched onto the Dedicated Host if there are no instances running on it.
    */
  var TotalCapacity: js.UndefOr[Integer] = js.native
}

object InstanceCapacity {
  @scala.inline
  def apply(
    AvailableCapacity: Int | scala.Double = null,
    InstanceType: String = null,
    TotalCapacity: Int | scala.Double = null
  ): InstanceCapacity = {
    val __obj = js.Dynamic.literal()
    if (AvailableCapacity != null) __obj.updateDynamic("AvailableCapacity")(AvailableCapacity.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (TotalCapacity != null) __obj.updateDynamic("TotalCapacity")(TotalCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceCapacity]
  }
}

