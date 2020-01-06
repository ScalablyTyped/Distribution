package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVolumeRecoveryPointsOutput extends js.Object {
  var GatewayARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN] = js.native
  /**
    * An array of VolumeRecoveryPointInfo objects.
    */
  var VolumeRecoveryPointInfos: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.VolumeRecoveryPointInfos] = js.native
}

object ListVolumeRecoveryPointsOutput {
  @scala.inline
  def apply(GatewayARN: GatewayARN = null, VolumeRecoveryPointInfos: VolumeRecoveryPointInfos = null): ListVolumeRecoveryPointsOutput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    if (VolumeRecoveryPointInfos != null) __obj.updateDynamic("VolumeRecoveryPointInfos")(VolumeRecoveryPointInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVolumeRecoveryPointsOutput]
  }
}

