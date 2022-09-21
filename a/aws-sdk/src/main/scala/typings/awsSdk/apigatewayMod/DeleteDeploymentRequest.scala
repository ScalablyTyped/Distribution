package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDeploymentRequest extends StObject {
  
  /**
    * The identifier of the Deployment resource to delete.
    */
  var deploymentId: String
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String
}
object DeleteDeploymentRequest {
  
  inline def apply(deploymentId: String, restApiId: String): DeleteDeploymentRequest = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeploymentRequest]
  }
  
  extension [Self <: DeleteDeploymentRequest](x: Self) {
    
    inline def setDeploymentId(value: String): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
