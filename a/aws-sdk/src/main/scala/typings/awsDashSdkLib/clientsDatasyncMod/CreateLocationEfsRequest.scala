package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLocationEfsRequest extends js.Object {
  /**
    * The subnet and security group that the Amazon EFS file system uses. The security group that you provide needs to be able to communicate with the security group on the mount target in the subnet specified. The exact relationship between security group M (of the mount target) and security group S (which you provide for DataSync to use at this stage) is as follows:     Security group M (which you associate with the mount target) must allow inbound access for the Transmission Control Protocol (TCP) on the NFS port (2049) from security group S. You can enable inbound connections either by IP address (CIDR range) or security group.    Security group S (provided to DataSync to access EFS) should have a rule that enables outbound connections to the NFS port on one of the file system’s mount targets. You can enable outbound connections either by IP address (CIDR range) or security group. For information about security groups and mount targets, see "https://docs.aws.amazon.com/efs/latest/ug/security-considerations.html#network-access" (Security Groups for Amazon EC2 Instances and Mount Targets) in the Amazon EFS User Guide.  
    */
  var Ec2Config: awsDashSdkLib.clientsDatasyncMod.Ec2Config
  /**
    * The Amazon Resource Name (ARN) for the Amazon EFS file system.
    */
  var EfsFilesystemArn: awsDashSdkLib.clientsDatasyncMod.EfsFilesystemArn
  /**
    * A subdirectory in the location’s path. This subdirectory in the EFS file system is used to read data from the EFS source location or write data to the EFS destination. By default, AWS DataSync uses the root directory.
    */
  var Subdirectory: js.UndefOr[Subdirectory] = js.undefined
  /**
    * The key-value pair that represents a tag that you want to add to the resource. The value can be an empty string. This value helps you manage, filter, and search for your resources. We recommend that you create a name tag for your location.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateLocationEfsRequest {
  @scala.inline
  def apply(
    Ec2Config: Ec2Config,
    EfsFilesystemArn: EfsFilesystemArn,
    Subdirectory: Subdirectory = null,
    Tags: TagList = null
  ): CreateLocationEfsRequest = {
    val __obj = js.Dynamic.literal(Ec2Config = Ec2Config, EfsFilesystemArn = EfsFilesystemArn)
    if (Subdirectory != null) __obj.updateDynamic("Subdirectory")(Subdirectory)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateLocationEfsRequest]
  }
}

