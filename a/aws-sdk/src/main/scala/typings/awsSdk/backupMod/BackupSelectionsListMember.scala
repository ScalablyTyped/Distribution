package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupSelectionsListMember extends js.Object {
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: js.UndefOr[String] = js.native
  /**
    * The date and time a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[timestamp] = js.native
  /**
    * A unique string that identifies the request and allows failed requests to be retried without the risk of executing the operation twice.
    */
  var CreatorRequestId: js.UndefOr[String] = js.native
  /**
    * Specifies the IAM role Amazon Resource Name (ARN) to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: js.UndefOr[IAMRoleArn] = js.native
  /**
    * Uniquely identifies a request to assign a set of resources to a backup plan.
    */
  var SelectionId: js.UndefOr[String] = js.native
  /**
    * The display name of a resource selection document.
    */
  var SelectionName: js.UndefOr[BackupSelectionName] = js.native
}

object BackupSelectionsListMember {
  @scala.inline
  def apply(
    BackupPlanId: String = null,
    CreationDate: timestamp = null,
    CreatorRequestId: String = null,
    IamRoleArn: IAMRoleArn = null,
    SelectionId: String = null,
    SelectionName: BackupSelectionName = null
  ): BackupSelectionsListMember = {
    val __obj = js.Dynamic.literal()
    if (BackupPlanId != null) __obj.updateDynamic("BackupPlanId")(BackupPlanId.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId.asInstanceOf[js.Any])
    if (IamRoleArn != null) __obj.updateDynamic("IamRoleArn")(IamRoleArn.asInstanceOf[js.Any])
    if (SelectionId != null) __obj.updateDynamic("SelectionId")(SelectionId.asInstanceOf[js.Any])
    if (SelectionName != null) __obj.updateDynamic("SelectionName")(SelectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupSelectionsListMember]
  }
}

