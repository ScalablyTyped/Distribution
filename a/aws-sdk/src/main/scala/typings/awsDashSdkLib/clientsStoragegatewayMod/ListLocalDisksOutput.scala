package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLocalDisksOutput extends js.Object {
  /**
    * A JSON object containing the following fields:    ListLocalDisksOutput$Disks   
    */
  var Disks: js.UndefOr[Disks] = js.undefined
  var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
}

object ListLocalDisksOutput {
  @scala.inline
  def apply(Disks: Disks = null, GatewayARN: GatewayARN = null): ListLocalDisksOutput = {
    val __obj = js.Dynamic.literal()
    if (Disks != null) __obj.updateDynamic("Disks")(Disks)
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    __obj.asInstanceOf[ListLocalDisksOutput]
  }
}

