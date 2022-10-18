package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobForDevicesResponse extends StObject {
  
  /**
    * A list of jobs.
    */
  var Jobs: JobList
}
object CreateJobForDevicesResponse {
  
  inline def apply(Jobs: JobList): CreateJobForDevicesResponse = {
    val __obj = js.Dynamic.literal(Jobs = Jobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobForDevicesResponse]
  }
  
  extension [Self <: CreateJobForDevicesResponse](x: Self) {
    
    inline def setJobs(value: JobList): Self = StObject.set(x, "Jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsVarargs(value: Job*): Self = StObject.set(x, "Jobs", js.Array(value*))
  }
}
