package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBackupVaultsOutput extends js.Object {
  /**
    * An array of backup vault list members containing vault metadata, including Amazon Resource Name (ARN), display name, creation date, number of saved recovery points, and encryption information if the resources saved in the backup vault are encrypted.
    */
  var BackupVaultList: js.UndefOr[typings.awsSdk.backupMod.BackupVaultList] = js.native
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListBackupVaultsOutput {
  @scala.inline
  def apply(): ListBackupVaultsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupVaultsOutput]
  }
  @scala.inline
  implicit class ListBackupVaultsOutputOps[Self <: ListBackupVaultsOutput] (val x: Self) extends AnyVal {
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
    def setBackupVaultListVarargs(value: BackupVaultListMember*): Self = this.set("BackupVaultList", js.Array(value :_*))
    @scala.inline
    def setBackupVaultList(value: BackupVaultList): Self = this.set("BackupVaultList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupVaultList: Self = this.set("BackupVaultList", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

