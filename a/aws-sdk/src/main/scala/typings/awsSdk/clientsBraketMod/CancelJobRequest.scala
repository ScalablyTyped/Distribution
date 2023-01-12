package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelJobRequest extends StObject {
  
  /**
    * The ARN of the Amazon Braket job to cancel.
    */
  var jobArn: JobArn
}
object CancelJobRequest {
  
  inline def apply(jobArn: JobArn): CancelJobRequest = {
    val __obj = js.Dynamic.literal(jobArn = jobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJobArn(value: JobArn): Self = StObject.set(x, "jobArn", value.asInstanceOf[js.Any])
  }
}
