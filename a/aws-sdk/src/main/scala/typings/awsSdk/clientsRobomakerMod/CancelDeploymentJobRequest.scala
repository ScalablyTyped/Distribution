package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelDeploymentJobRequest extends StObject {
  
  /**
    * The deployment job ARN to cancel.
    */
  var job: Arn
}
object CancelDeploymentJobRequest {
  
  inline def apply(job: Arn): CancelDeploymentJobRequest = {
    val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelDeploymentJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelDeploymentJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJob(value: Arn): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
  }
}
