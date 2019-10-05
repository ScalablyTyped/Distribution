package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceCapacity extends js.Object {
  /**
    * The number of instances that can still be launched onto the Dedicated Host.
    */
  var AvailableCapacity: js.UndefOr[Integer] = js.undefined
  /**
    * The instance type size supported by the Dedicated Host.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  /**
    * The total number of instances that can be launched onto the Dedicated Host.
    */
  var TotalCapacity: js.UndefOr[Integer] = js.undefined
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
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (TotalCapacity != null) __obj.updateDynamic("TotalCapacity")(TotalCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceCapacity]
  }
}

