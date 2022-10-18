package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBulkImportJobRequest extends StObject {
  
  /**
    * The ID of the job.
    */
  var jobId: ID
}
object DescribeBulkImportJobRequest {
  
  inline def apply(jobId: ID): DescribeBulkImportJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBulkImportJobRequest]
  }
  
  extension [Self <: DescribeBulkImportJobRequest](x: Self) {
    
    inline def setJobId(value: ID): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
