package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupSelectionsListMember extends StObject {
  
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[timestamp] = js.undefined
  
  /**
    * A unique string that identifies the request and allows failed requests to be retried without the risk of running the operation twice.
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
  def apply(): BackupSelectionsListMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupSelectionsListMember]
  }
  
  @scala.inline
  implicit class BackupSelectionsListMemberMutableBuilder[Self <: BackupSelectionsListMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupPlanId(value: String): Self = StObject.set(x, "BackupPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPlanIdUndefined: Self = StObject.set(x, "BackupPlanId", js.undefined)
    
    @scala.inline
    def setCreationDate(value: timestamp): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setCreatorRequestId(value: String): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
    
    @scala.inline
    def setIamRoleArn(value: IAMRoleArn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
    
    @scala.inline
    def setSelectionId(value: String): Self = StObject.set(x, "SelectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionIdUndefined: Self = StObject.set(x, "SelectionId", js.undefined)
    
    @scala.inline
    def setSelectionName(value: BackupSelectionName): Self = StObject.set(x, "SelectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionNameUndefined: Self = StObject.set(x, "SelectionName", js.undefined)
  }
}
