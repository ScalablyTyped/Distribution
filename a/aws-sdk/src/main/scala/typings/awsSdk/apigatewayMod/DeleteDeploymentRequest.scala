package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDeploymentRequest extends StObject {
  
  /**
    * [Required] The identifier of the Deployment resource to delete.
    */
  var deploymentId: String = js.native
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}
object DeleteDeploymentRequest {
  
  @scala.inline
  def apply(deploymentId: String, restApiId: String): DeleteDeploymentRequest = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeploymentRequest]
  }
  
  @scala.inline
  implicit class DeleteDeploymentRequestMutableBuilder[Self <: DeleteDeploymentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentId(value: String): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
