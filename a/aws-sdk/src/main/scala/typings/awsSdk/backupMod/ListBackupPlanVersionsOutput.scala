package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBackupPlanVersionsOutput extends StObject {
  
  /**
    * An array of version list items containing metadata about your backup plans.
    */
  var BackupPlanVersionsList: js.UndefOr[typings.awsSdk.backupMod.BackupPlanVersionsList] = js.undefined
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListBackupPlanVersionsOutput {
  
  @scala.inline
  def apply(): ListBackupPlanVersionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupPlanVersionsOutput]
  }
  
  @scala.inline
  implicit class ListBackupPlanVersionsOutputMutableBuilder[Self <: ListBackupPlanVersionsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupPlanVersionsList(value: BackupPlanVersionsList): Self = StObject.set(x, "BackupPlanVersionsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPlanVersionsListUndefined: Self = StObject.set(x, "BackupPlanVersionsList", js.undefined)
    
    @scala.inline
    def setBackupPlanVersionsListVarargs(value: BackupPlansListMember*): Self = StObject.set(x, "BackupPlanVersionsList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
