package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeploymentRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string
  
  /**
    * The deployment ID.
    */
  var DeploymentId: string
}
object GetDeploymentRequest {
  
  inline def apply(ApiId: string, DeploymentId: string): GetDeploymentRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], DeploymentId = DeploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentRequest]
  }
  
  extension [Self <: GetDeploymentRequest](x: Self) {
    
    inline def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentId(value: string): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
  }
}
