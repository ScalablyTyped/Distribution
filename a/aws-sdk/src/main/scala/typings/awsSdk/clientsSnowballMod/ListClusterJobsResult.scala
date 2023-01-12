package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClusterJobsResult extends StObject {
  
  /**
    * Each JobListEntry object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of export jobs. 
    */
  var JobListEntries: js.UndefOr[JobListEntryList] = js.undefined
  
  /**
    * HTTP requests are stateless. If you use the automatically generated NextToken value in your next ListClusterJobsResult call, your list of returned jobs will start from this point in the array.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListClusterJobsResult {
  
  inline def apply(): ListClusterJobsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClusterJobsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListClusterJobsResult] (val x: Self) extends AnyVal {
    
    inline def setJobListEntries(value: JobListEntryList): Self = StObject.set(x, "JobListEntries", value.asInstanceOf[js.Any])
    
    inline def setJobListEntriesUndefined: Self = StObject.set(x, "JobListEntries", js.undefined)
    
    inline def setJobListEntriesVarargs(value: JobListEntry*): Self = StObject.set(x, "JobListEntries", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
