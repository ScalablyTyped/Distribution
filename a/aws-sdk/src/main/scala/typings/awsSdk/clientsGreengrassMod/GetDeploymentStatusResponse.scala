package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeploymentStatusResponse extends StObject {
  
  /**
    * The status of the deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''.
    */
  var DeploymentStatus: js.UndefOr[string] = js.undefined
  
  /**
    * The type of the deployment.
    */
  var DeploymentType: js.UndefOr[typings.awsSdk.clientsGreengrassMod.DeploymentType] = js.undefined
  
  /**
    * Error details
    */
  var ErrorDetails: js.UndefOr[typings.awsSdk.clientsGreengrassMod.ErrorDetails] = js.undefined
  
  /**
    * Error message
    */
  var ErrorMessage: js.UndefOr[string] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the deployment status was updated.
    */
  var UpdatedAt: js.UndefOr[string] = js.undefined
}
object GetDeploymentStatusResponse {
  
  inline def apply(): GetDeploymentStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeploymentStatusResponse]
  }
  
  extension [Self <: GetDeploymentStatusResponse](x: Self) {
    
    inline def setDeploymentStatus(value: string): Self = StObject.set(x, "DeploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatusUndefined: Self = StObject.set(x, "DeploymentStatus", js.undefined)
    
    inline def setDeploymentType(value: DeploymentType): Self = StObject.set(x, "DeploymentType", value.asInstanceOf[js.Any])
    
    inline def setDeploymentTypeUndefined: Self = StObject.set(x, "DeploymentType", js.undefined)
    
    inline def setErrorDetails(value: ErrorDetails): Self = StObject.set(x, "ErrorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "ErrorDetails", js.undefined)
    
    inline def setErrorDetailsVarargs(value: ErrorDetail*): Self = StObject.set(x, "ErrorDetails", js.Array(value*))
    
    inline def setErrorMessage(value: string): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setUpdatedAt(value: string): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
