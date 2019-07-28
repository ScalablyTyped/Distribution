package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRecoveryPointRestoreMetadataInput extends js.Object {
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typings.awsDashSdk.clientsBackupMod.BackupVaultName
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: ARN
}

object GetRecoveryPointRestoreMetadataInput {
  @scala.inline
  def apply(BackupVaultName: BackupVaultName, RecoveryPointArn: ARN): GetRecoveryPointRestoreMetadataInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName, RecoveryPointArn = RecoveryPointArn)
  
    __obj.asInstanceOf[GetRecoveryPointRestoreMetadataInput]
  }
}

