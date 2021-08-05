package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBackupVaultAccessPolicyInput extends StObject {
  
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typings.awsSdk.backupMod.BackupVaultName
  
  /**
    * The backup vault access policy document in JSON format.
    */
  var Policy: js.UndefOr[IAMPolicy] = js.undefined
}
object PutBackupVaultAccessPolicyInput {
  
  inline def apply(BackupVaultName: BackupVaultName): PutBackupVaultAccessPolicyInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBackupVaultAccessPolicyInput]
  }
  
  extension [Self <: PutBackupVaultAccessPolicyInput](x: Self) {
    
    inline def setBackupVaultName(value: BackupVaultName): Self = StObject.set(x, "BackupVaultName", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: IAMPolicy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
