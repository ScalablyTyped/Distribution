package typings.awsSdk.clientsHealthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartFHIRImportJobResponse extends StObject {
  
  /**
    * The AWS-generated Data Store ID.
    */
  var DatastoreId: js.UndefOr[typings.awsSdk.clientsHealthlakeMod.DatastoreId] = js.undefined
  
  /**
    * The AWS-generated job ID.
    */
  var JobId: typings.awsSdk.clientsHealthlakeMod.JobId
  
  /**
    * The status of an import job.
    */
  var JobStatus: typings.awsSdk.clientsHealthlakeMod.JobStatus
}
object StartFHIRImportJobResponse {
  
  inline def apply(JobId: JobId, JobStatus: JobStatus): StartFHIRImportJobResponse = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any], JobStatus = JobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFHIRImportJobResponse]
  }
  
  extension [Self <: StartFHIRImportJobResponse](x: Self) {
    
    inline def setDatastoreId(value: DatastoreId): Self = StObject.set(x, "DatastoreId", value.asInstanceOf[js.Any])
    
    inline def setDatastoreIdUndefined: Self = StObject.set(x, "DatastoreId", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
  }
}
