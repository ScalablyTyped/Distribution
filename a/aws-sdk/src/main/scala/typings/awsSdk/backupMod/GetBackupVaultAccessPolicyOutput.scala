package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackupVaultAccessPolicyOutput extends js.Object {
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var BackupVaultArn: js.UndefOr[ARN] = js.native
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: js.UndefOr[typings.awsSdk.backupMod.BackupVaultName] = js.native
  /**
    * The backup vault access policy document in JSON format.
    */
  var Policy: js.UndefOr[IAMPolicy] = js.native
}

object GetBackupVaultAccessPolicyOutput {
  @scala.inline
  def apply(): GetBackupVaultAccessPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackupVaultAccessPolicyOutput]
  }
  @scala.inline
  implicit class GetBackupVaultAccessPolicyOutputOps[Self <: GetBackupVaultAccessPolicyOutput] (val x: Self) extends AnyVal {
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
    def setBackupVaultArn(value: ARN): Self = this.set("BackupVaultArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupVaultArn: Self = this.set("BackupVaultArn", js.undefined)
    @scala.inline
    def setBackupVaultName(value: BackupVaultName): Self = this.set("BackupVaultName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupVaultName: Self = this.set("BackupVaultName", js.undefined)
    @scala.inline
    def setPolicy(value: IAMPolicy): Self = this.set("Policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("Policy", js.undefined)
  }
  
}

