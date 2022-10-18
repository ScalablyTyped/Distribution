package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobDetailsInput extends StObject {
  
  /**
    * The unique system-generated ID for the job.
    */
  var jobId: JobId
}
object GetJobDetailsInput {
  
  inline def apply(jobId: JobId): GetJobDetailsInput = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobDetailsInput]
  }
  
  extension [Self <: GetJobDetailsInput](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
