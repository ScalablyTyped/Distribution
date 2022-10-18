package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBackupVaultNotificationsInput extends StObject {
  
  /**
    * An array of events that indicate the status of jobs to back up resources to the backup vault. For common use cases and code samples, see Using Amazon SNS to track Backup events. The following events are supported:    BACKUP_JOB_STARTED | BACKUP_JOB_COMPLETED     COPY_JOB_STARTED | COPY_JOB_SUCCESSFUL | COPY_JOB_FAILED     RESTORE_JOB_STARTED | RESTORE_JOB_COMPLETED | RECOVERY_POINT_MODIFIED     S3_BACKUP_OBJECT_FAILED | S3_RESTORE_OBJECT_FAILED     Ignore the list below because it includes deprecated events. Refer to the list above. 
    */
  var BackupVaultEvents: typings.awsSdk.clientsBackupMod.BackupVaultEvents
  
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Amazon Web Services Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typings.awsSdk.clientsBackupMod.BackupVaultName
  
  /**
    * The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events; for example, arn:aws:sns:us-west-2:111122223333:MyVaultTopic.
    */
  var SNSTopicArn: ARN
}
object PutBackupVaultNotificationsInput {
  
  inline def apply(BackupVaultEvents: BackupVaultEvents, BackupVaultName: BackupVaultName, SNSTopicArn: ARN): PutBackupVaultNotificationsInput = {
    val __obj = js.Dynamic.literal(BackupVaultEvents = BackupVaultEvents.asInstanceOf[js.Any], BackupVaultName = BackupVaultName.asInstanceOf[js.Any], SNSTopicArn = SNSTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBackupVaultNotificationsInput]
  }
  
  extension [Self <: PutBackupVaultNotificationsInput](x: Self) {
    
    inline def setBackupVaultEvents(value: BackupVaultEvents): Self = StObject.set(x, "BackupVaultEvents", value.asInstanceOf[js.Any])
    
    inline def setBackupVaultEventsVarargs(value: BackupVaultEvent*): Self = StObject.set(x, "BackupVaultEvents", js.Array(value*))
    
    inline def setBackupVaultName(value: BackupVaultName): Self = StObject.set(x, "BackupVaultName", value.asInstanceOf[js.Any])
    
    inline def setSNSTopicArn(value: ARN): Self = StObject.set(x, "SNSTopicArn", value.asInstanceOf[js.Any])
  }
}
