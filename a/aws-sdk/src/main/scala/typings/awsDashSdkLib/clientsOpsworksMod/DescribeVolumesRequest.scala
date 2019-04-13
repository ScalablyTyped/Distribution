package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVolumesRequest extends js.Object {
  /**
    * The instance ID. If you use this parameter, DescribeVolumes returns descriptions of the volumes associated with the specified instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * The RAID array ID. If you use this parameter, DescribeVolumes returns descriptions of the volumes associated with the specified RAID array.
    */
  var RaidArrayId: js.UndefOr[String] = js.undefined
  /**
    * A stack ID. The action describes the stack's registered Amazon EBS volumes.
    */
  var StackId: js.UndefOr[String] = js.undefined
  /**
    * Am array of volume IDs. If you use this parameter, DescribeVolumes returns descriptions of the specified volumes. Otherwise, it returns a description of every volume.
    */
  var VolumeIds: js.UndefOr[Strings] = js.undefined
}

object DescribeVolumesRequest {
  @scala.inline
  def apply(
    InstanceId: String = null,
    RaidArrayId: String = null,
    StackId: String = null,
    VolumeIds: Strings = null
  ): DescribeVolumesRequest = {
    val __obj = js.Dynamic.literal()
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (RaidArrayId != null) __obj.updateDynamic("RaidArrayId")(RaidArrayId)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    if (VolumeIds != null) __obj.updateDynamic("VolumeIds")(VolumeIds)
    __obj.asInstanceOf[DescribeVolumesRequest]
  }
}

