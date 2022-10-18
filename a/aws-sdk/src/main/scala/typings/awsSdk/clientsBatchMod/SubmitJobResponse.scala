package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubmitJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the job.
    */
  var jobArn: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier for the job.
    */
  var jobId: String
  
  /**
    * The name of the job.
    */
  var jobName: String
}
object SubmitJobResponse {
  
  inline def apply(jobId: String, jobName: String): SubmitJobResponse = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitJobResponse]
  }
  
  extension [Self <: SubmitJobResponse](x: Self) {
    
    inline def setJobArn(value: String): Self = StObject.set(x, "jobArn", value.asInstanceOf[js.Any])
    
    inline def setJobArnUndefined: Self = StObject.set(x, "jobArn", js.undefined)
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
  }
}
