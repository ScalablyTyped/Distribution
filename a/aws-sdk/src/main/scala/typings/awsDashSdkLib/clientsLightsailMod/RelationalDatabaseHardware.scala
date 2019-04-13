package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationalDatabaseHardware extends js.Object {
  /**
    * The number of vCPUs for the database.
    */
  var cpuCount: js.UndefOr[integer] = js.undefined
  /**
    * The size of the disk for the database.
    */
  var diskSizeInGb: js.UndefOr[integer] = js.undefined
  /**
    * The amount of RAM in GB for the database.
    */
  var ramSizeInGb: js.UndefOr[float] = js.undefined
}

object RelationalDatabaseHardware {
  @scala.inline
  def apply(
    cpuCount: js.UndefOr[integer] = js.undefined,
    diskSizeInGb: js.UndefOr[integer] = js.undefined,
    ramSizeInGb: js.UndefOr[float] = js.undefined
  ): RelationalDatabaseHardware = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cpuCount)) __obj.updateDynamic("cpuCount")(cpuCount)
    if (!js.isUndefined(diskSizeInGb)) __obj.updateDynamic("diskSizeInGb")(diskSizeInGb)
    if (!js.isUndefined(ramSizeInGb)) __obj.updateDynamic("ramSizeInGb")(ramSizeInGb)
    __obj.asInstanceOf[RelationalDatabaseHardware]
  }
}

