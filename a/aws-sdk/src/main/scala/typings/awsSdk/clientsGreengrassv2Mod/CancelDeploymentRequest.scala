package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelDeploymentRequest extends StObject {
  
  /**
    * The ID of the deployment.
    */
  var deploymentId: NonEmptyString
}
object CancelDeploymentRequest {
  
  inline def apply(deploymentId: NonEmptyString): CancelDeploymentRequest = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelDeploymentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelDeploymentRequest] (val x: Self) extends AnyVal {
    
    inline def setDeploymentId(value: NonEmptyString): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
  }
}
