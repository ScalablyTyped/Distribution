package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartBackupJobOutput extends StObject {
  
  /**
    * Uniquely identifies a request to Backup to back up a resource.
    */
  var BackupJobId: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time that a backup job is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * This is a returned boolean value indicating this is a parent (composite) backup job.
    */
  var IsParent: js.UndefOr[scala.Boolean] = js.undefined
  
  /**
    *  Note: This field is only returned for Amazon EFS and Advanced DynamoDB resources.  An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: js.UndefOr[ARN] = js.undefined
}
object StartBackupJobOutput {
  
  inline def apply(): StartBackupJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartBackupJobOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartBackupJobOutput] (val x: Self) extends AnyVal {
    
    inline def setBackupJobId(value: String): Self = StObject.set(x, "BackupJobId", value.asInstanceOf[js.Any])
    
    inline def setBackupJobIdUndefined: Self = StObject.set(x, "BackupJobId", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setIsParent(value: scala.Boolean): Self = StObject.set(x, "IsParent", value.asInstanceOf[js.Any])
    
    inline def setIsParentUndefined: Self = StObject.set(x, "IsParent", js.undefined)
    
    inline def setRecoveryPointArn(value: ARN): Self = StObject.set(x, "RecoveryPointArn", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPointArnUndefined: Self = StObject.set(x, "RecoveryPointArn", js.undefined)
  }
}
