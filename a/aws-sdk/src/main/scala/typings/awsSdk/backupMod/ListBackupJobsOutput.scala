package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBackupJobsOutput extends StObject {
  
  /**
    * An array of structures containing metadata about your backup jobs returned in JSON format.
    */
  var BackupJobs: js.UndefOr[BackupJobsList] = js.undefined
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListBackupJobsOutput {
  
  inline def apply(): ListBackupJobsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupJobsOutput]
  }
  
  extension [Self <: ListBackupJobsOutput](x: Self) {
    
    inline def setBackupJobs(value: BackupJobsList): Self = StObject.set(x, "BackupJobs", value.asInstanceOf[js.Any])
    
    inline def setBackupJobsUndefined: Self = StObject.set(x, "BackupJobs", js.undefined)
    
    inline def setBackupJobsVarargs(value: BackupJob*): Self = StObject.set(x, "BackupJobs", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
