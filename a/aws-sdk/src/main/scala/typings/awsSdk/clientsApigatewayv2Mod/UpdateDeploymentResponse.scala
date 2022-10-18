package typings.awsSdk.clientsApigatewayv2Mod

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
  var CreatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier for the deployment.
    */
  var DeploymentId: js.UndefOr[Id] = js.undefined
  
  /**
    * The status of the deployment: PENDING, FAILED, or SUCCEEDED.
    */
  var DeploymentStatus: js.UndefOr[typings.awsSdk.clientsApigatewayv2Mod.DeploymentStatus] = js.undefined
  
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
  
  inline def apply(): UpdateDeploymentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeploymentResponse]
  }
  
  extension [Self <: UpdateDeploymentResponse](x: Self) {
    
    inline def setAutoDeployed(value: boolean): Self = StObject.set(x, "AutoDeployed", value.asInstanceOf[js.Any])
    
    inline def setAutoDeployedUndefined: Self = StObject.set(x, "AutoDeployed", js.undefined)
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setDeploymentId(value: Id): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
    
    inline def setDeploymentStatus(value: DeploymentStatus): Self = StObject.set(x, "DeploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatusMessage(value: string): Self = StObject.set(x, "DeploymentStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatusMessageUndefined: Self = StObject.set(x, "DeploymentStatusMessage", js.undefined)
    
    inline def setDeploymentStatusUndefined: Self = StObject.set(x, "DeploymentStatus", js.undefined)
    
    inline def setDescription(value: StringWithLengthBetween0And1024): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
