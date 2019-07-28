package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBackupVaultInput extends js.Object {
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and theAWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: String
}

object DeleteBackupVaultInput {
  @scala.inline
  def apply(BackupVaultName: String): DeleteBackupVaultInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName)
  
    __obj.asInstanceOf[DeleteBackupVaultInput]
  }
}

