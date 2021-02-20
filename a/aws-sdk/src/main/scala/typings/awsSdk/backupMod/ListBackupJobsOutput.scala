package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBackupJobsOutput extends StObject {
  
  /**
    * An array of structures containing metadata about your backup jobs returned in JSON format.
    */
  var BackupJobs: js.UndefOr[BackupJobsList] = js.native
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListBackupJobsOutput {
  
  @scala.inline
  def apply(): ListBackupJobsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupJobsOutput]
  }
  
  @scala.inline
  implicit class ListBackupJobsOutputMutableBuilder[Self <: ListBackupJobsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupJobs(value: BackupJobsList): Self = StObject.set(x, "BackupJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupJobsUndefined: Self = StObject.set(x, "BackupJobs", js.undefined)
    
    @scala.inline
    def setBackupJobsVarargs(value: BackupJob*): Self = StObject.set(x, "BackupJobs", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
