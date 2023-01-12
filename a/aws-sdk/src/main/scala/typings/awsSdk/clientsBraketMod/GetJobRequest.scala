package typings.awsSdk.clientsBraketMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJobArn(value: JobArn): Self = StObject.set(x, "jobArn", value.asInstanceOf[js.Any])
  }
}
