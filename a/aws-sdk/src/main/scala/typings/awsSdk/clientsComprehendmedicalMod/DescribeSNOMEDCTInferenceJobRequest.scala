package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSNOMEDCTInferenceJobRequest extends StObject {
  
  /**
    *  The identifier that Amazon Comprehend Medical generated for the job. The StartSNOMEDCTInferenceJob operation returns this identifier in its response. 
    */
  var JobId: typings.awsSdk.clientsComprehendmedicalMod.JobId
}
object DescribeSNOMEDCTInferenceJobRequest {
  
  inline def apply(JobId: JobId): DescribeSNOMEDCTInferenceJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSNOMEDCTInferenceJobRequest]
  }
  
  extension [Self <: DescribeSNOMEDCTInferenceJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
