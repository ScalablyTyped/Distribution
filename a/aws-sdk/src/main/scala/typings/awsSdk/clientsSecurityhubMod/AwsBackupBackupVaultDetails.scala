package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsBackupBackupVaultDetails extends StObject {
  
  /**
    * A resource-based policy that is used to manage access permissions on the target backup vault. 
    */
  var AccessPolicy: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup vault. 
    */
  var BackupVaultArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the Amazon Web Services account used to create them and the Amazon Web Services Region where they are created. They consist of lowercase letters, numbers, and hyphens. 
    */
  var BackupVaultName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The unique ARN associated with the server-side encryption key. You can specify a key to encrypt your backups from services that support full Backup management. If you do not specify a key, Backup creates an KMS key for you by default. 
    */
  var EncryptionKeyArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Amazon SNS event notifications for the specified backup vault. 
    */
  var Notifications: js.UndefOr[AwsBackupBackupVaultNotificationsDetails] = js.undefined
}
object AwsBackupBackupVaultDetails {
  
  inline def apply(): AwsBackupBackupVaultDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsBackupBackupVaultDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsBackupBackupVaultDetails] (val x: Self) extends AnyVal {
    
    inline def setAccessPolicy(value: NonEmptyString): Self = StObject.set(x, "AccessPolicy", value.asInstanceOf[js.Any])
    
    inline def setAccessPolicyUndefined: Self = StObject.set(x, "AccessPolicy", js.undefined)
    
    inline def setBackupVaultArn(value: NonEmptyString): Self = StObject.set(x, "BackupVaultArn", value.asInstanceOf[js.Any])
    
    inline def setBackupVaultArnUndefined: Self = StObject.set(x, "BackupVaultArn", js.undefined)
    
    inline def setBackupVaultName(value: NonEmptyString): Self = StObject.set(x, "BackupVaultName", value.asInstanceOf[js.Any])
    
    inline def setBackupVaultNameUndefined: Self = StObject.set(x, "BackupVaultName", js.undefined)
    
    inline def setEncryptionKeyArn(value: NonEmptyString): Self = StObject.set(x, "EncryptionKeyArn", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyArnUndefined: Self = StObject.set(x, "EncryptionKeyArn", js.undefined)
    
    inline def setNotifications(value: AwsBackupBackupVaultNotificationsDetails): Self = StObject.set(x, "Notifications", value.asInstanceOf[js.Any])
    
    inline def setNotificationsUndefined: Self = StObject.set(x, "Notifications", js.undefined)
  }
}
