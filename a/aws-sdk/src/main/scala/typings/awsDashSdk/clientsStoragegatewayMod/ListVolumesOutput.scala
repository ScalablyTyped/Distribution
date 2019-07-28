package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVolumesOutput extends js.Object {
  var GatewayARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
  /**
    * Use the marker in your next request to continue pagination of iSCSI volumes. If there are no more volumes to list, this field does not appear in the response body.
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Marker] = js.undefined
  /**
    * An array of VolumeInfo objects, where each object describes an iSCSI volume. If no volumes are defined for the gateway, then VolumeInfos is an empty array "[]".
    */
  var VolumeInfos: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.VolumeInfos] = js.undefined
}

object ListVolumesOutput {
  @scala.inline
  def apply(GatewayARN: GatewayARN = null, Marker: Marker = null, VolumeInfos: VolumeInfos = null): ListVolumesOutput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (VolumeInfos != null) __obj.updateDynamic("VolumeInfos")(VolumeInfos)
    __obj.asInstanceOf[ListVolumesOutput]
  }
}

