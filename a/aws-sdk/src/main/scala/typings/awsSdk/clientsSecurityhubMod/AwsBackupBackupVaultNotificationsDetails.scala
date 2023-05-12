package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsBackupBackupVaultNotificationsDetails extends StObject {
  
  /**
    * An array of events that indicate the status of jobs to back up resources to the backup vault. The following events are supported:    BACKUP_JOB_STARTED | BACKUP_JOB_COMPLETED     COPY_JOB_STARTED | COPY_JOB_SUCCESSFUL | COPY_JOB_FAILED     RESTORE_JOB_STARTED | RESTORE_JOB_COMPLETED | RECOVERY_POINT_MODIFIED     S3_BACKUP_OBJECT_FAILED | S3_RESTORE_OBJECT_FAILED   
    */
  var BackupVaultEvents: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the Amazon SNS topic for a backup vault's events. 
    */
  var SnsTopicArn: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsBackupBackupVaultNotificationsDetails {
  
  inline def apply(): AwsBackupBackupVaultNotificationsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsBackupBackupVaultNotificationsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsBackupBackupVaultNotificationsDetails] (val x: Self) extends AnyVal {
    
    inline def setBackupVaultEvents(value: NonEmptyStringList): Self = StObject.set(x, "BackupVaultEvents", value.asInstanceOf[js.Any])
    
    inline def setBackupVaultEventsUndefined: Self = StObject.set(x, "BackupVaultEvents", js.undefined)
    
    inline def setBackupVaultEventsVarargs(value: NonEmptyString*): Self = StObject.set(x, "BackupVaultEvents", js.Array(value*))
    
    inline def setSnsTopicArn(value: NonEmptyString): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicArnUndefined: Self = StObject.set(x, "SnsTopicArn", js.undefined)
  }
}
