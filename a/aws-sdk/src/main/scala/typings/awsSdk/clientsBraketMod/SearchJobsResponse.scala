package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchJobsResponse extends StObject {
  
  /**
    * An array of JobSummary objects for devices that match the specified filter values.
    */
  var jobs: JobSummaryList
  
  /**
    * A token used for pagination of results, or null if there are no additional results. Use the token value in a subsequent request to continue results where the previous request ended.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object SearchJobsResponse {
  
  inline def apply(jobs: JobSummaryList): SearchJobsResponse = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setJobs(value: JobSummaryList): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsVarargs(value: JobSummary*): Self = StObject.set(x, "jobs", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
