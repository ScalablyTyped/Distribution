package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVolumeRecoveryPointsOutput extends js.Object {
  var GatewayARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
  /**
    * An array of VolumeRecoveryPointInfo objects.
    */
  var VolumeRecoveryPointInfos: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.VolumeRecoveryPointInfos] = js.undefined
}

object ListVolumeRecoveryPointsOutput {
  @scala.inline
  def apply(GatewayARN: GatewayARN = null, VolumeRecoveryPointInfos: VolumeRecoveryPointInfos = null): ListVolumeRecoveryPointsOutput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    if (VolumeRecoveryPointInfos != null) __obj.updateDynamic("VolumeRecoveryPointInfos")(VolumeRecoveryPointInfos)
    __obj.asInstanceOf[ListVolumeRecoveryPointsOutput]
  }
}

