package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecoveryPointByResource extends StObject {
  
  /**
    * The size, in bytes, of a backup.
    */
  var BackupSizeBytes: js.UndefOr[Long_] = js.undefined
  
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Amazon Web Services Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: js.UndefOr[typings.awsSdk.clientsBackupMod.BackupVaultName] = js.undefined
  
  /**
    * The date and time a recovery point is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The server-side encryption key that is used to protect your backups; for example, arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.
    */
  var EncryptionKeyArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * This is a boolean value indicating this is a parent (composite) recovery point.
    */
  var IsParent: js.UndefOr[scala.Boolean] = js.undefined
  
  /**
    * This is the Amazon Resource Name (ARN) of the parent (composite) recovery point.
    */
  var ParentRecoveryPointArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * This is the non-unique name of the resource that belongs to the specified backup.
    */
  var ResourceName: js.UndefOr[String] = js.undefined
  
  /**
    * A status code specifying the state of the recovery point.
    */
  var Status: js.UndefOr[RecoveryPointStatus] = js.undefined
  
  /**
    * A message explaining the reason of the recovery point deletion failure.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
}
object RecoveryPointByResource {
  
  inline def apply(): RecoveryPointByResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecoveryPointByResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecoveryPointByResource] (val x: Self) extends AnyVal {
    
    inline def setBackupSizeBytes(value: Long_): Self = StObject.set(x, "BackupSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setBackupSizeBytesUndefined: Self = StObject.set(x, "BackupSizeBytes", js.undefined)
    
    inline def setBackupVaultName(value: BackupVaultName): Self = StObject.set(x, "BackupVaultName", value.asInstanceOf[js.Any])
    
    inline def setBackupVaultNameUndefined: Self = StObject.set(x, "BackupVaultName", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setEncryptionKeyArn(value: ARN): Self = StObject.set(x, "EncryptionKeyArn", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyArnUndefined: Self = StObject.set(x, "EncryptionKeyArn", js.undefined)
    
    inline def setIsParent(value: scala.Boolean): Self = StObject.set(x, "IsParent", value.asInstanceOf[js.Any])
    
    inline def setIsParentUndefined: Self = StObject.set(x, "IsParent", js.undefined)
    
    inline def setParentRecoveryPointArn(value: ARN): Self = StObject.set(x, "ParentRecoveryPointArn", value.asInstanceOf[js.Any])
    
    inline def setParentRecoveryPointArnUndefined: Self = StObject.set(x, "ParentRecoveryPointArn", js.undefined)
    
    inline def setRecoveryPointArn(value: ARN): Self = StObject.set(x, "RecoveryPointArn", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPointArnUndefined: Self = StObject.set(x, "RecoveryPointArn", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "ResourceName", js.undefined)
    
    inline def setStatus(value: RecoveryPointStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
