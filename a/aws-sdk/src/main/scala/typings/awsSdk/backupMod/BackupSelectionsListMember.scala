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
  def apply(): BackupSelectionsListMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupSelectionsListMember]
  }
  @scala.inline
  implicit class BackupSelectionsListMemberOps[Self <: BackupSelectionsListMember] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackupPlanId(value: String): Self = this.set("BackupPlanId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupPlanId: Self = this.set("BackupPlanId", js.undefined)
    @scala.inline
    def setCreationDate(value: timestamp): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setCreatorRequestId(value: String): Self = this.set("CreatorRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatorRequestId: Self = this.set("CreatorRequestId", js.undefined)
    @scala.inline
    def setIamRoleArn(value: IAMRoleArn): Self = this.set("IamRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamRoleArn: Self = this.set("IamRoleArn", js.undefined)
    @scala.inline
    def setSelectionId(value: String): Self = this.set("SelectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionId: Self = this.set("SelectionId", js.undefined)
    @scala.inline
    def setSelectionName(value: BackupSelectionName): Self = this.set("SelectionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionName: Self = this.set("SelectionName", js.undefined)
  }
  
}

