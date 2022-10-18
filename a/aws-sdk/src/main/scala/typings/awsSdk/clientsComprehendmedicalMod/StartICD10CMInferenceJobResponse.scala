package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartICD10CMInferenceJobResponse extends StObject {
  
  /**
    * The identifier generated for the job. To get the status of a job, use this identifier with the StartICD10CMInferenceJob operation.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsComprehendmedicalMod.JobId] = js.undefined
}
object StartICD10CMInferenceJobResponse {
  
  inline def apply(): StartICD10CMInferenceJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartICD10CMInferenceJobResponse]
  }
  
  extension [Self <: StartICD10CMInferenceJobResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
