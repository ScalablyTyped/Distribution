package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBackupVaultInput extends js.Object {
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: String = js.native
}

object DescribeBackupVaultInput {
  @scala.inline
  def apply(BackupVaultName: String): DescribeBackupVaultInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBackupVaultInput]
  }
  @scala.inline
  implicit class DescribeBackupVaultInputOps[Self <: DescribeBackupVaultInput] (val x: Self) extends AnyVal {
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
    def setBackupVaultName(value: String): Self = this.set("BackupVaultName", value.asInstanceOf[js.Any])
  }
  
}

