package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBackupVaultLockConfigurationInput extends StObject {
  
  /**
    * The Backup Vault Lock configuration that specifies the name of the backup vault it protects.
    */
  var BackupVaultName: typings.awsSdk.clientsBackupMod.BackupVaultName
  
  /**
    * The Backup Vault Lock configuration that specifies the number of days before the lock date. For example, setting ChangeableForDays to 30 on Jan. 1, 2022 at 8pm UTC will set the lock date to Jan. 31, 2022 at 8pm UTC. Backup enforces a 72-hour cooling-off period before Vault Lock takes effect and becomes immutable. Therefore, you must set ChangeableForDays to 3 or greater. Before the lock date, you can delete Vault Lock from the vault using DeleteBackupVaultLockConfiguration or change the Vault Lock configuration using PutBackupVaultLockConfiguration. On and after the lock date, the Vault Lock becomes immutable and cannot be changed or deleted. If this parameter is not specified, you can delete Vault Lock from the vault using DeleteBackupVaultLockConfiguration or change the Vault Lock configuration using PutBackupVaultLockConfiguration at any time.
    */
  var ChangeableForDays: js.UndefOr[Long_] = js.undefined
  
  /**
    * The Backup Vault Lock configuration that specifies the maximum retention period that the vault retains its recovery points. This setting can be useful if, for example, your organization's policies require you to destroy certain data after retaining it for four years (1460 days). If this parameter is not included, Vault Lock does not enforce a maximum retention period on the recovery points in the vault. If this parameter is included without a value, Vault Lock will not enforce a maximum retention period. If this parameter is specified, any backup or copy job to the vault must have a lifecycle policy with a retention period equal to or shorter than the maximum retention period. If the job's retention period is longer than that maximum retention period, then the vault fails the backup or copy job, and you should either modify your lifecycle settings or use a different vault. The longest maximum retention period you can specify is 36500 days (approximately 100 years). Recovery points already saved in the vault prior to Vault Lock are not affected.
    */
  var MaxRetentionDays: js.UndefOr[Long_] = js.undefined
  
  /**
    * The Backup Vault Lock configuration that specifies the minimum retention period that the vault retains its recovery points. This setting can be useful if, for example, your organization's policies require you to retain certain data for at least seven years (2555 days). If this parameter is not specified, Vault Lock will not enforce a minimum retention period. If this parameter is specified, any backup or copy job to the vault must have a lifecycle policy with a retention period equal to or longer than the minimum retention period. If the job's retention period is shorter than that minimum retention period, then the vault fails that backup or copy job, and you should either modify your lifecycle settings or use a different vault. The shortest minimum retention period you can specify is 1 day. Recovery points already saved in the vault prior to Vault Lock are not affected.
    */
  var MinRetentionDays: js.UndefOr[Long_] = js.undefined
}
object PutBackupVaultLockConfigurationInput {
  
  inline def apply(BackupVaultName: BackupVaultName): PutBackupVaultLockConfigurationInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBackupVaultLockConfigurationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutBackupVaultLockConfigurationInput] (val x: Self) extends AnyVal {
    
    inline def setBackupVaultName(value: BackupVaultName): Self = StObject.set(x, "BackupVaultName", value.asInstanceOf[js.Any])
    
    inline def setChangeableForDays(value: Long_): Self = StObject.set(x, "ChangeableForDays", value.asInstanceOf[js.Any])
    
    inline def setChangeableForDaysUndefined: Self = StObject.set(x, "ChangeableForDays", js.undefined)
    
    inline def setMaxRetentionDays(value: Long_): Self = StObject.set(x, "MaxRetentionDays", value.asInstanceOf[js.Any])
    
    inline def setMaxRetentionDaysUndefined: Self = StObject.set(x, "MaxRetentionDays", js.undefined)
    
    inline def setMinRetentionDays(value: Long_): Self = StObject.set(x, "MinRetentionDays", value.asInstanceOf[js.Any])
    
    inline def setMinRetentionDaysUndefined: Self = StObject.set(x, "MinRetentionDays", js.undefined)
  }
}
