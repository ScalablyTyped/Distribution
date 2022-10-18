package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImportJobRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  /**
    * The unique identifier for the job.
    */
  var JobId: string
}
object GetImportJobRequest {
  
  inline def apply(ApplicationId: string, JobId: string): GetImportJobRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImportJobRequest]
  }
  
  extension [Self <: GetImportJobRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: string): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
