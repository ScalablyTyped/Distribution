package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeploymentRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string
  
  /**
    * The deployment ID.
    */
  var DeploymentId: string
  
  /**
    * The description for the deployment resource.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
}
object UpdateDeploymentRequest {
  
  @scala.inline
  def apply(ApiId: string, DeploymentId: string): UpdateDeploymentRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], DeploymentId = DeploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeploymentRequest]
  }
  
  @scala.inline
  implicit class UpdateDeploymentRequestMutableBuilder[Self <: UpdateDeploymentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentId(value: string): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: StringWithLengthBetween0And1024): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
