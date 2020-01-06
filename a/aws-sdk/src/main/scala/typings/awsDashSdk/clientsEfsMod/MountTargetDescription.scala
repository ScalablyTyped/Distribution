package typings.awsDashSdk.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MountTargetDescription extends js.Object {
  /**
    * The ID of the file system for which the mount target is intended.
    */
  var FileSystemId: typings.awsDashSdk.clientsEfsMod.FileSystemId = js.native
  /**
    * Address at which the file system can be mounted by using the mount target.
    */
  var IpAddress: js.UndefOr[typings.awsDashSdk.clientsEfsMod.IpAddress] = js.native
  /**
    * Lifecycle state of the mount target.
    */
  var LifeCycleState: typings.awsDashSdk.clientsEfsMod.LifeCycleState = js.native
  /**
    * System-assigned mount target ID.
    */
  var MountTargetId: typings.awsDashSdk.clientsEfsMod.MountTargetId = js.native
  /**
    * The ID of the network interface that Amazon EFS created when it created the mount target.
    */
  var NetworkInterfaceId: js.UndefOr[typings.awsDashSdk.clientsEfsMod.NetworkInterfaceId] = js.native
  /**
    * AWS account ID that owns the resource.
    */
  var OwnerId: js.UndefOr[AwsAccountId] = js.native
  /**
    * The ID of the mount target's subnet.
    */
  var SubnetId: typings.awsDashSdk.clientsEfsMod.SubnetId = js.native
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
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], LifeCycleState = LifeCycleState.asInstanceOf[js.Any], MountTargetId = MountTargetId.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any])
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountTargetDescription]
  }
}

