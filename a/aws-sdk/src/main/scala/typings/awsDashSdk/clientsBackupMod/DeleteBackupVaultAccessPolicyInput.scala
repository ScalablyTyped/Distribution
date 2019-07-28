package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBackupVaultAccessPolicyInput extends js.Object {
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typings.awsDashSdk.clientsBackupMod.BackupVaultName
}

object DeleteBackupVaultAccessPolicyInput {
  @scala.inline
  def apply(BackupVaultName: BackupVaultName): DeleteBackupVaultAccessPolicyInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName)
  
    __obj.asInstanceOf[DeleteBackupVaultAccessPolicyInput]
  }
}

