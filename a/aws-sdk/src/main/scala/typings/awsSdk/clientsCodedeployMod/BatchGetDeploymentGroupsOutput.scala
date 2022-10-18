package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetDeploymentGroupsOutput extends StObject {
  
  /**
    * Information about the deployment groups.
    */
  var deploymentGroupsInfo: js.UndefOr[DeploymentGroupInfoList] = js.undefined
  
  /**
    * Information about errors that might have occurred during the API call.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
}
object BatchGetDeploymentGroupsOutput {
  
  inline def apply(): BatchGetDeploymentGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDeploymentGroupsOutput]
  }
  
  extension [Self <: BatchGetDeploymentGroupsOutput](x: Self) {
    
    inline def setDeploymentGroupsInfo(value: DeploymentGroupInfoList): Self = StObject.set(x, "deploymentGroupsInfo", value.asInstanceOf[js.Any])
    
    inline def setDeploymentGroupsInfoUndefined: Self = StObject.set(x, "deploymentGroupsInfo", js.undefined)
    
    inline def setDeploymentGroupsInfoVarargs(value: DeploymentGroupInfo*): Self = StObject.set(x, "deploymentGroupsInfo", js.Array(value*))
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
  }
}
