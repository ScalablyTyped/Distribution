package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCopyJobsOutput extends StObject {
  
  /**
    * An array of structures containing metadata about your copy jobs returned in JSON format. 
    */
  var CopyJobs: js.UndefOr[CopyJobsList] = js.undefined
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListCopyJobsOutput {
  
  inline def apply(): ListCopyJobsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCopyJobsOutput]
  }
  
  extension [Self <: ListCopyJobsOutput](x: Self) {
    
    inline def setCopyJobs(value: CopyJobsList): Self = StObject.set(x, "CopyJobs", value.asInstanceOf[js.Any])
    
    inline def setCopyJobsUndefined: Self = StObject.set(x, "CopyJobs", js.undefined)
    
    inline def setCopyJobsVarargs(value: CopyJob*): Self = StObject.set(x, "CopyJobs", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
