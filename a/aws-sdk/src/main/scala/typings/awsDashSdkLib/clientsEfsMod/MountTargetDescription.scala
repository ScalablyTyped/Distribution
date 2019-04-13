package typings
package awsDashSdkLib.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountTargetDescription extends js.Object {
  /**
    * The ID of the file system for which the mount target is intended.
    */
  var FileSystemId: awsDashSdkLib.clientsEfsMod.FileSystemId
  /**
    * Address at which the file system can be mounted by using the mount target.
    */
  var IpAddress: js.UndefOr[IpAddress] = js.undefined
  /**
    * Lifecycle state of the mount target.
    */
  var LifeCycleState: awsDashSdkLib.clientsEfsMod.LifeCycleState
  /**
    * System-assigned mount target ID.
    */
  var MountTargetId: awsDashSdkLib.clientsEfsMod.MountTargetId
  /**
    * The ID of the network interface that Amazon EFS created when it created the mount target.
    */
  var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined
  /**
    * AWS account ID that owns the resource.
    */
  var OwnerId: js.UndefOr[AwsAccountId] = js.undefined
  /**
    * The ID of the mount target's subnet.
    */
  var SubnetId: awsDashSdkLib.clientsEfsMod.SubnetId
}

object MountTargetDescription {
  @scala.inline
  def apply(
    FileSystemId: FileSystemId,
    LifeCycleState: LifeCycleState,
    MountTargetId: MountTargetId,
    SubnetId: SubnetId,
    IpAddress: IpAddress = null,
    NetworkInterfaceId: NetworkInterfaceId = null,
    OwnerId: AwsAccountId = null
  ): MountTargetDescription = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId, LifeCycleState = LifeCycleState.asInstanceOf[js.Any], MountTargetId = MountTargetId, SubnetId = SubnetId)
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress)
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId)
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    __obj.asInstanceOf[MountTargetDescription]
  }
}

