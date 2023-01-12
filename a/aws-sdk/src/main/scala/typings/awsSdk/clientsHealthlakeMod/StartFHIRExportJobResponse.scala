package typings.awsSdk.clientsHealthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartFHIRExportJobResponse extends StObject {
  
  /**
    * The AWS generated ID for the Data Store from which files are being exported for an export job.
    */
  var DatastoreId: js.UndefOr[typings.awsSdk.clientsHealthlakeMod.DatastoreId] = js.undefined
  
  /**
    * The AWS generated ID for an export job.
    */
  var JobId: typings.awsSdk.clientsHealthlakeMod.JobId
  
  /**
    * The status of a FHIR export job. Possible statuses are SUBMITTED, IN_PROGRESS, COMPLETED, or FAILED.
    */
  var JobStatus: typings.awsSdk.clientsHealthlakeMod.JobStatus
}
object StartFHIRExportJobResponse {
  
  inline def apply(JobId: JobId, JobStatus: JobStatus): StartFHIRExportJobResponse = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any], JobStatus = JobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFHIRExportJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartFHIRExportJobResponse] (val x: Self) extends AnyVal {
    
    inline def setDatastoreId(value: DatastoreId): Self = StObject.set(x, "DatastoreId", value.asInstanceOf[js.Any])
    
    inline def setDatastoreIdUndefined: Self = StObject.set(x, "DatastoreId", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
  }
}
