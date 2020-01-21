package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProtectedResourceOutput extends js.Object {
  /**
    * The date and time that a resource was last backed up, in Unix format and Coordinated Universal Time (UTC). The value of LastBackupTime is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var LastBackupTime: js.UndefOr[timestamp] = js.native
  /**
    * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var ResourceArn: js.UndefOr[ARN] = js.native
  /**
    * The type of AWS resource saved as a recovery point; for example, an EBS volume or an Amazon RDS database.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.backupMod.ResourceType] = js.native
}

object DescribeProtectedResourceOutput {
  @scala.inline
  def apply(LastBackupTime: timestamp = null, ResourceArn: ARN = null, ResourceType: ResourceType = null): DescribeProtectedResourceOutput = {
    val __obj = js.Dynamic.literal()
    if (LastBackupTime != null) __obj.updateDynamic("LastBackupTime")(LastBackupTime.asInstanceOf[js.Any])
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProtectedResourceOutput]
  }
}

