package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLocalDisksOutput extends js.Object {
  /**
    * A JSON object containing the following fields:    ListLocalDisksOutput$Disks   
    */
  var Disks: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Disks] = js.native
  var GatewayARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN] = js.native
}

object ListLocalDisksOutput {
  @scala.inline
  def apply(Disks: Disks = null, GatewayARN: GatewayARN = null): ListLocalDisksOutput = {
    val __obj = js.Dynamic.literal()
    if (Disks != null) __obj.updateDynamic("Disks")(Disks.asInstanceOf[js.Any])
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLocalDisksOutput]
  }
}

