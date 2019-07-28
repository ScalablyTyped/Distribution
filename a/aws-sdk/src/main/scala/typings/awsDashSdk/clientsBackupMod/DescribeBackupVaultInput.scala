package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBackupVaultInput extends js.Object {
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: String
}

object DescribeBackupVaultInput {
  @scala.inline
  def apply(BackupVaultName: String): DescribeBackupVaultInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName)
  
    __obj.asInstanceOf[DescribeBackupVaultInput]
  }
}

