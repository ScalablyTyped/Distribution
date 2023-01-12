package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDeploymentRequest extends StObject {
  
  /**
    * The ID of the deployment.
    */
  var deploymentId: NonEmptyString
}
object DeleteDeploymentRequest {
  
  inline def apply(deploymentId: NonEmptyString): DeleteDeploymentRequest = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeploymentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDeploymentRequest] (val x: Self) extends AnyVal {
    
    inline def setDeploymentId(value: NonEmptyString): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
  }
}
