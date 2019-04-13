package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLocationEfsRequest extends js.Object {
  /**
    * The subnet and security group that the Amazon EFS file system uses.
    */
  var Ec2Config: awsDashSdkLib.clientsDatasyncMod.Ec2Config
  /**
    * The Amazon Resource Name (ARN) for the Amazon EFS file system.
    */
  var EfsFilesystemArn: awsDashSdkLib.clientsDatasyncMod.EfsFilesystemArn
  /**
    * A subdirectory in the location’s path. This subdirectory in the EFS file system is used to read data from the EFS source location or write data to the EFS destination. By default, AWS DataSync uses the root directory.
    */
  var Subdirectory: awsDashSdkLib.clientsDatasyncMod.Subdirectory
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
    Subdirectory: Subdirectory,
    Tags: TagList = null
  ): CreateLocationEfsRequest = {
    val __obj = js.Dynamic.literal(Ec2Config = Ec2Config, EfsFilesystemArn = EfsFilesystemArn, Subdirectory = Subdirectory)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateLocationEfsRequest]
  }
}

