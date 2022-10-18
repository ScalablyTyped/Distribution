package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupVaultListMember extends StObject {
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var BackupVaultArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Amazon Web Services Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: js.UndefOr[typings.awsSdk.clientsBackupMod.BackupVaultName] = js.undefined
  
  /**
    * The date and time a resource backup is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A unique string that identifies the request and allows failed requests to be retried without the risk of running the operation twice. This parameter is optional. If used, this parameter must contain 1 to 50 alphanumeric or '-_.' characters.
    */
  var CreatorRequestId: js.UndefOr[String] = js.undefined
  
  /**
    * A server-side encryption key you can specify to encrypt your backups from services that support full Backup management; for example, arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab. If you specify a key, you must specify its ARN, not its alias. If you do not specify a key, Backup creates a KMS key for you by default. To learn which Backup services support full Backup management and how Backup handles encryption for backups from services that do not yet support full Backup, see  Encryption for backups in Backup 
    */
  var EncryptionKeyArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The date and time when Backup Vault Lock configuration becomes immutable, meaning it cannot be changed or deleted. If you applied Vault Lock to your vault without specifying a lock date, you can change your Vault Lock settings, or delete Vault Lock from the vault entirely, at any time. This value is in Unix format, Coordinated Universal Time (UTC), and accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var LockDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A Boolean value that indicates whether Backup Vault Lock applies to the selected backup vault. If true, Vault Lock prevents delete and update operations on the recovery points in the selected vault.
    */
  var Locked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Backup Vault Lock setting that specifies the maximum retention period that the vault retains its recovery points. If this parameter is not specified, Vault Lock does not enforce a maximum retention period on the recovery points in the vault (allowing indefinite storage). If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period equal to or shorter than the maximum retention period. If the job's retention period is longer than that maximum retention period, then the vault fails the backup or copy job, and you should either modify your lifecycle settings or use a different vault. Recovery points already stored in the vault prior to Vault Lock are not affected.
    */
  var MaxRetentionDays: js.UndefOr[Long_] = js.undefined
  
  /**
    * The Backup Vault Lock setting that specifies the minimum retention period that the vault retains its recovery points. If this parameter is not specified, Vault Lock does not enforce a minimum retention period. If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period equal to or longer than the minimum retention period. If the job's retention period is shorter than that minimum retention period, then the vault fails the backup or copy job, and you should either modify your lifecycle settings or use a different vault. Recovery points already stored in the vault prior to Vault Lock are not affected.
    */
  var MinRetentionDays: js.UndefOr[Long_] = js.undefined
  
  /**
    * The number of recovery points that are stored in a backup vault.
    */
  var NumberOfRecoveryPoints: js.UndefOr[long] = js.undefined
}
object BackupVaultListMember {
  
  inline def apply(): BackupVaultListMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupVaultListMember]
  }
  
  extension [Self <: BackupVaultListMember](x: Self) {
    
    inline def setBackupVaultArn(value: ARN): Self = StObject.set(x, "BackupVaultArn", value.asInstanceOf[js.Any])
    
    inline def setBackupVaultArnUndefined: Self = StObject.set(x, "BackupVaultArn", js.undefined)
    
    inline def setBackupVaultName(value: BackupVaultName): Self = StObject.set(x, "BackupVaultName", value.asInstanceOf[js.Any])
    
    inline def setBackupVaultNameUndefined: Self = StObject.set(x, "BackupVaultName", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setCreatorRequestId(value: String): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    inline def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
    
    inline def setEncryptionKeyArn(value: ARN): Self = StObject.set(x, "EncryptionKeyArn", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyArnUndefined: Self = StObject.set(x, "EncryptionKeyArn", js.undefined)
    
    inline def setLockDate(value: js.Date): Self = StObject.set(x, "LockDate", value.asInstanceOf[js.Any])
    
    inline def setLockDateUndefined: Self = StObject.set(x, "LockDate", js.undefined)
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "Locked", value.asInstanceOf[js.Any])
    
    inline def setLockedUndefined: Self = StObject.set(x, "Locked", js.undefined)
    
    inline def setMaxRetentionDays(value: Long_): Self = StObject.set(x, "MaxRetentionDays", value.asInstanceOf[js.Any])
    
    inline def setMaxRetentionDaysUndefined: Self = StObject.set(x, "MaxRetentionDays", js.undefined)
    
    inline def setMinRetentionDays(value: Long_): Self = StObject.set(x, "MinRetentionDays", value.asInstanceOf[js.Any])
    
    inline def setMinRetentionDaysUndefined: Self = StObject.set(x, "MinRetentionDays", js.undefined)
    
    inline def setNumberOfRecoveryPoints(value: long): Self = StObject.set(x, "NumberOfRecoveryPoints", value.asInstanceOf[js.Any])
    
    inline def setNumberOfRecoveryPointsUndefined: Self = StObject.set(x, "NumberOfRecoveryPoints", js.undefined)
  }
}
