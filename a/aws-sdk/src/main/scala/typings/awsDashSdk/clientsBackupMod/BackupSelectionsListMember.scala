package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupSelectionsListMember extends js.Object {
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: js.UndefOr[String] = js.undefined
  /**
    * The date and time a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[timestamp] = js.undefined
  /**
    * A unique string that identifies the request and allows failed requests to be retried without the risk of executing the operation twice.
    */
  var CreatorRequestId: js.UndefOr[String] = js.undefined
  /**
    * Specifies the IAM role Amazon Resource Name (ARN) to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: js.UndefOr[IAMRoleArn] = js.undefined
  /**
    * Uniquely identifies a request to assign a set of resources to a backup plan.
    */
  var SelectionId: js.UndefOr[String] = js.undefined
  /**
    * The display name of a resource selection document.
    */
  var SelectionName: js.UndefOr[BackupSelectionName] = js.undefined
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
    if (BackupPlanId != null) __obj.updateDynamic("BackupPlanId")(BackupPlanId)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId)
    if (IamRoleArn != null) __obj.updateDynamic("IamRoleArn")(IamRoleArn)
    if (SelectionId != null) __obj.updateDynamic("SelectionId")(SelectionId)
    if (SelectionName != null) __obj.updateDynamic("SelectionName")(SelectionName)
    __obj.asInstanceOf[BackupSelectionsListMember]
  }
}

