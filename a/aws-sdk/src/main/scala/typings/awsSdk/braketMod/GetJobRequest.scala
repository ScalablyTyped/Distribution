package typings.awsSdk.braketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobRequest extends StObject {
  
  /**
    * The ARN of the job to retrieve.
    */
  var jobArn: JobArn
}
object GetJobRequest {
  
  inline def apply(jobArn: JobArn): GetJobRequest = {
    val __obj = js.Dynamic.literal(jobArn = jobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobRequest]
  }
  
  extension [Self <: GetJobRequest](x: Self) {
    
    inline def setJobArn(value: JobArn): Self = StObject.set(x, "jobArn", value.asInstanceOf[js.Any])
  }
}
