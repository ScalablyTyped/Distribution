package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBackupVaultAccessPolicyInput extends js.Object {
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typings.awsDashSdk.clientsBackupMod.BackupVaultName
}

object GetBackupVaultAccessPolicyInput {
  @scala.inline
  def apply(BackupVaultName: BackupVaultName): GetBackupVaultAccessPolicyInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName)
  
    __obj.asInstanceOf[GetBackupVaultAccessPolicyInput]
  }
}

