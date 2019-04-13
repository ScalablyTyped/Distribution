package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceHardware extends js.Object {
  /**
    * The number of vCPUs the instance has.
    */
  var cpuCount: js.UndefOr[integer] = js.undefined
  /**
    * The disks attached to the instance.
    */
  var disks: js.UndefOr[DiskList] = js.undefined
  /**
    * The amount of RAM in GB on the instance (e.g., 1.0).
    */
  var ramSizeInGb: js.UndefOr[float] = js.undefined
}

object InstanceHardware {
  @scala.inline
  def apply(
    cpuCount: js.UndefOr[integer] = js.undefined,
    disks: DiskList = null,
    ramSizeInGb: js.UndefOr[float] = js.undefined
  ): InstanceHardware = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cpuCount)) __obj.updateDynamic("cpuCount")(cpuCount)
    if (disks != null) __obj.updateDynamic("disks")(disks)
    if (!js.isUndefined(ramSizeInGb)) __obj.updateDynamic("ramSizeInGb")(ramSizeInGb)
    __obj.asInstanceOf[InstanceHardware]
  }
}

