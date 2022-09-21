package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobDetails extends StObject {
  
  /**
    * A timestamp of when the job was completed.
    */
  var completedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The job error for the policy generation request.
    */
  var jobError: js.UndefOr[JobError] = js.undefined
  
  /**
    * The JobId that is returned by the StartPolicyGeneration operation. The JobId can be used with GetGeneratedPolicy to retrieve the generated policies or used with CancelPolicyGeneration to cancel the policy generation request.
    */
  var jobId: JobId
  
  /**
    * A timestamp of when the job was started.
    */
  var startedOn: js.Date
  
  /**
    * The status of the job request.
    */
  var status: JobStatus
}
object JobDetails {
  
  inline def apply(jobId: JobId, startedOn: js.Date, status: JobStatus): JobDetails = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], startedOn = startedOn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDetails]
  }
  
  extension [Self <: JobDetails](x: Self) {
    
    inline def setCompletedOn(value: js.Date): Self = StObject.set(x, "completedOn", value.asInstanceOf[js.Any])
    
    inline def setCompletedOnUndefined: Self = StObject.set(x, "completedOn", js.undefined)
    
    inline def setJobError(value: JobError): Self = StObject.set(x, "jobError", value.asInstanceOf[js.Any])
    
    inline def setJobErrorUndefined: Self = StObject.set(x, "jobError", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setStartedOn(value: js.Date): Self = StObject.set(x, "startedOn", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
