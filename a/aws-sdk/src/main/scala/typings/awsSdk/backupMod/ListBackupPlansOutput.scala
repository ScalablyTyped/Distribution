package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBackupPlansOutput extends StObject {
  
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
  implicit class ListBackupPlansOutputMutableBuilder[Self <: ListBackupPlansOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupPlansList(value: BackupPlansList): Self = StObject.set(x, "BackupPlansList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPlansListUndefined: Self = StObject.set(x, "BackupPlansList", js.undefined)
    
    @scala.inline
    def setBackupPlansListVarargs(value: BackupPlansListMember*): Self = StObject.set(x, "BackupPlansList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
