package typings
package awsDashSdkLib.clientsEc2Mod

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
    AvailableCapacity: js.UndefOr[Integer] = js.undefined,
    InstanceType: String = null,
    TotalCapacity: js.UndefOr[Integer] = js.undefined
  ): InstanceCapacity = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AvailableCapacity)) __obj.updateDynamic("AvailableCapacity")(AvailableCapacity)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (!js.isUndefined(TotalCapacity)) __obj.updateDynamic("TotalCapacity")(TotalCapacity)
    __obj.asInstanceOf[InstanceCapacity]
  }
}

