package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStorediSCSIVolumesInput extends js.Object {
  /**
    * An array of strings where each string represents the Amazon Resource Name (ARN) of a stored volume. All of the specified stored volumes must from the same gateway. Use ListVolumes to get volume ARNs for a gateway.
    */
  var VolumeARNs: typings.awsDashSdk.clientsStoragegatewayMod.VolumeARNs
}

object DescribeStorediSCSIVolumesInput {
  @scala.inline
  def apply(VolumeARNs: VolumeARNs): DescribeStorediSCSIVolumesInput = {
    val __obj = js.Dynamic.literal(VolumeARNs = VolumeARNs)
  
    __obj.asInstanceOf[DescribeStorediSCSIVolumesInput]
  }
}

