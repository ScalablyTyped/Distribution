package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeploymentRequest extends StObject {
  
  /**
    * The unique identifier of the application.
    */
  var applicationId: Identifier
  
  /**
    * The unique identifier for the deployment.
    */
  var deploymentId: Identifier
}
object GetDeploymentRequest {
  
  inline def apply(applicationId: Identifier, deploymentId: Identifier): GetDeploymentRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDeploymentRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: Identifier): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentId(value: Identifier): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
  }
}
