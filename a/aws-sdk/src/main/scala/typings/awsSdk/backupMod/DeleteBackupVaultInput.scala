package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBackupVaultInput extends StObject {
  
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Amazon Web Services Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: String
}
object DeleteBackupVaultInput {
  
  inline def apply(BackupVaultName: String): DeleteBackupVaultInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackupVaultInput]
  }
  
  extension [Self <: DeleteBackupVaultInput](x: Self) {
    
    inline def setBackupVaultName(value: String): Self = StObject.set(x, "BackupVaultName", value.asInstanceOf[js.Any])
  }
}
