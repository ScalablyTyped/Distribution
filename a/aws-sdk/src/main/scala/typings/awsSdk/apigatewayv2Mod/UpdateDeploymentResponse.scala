package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeploymentResponse extends StObject {
  
  /**
    * Specifies whether a deployment was automatically released.
    */
  var AutoDeployed: js.UndefOr[boolean] = js.undefined
  
  /**
    * The date and time when the Deployment resource was created.
    */
  var CreatedDate: js.UndefOr[timestampIso8601] = js.undefined
  
  /**
    * The identifier for the deployment.
    */
  var DeploymentId: js.UndefOr[Id] = js.undefined
  
  /**
    * The status of the deployment: PENDING, FAILED, or SUCCEEDED.
    */
  var DeploymentStatus: js.UndefOr[typings.awsSdk.apigatewayv2Mod.DeploymentStatus] = js.undefined
  
  /**
    * May contain additional feedback on the status of an API deployment.
    */
  var DeploymentStatusMessage: js.UndefOr[string] = js.undefined
  
  /**
    * The description for the deployment.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
}
object UpdateDeploymentResponse {
  
  @scala.inline
  def apply(): UpdateDeploymentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeploymentResponse]
  }
  
  @scala.inline
  implicit class UpdateDeploymentResponseMutableBuilder[Self <: UpdateDeploymentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoDeployed(value: boolean): Self = StObject.set(x, "AutoDeployed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDeployedUndefined: Self = StObject.set(x, "AutoDeployed", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: timestampIso8601): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    @scala.inline
    def setDeploymentId(value: Id): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
    
    @scala.inline
    def setDeploymentStatus(value: DeploymentStatus): Self = StObject.set(x, "DeploymentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentStatusMessage(value: string): Self = StObject.set(x, "DeploymentStatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentStatusMessageUndefined: Self = StObject.set(x, "DeploymentStatusMessage", js.undefined)
    
    @scala.inline
    def setDeploymentStatusUndefined: Self = StObject.set(x, "DeploymentStatus", js.undefined)
    
    @scala.inline
    def setDescription(value: StringWithLengthBetween0And1024): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
