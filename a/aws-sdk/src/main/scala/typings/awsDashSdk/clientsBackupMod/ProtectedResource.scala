package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtectedResource extends js.Object {
  /**
    * The date and time a resource was last backed up, in Unix format and Coordinated Universal Time (UTC). The value of LastBackupTime is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var LastBackupTime: js.UndefOr[timestamp] = js.undefined
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var ResourceArn: js.UndefOr[ARN] = js.undefined
  /**
    * The type of AWS resource; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database.
    */
  var ResourceType: js.UndefOr[typings.awsDashSdk.clientsBackupMod.ResourceType] = js.undefined
}

object ProtectedResource {
  @scala.inline
  def apply(LastBackupTime: timestamp = null, ResourceArn: ARN = null, ResourceType: ResourceType = null): ProtectedResource = {
    val __obj = js.Dynamic.literal()
    if (LastBackupTime != null) __obj.updateDynamic("LastBackupTime")(LastBackupTime)
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    __obj.asInstanceOf[ProtectedResource]
  }
}

