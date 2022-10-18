package typings.awsSdk.clientsHealthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFHIRExportJobRequest extends StObject {
  
  /**
    * The AWS generated ID for the Data Store from which files are being exported from for an export job.
    */
  var DatastoreId: typings.awsSdk.clientsHealthlakeMod.DatastoreId
  
  /**
    * The AWS generated ID for an export job.
    */
  var JobId: typings.awsSdk.clientsHealthlakeMod.JobId
}
object DescribeFHIRExportJobRequest {
  
  inline def apply(DatastoreId: DatastoreId, JobId: JobId): DescribeFHIRExportJobRequest = {
    val __obj = js.Dynamic.literal(DatastoreId = DatastoreId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFHIRExportJobRequest]
  }
  
  extension [Self <: DescribeFHIRExportJobRequest](x: Self) {
    
    inline def setDatastoreId(value: DatastoreId): Self = StObject.set(x, "DatastoreId", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
