package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelJobResponse extends StObject {
  
  /**
    * The status of the job cancellation request.
    */
  var cancellationStatus: CancellationStatus
  
  /**
    * The ARN of the Amazon Braket job.
    */
  var jobArn: JobArn
}
object CancelJobResponse {
  
  inline def apply(cancellationStatus: CancellationStatus, jobArn: JobArn): CancelJobResponse = {
    val __obj = js.Dynamic.literal(cancellationStatus = cancellationStatus.asInstanceOf[js.Any], jobArn = jobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelJobResponse] (val x: Self) extends AnyVal {
    
    inline def setCancellationStatus(value: CancellationStatus): Self = StObject.set(x, "cancellationStatus", value.asInstanceOf[js.Any])
    
    inline def setJobArn(value: JobArn): Self = StObject.set(x, "jobArn", value.asInstanceOf[js.Any])
  }
}
