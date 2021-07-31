package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeploymentRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string
  
  /**
    * The description for the deployment resource.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
  
  /**
    * The name of the Stage resource for the Deployment resource to create.
    */
  var StageName: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
}
object CreateDeploymentRequest {
  
  @scala.inline
  def apply(ApiId: string): CreateDeploymentRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentRequest]
  }
  
  @scala.inline
  implicit class CreateDeploymentRequestMutableBuilder[Self <: CreateDeploymentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: StringWithLengthBetween0And1024): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setStageName(value: StringWithLengthBetween1And128): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageNameUndefined: Self = StObject.set(x, "StageName", js.undefined)
  }
}
