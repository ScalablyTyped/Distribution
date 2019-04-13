package typings
package awsDashSdkLib.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMountTargetRequest extends js.Object {
  /**
    * The ID of the file system for which to create the mount target.
    */
  var FileSystemId: awsDashSdkLib.clientsEfsMod.FileSystemId
  /**
    * Valid IPv4 address within the address range of the specified subnet.
    */
  var IpAddress: js.UndefOr[IpAddress] = js.undefined
  /**
    * Up to five VPC security group IDs, of the form sg-xxxxxxxx. These must be for the same VPC as subnet specified.
    */
  var SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined
  /**
    * The ID of the subnet to add the mount target in.
    */
  var SubnetId: awsDashSdkLib.clientsEfsMod.SubnetId
}

object CreateMountTargetRequest {
  @scala.inline
  def apply(
    FileSystemId: FileSystemId,
    SubnetId: SubnetId,
    IpAddress: IpAddress = null,
    SecurityGroups: SecurityGroups = null
  ): CreateMountTargetRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId, SubnetId = SubnetId)
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress)
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups)
    __obj.asInstanceOf[CreateMountTargetRequest]
  }
}

