package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBackupVaultLockConfigurationInput extends StObject {
  
  /**
    * The name of the backup vault from which to delete Backup Vault Lock.
    */
  var BackupVaultName: typings.awsSdk.backupMod.BackupVaultName
}
object DeleteBackupVaultLockConfigurationInput {
  
  inline def apply(BackupVaultName: BackupVaultName): DeleteBackupVaultLockConfigurationInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackupVaultLockConfigurationInput]
  }
  
  extension [Self <: DeleteBackupVaultLockConfigurationInput](x: Self) {
    
    inline def setBackupVaultName(value: BackupVaultName): Self = StObject.set(x, "BackupVaultName", value.asInstanceOf[js.Any])
  }
}
