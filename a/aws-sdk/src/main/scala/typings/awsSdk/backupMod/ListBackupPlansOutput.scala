package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBackupPlansOutput extends js.Object {
  
  /**
    * An array of backup plan list items containing metadata about your saved backup plans.
    */
  var BackupPlansList: js.UndefOr[typings.awsSdk.backupMod.BackupPlansList] = js.native
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListBackupPlansOutput {
  
  @scala.inline
  def apply(): ListBackupPlansOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupPlansOutput]
  }
  
  @scala.inline
  implicit class ListBackupPlansOutputOps[Self <: ListBackupPlansOutput] (val x: Self) extends AnyVal {
    
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
    def setBackupPlansListVarargs(value: BackupPlansListMember*): Self = this.set("BackupPlansList", js.Array(value :_*))
    
    @scala.inline
    def setBackupPlansList(value: BackupPlansList): Self = this.set("BackupPlansList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupPlansList: Self = this.set("BackupPlansList", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
