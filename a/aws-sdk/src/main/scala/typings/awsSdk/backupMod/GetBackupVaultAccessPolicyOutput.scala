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
  def apply(BackupVaultArn: ARN = null, BackupVaultName: BackupVaultName = null, Policy: IAMPolicy = null): GetBackupVaultAccessPolicyOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupVaultArn != null) __obj.updateDynamic("BackupVaultArn")(BackupVaultArn.asInstanceOf[js.Any])
    if (BackupVaultName != null) __obj.updateDynamic("BackupVaultName")(BackupVaultName.asInstanceOf[js.Any])
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackupVaultAccessPolicyOutput]
  }
}

