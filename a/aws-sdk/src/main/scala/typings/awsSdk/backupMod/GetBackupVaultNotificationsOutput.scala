package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBackupVaultNotificationsOutput extends StObject {
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var BackupVaultArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * An array of events that indicate the status of jobs to back up resources to the backup vault.
    */
  var BackupVaultEvents: js.UndefOr[typings.awsSdk.backupMod.BackupVaultEvents] = js.undefined
  
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: js.UndefOr[typings.awsSdk.backupMod.BackupVaultName] = js.undefined
  
  /**
    * An ARN that uniquely identifies an Amazon Simple Notification Service (Amazon SNS) topic; for example, arn:aws:sns:us-west-2:111122223333:MyTopic.
    */
  var SNSTopicArn: js.UndefOr[ARN] = js.undefined
}
object GetBackupVaultNotificationsOutput {
  
  inline def apply(): GetBackupVaultNotificationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackupVaultNotificationsOutput]
  }
  
  extension [Self <: GetBackupVaultNotificationsOutput](x: Self) {
    
    inline def setBackupVaultArn(value: ARN): Self = StObject.set(x, "BackupVaultArn", value.asInstanceOf[js.Any])
    
    inline def setBackupVaultArnUndefined: Self = StObject.set(x, "BackupVaultArn", js.undefined)
    
    inline def setBackupVaultEvents(value: BackupVaultEvents): Self = StObject.set(x, "BackupVaultEvents", value.asInstanceOf[js.Any])
    
    inline def setBackupVaultEventsUndefined: Self = StObject.set(x, "BackupVaultEvents", js.undefined)
    
    inline def setBackupVaultEventsVarargs(value: BackupVaultEvent*): Self = StObject.set(x, "BackupVaultEvents", js.Array(value*))
    
    inline def setBackupVaultName(value: BackupVaultName): Self = StObject.set(x, "BackupVaultName", value.asInstanceOf[js.Any])
    
    inline def setBackupVaultNameUndefined: Self = StObject.set(x, "BackupVaultName", js.undefined)
    
    inline def setSNSTopicArn(value: ARN): Self = StObject.set(x, "SNSTopicArn", value.asInstanceOf[js.Any])
    
    inline def setSNSTopicArnUndefined: Self = StObject.set(x, "SNSTopicArn", js.undefined)
  }
}
