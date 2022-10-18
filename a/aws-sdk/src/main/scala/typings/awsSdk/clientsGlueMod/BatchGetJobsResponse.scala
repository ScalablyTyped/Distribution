package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetJobsResponse extends StObject {
  
  /**
    * A list of job definitions.
    */
  var Jobs: js.UndefOr[JobList] = js.undefined
  
  /**
    * A list of names of jobs not found.
    */
  var JobsNotFound: js.UndefOr[JobNameList] = js.undefined
}
object BatchGetJobsResponse {
  
  inline def apply(): BatchGetJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetJobsResponse]
  }
  
  extension [Self <: BatchGetJobsResponse](x: Self) {
    
    inline def setJobs(value: JobList): Self = StObject.set(x, "Jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsNotFound(value: JobNameList): Self = StObject.set(x, "JobsNotFound", value.asInstanceOf[js.Any])
    
    inline def setJobsNotFoundUndefined: Self = StObject.set(x, "JobsNotFound", js.undefined)
    
    inline def setJobsNotFoundVarargs(value: NameString*): Self = StObject.set(x, "JobsNotFound", js.Array(value*))
    
    inline def setJobsUndefined: Self = StObject.set(x, "Jobs", js.undefined)
    
    inline def setJobsVarargs(value: Job*): Self = StObject.set(x, "Jobs", js.Array(value*))
  }
}
