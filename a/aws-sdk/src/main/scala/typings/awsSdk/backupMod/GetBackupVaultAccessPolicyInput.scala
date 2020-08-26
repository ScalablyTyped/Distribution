package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackupVaultAccessPolicyInput extends js.Object {
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typings.awsSdk.backupMod.BackupVaultName = js.native
}

object GetBackupVaultAccessPolicyInput {
  @scala.inline
  def apply(BackupVaultName: BackupVaultName): GetBackupVaultAccessPolicyInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackupVaultAccessPolicyInput]
  }
  @scala.inline
  implicit class GetBackupVaultAccessPolicyInputOps[Self <: GetBackupVaultAccessPolicyInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackupVaultName(value: BackupVaultName): Self = this.set("BackupVaultName", value.asInstanceOf[js.Any])
  }
  
}

