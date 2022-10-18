package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeploymentGroupInput extends StObject {
  
  /**
    * The name of an CodeDeploy application associated with the IAM user or Amazon Web Services account.
    */
  var applicationName: ApplicationName
  
  /**
    * The name of a deployment group for the specified application.
    */
  var deploymentGroupName: DeploymentGroupName
}
object GetDeploymentGroupInput {
  
  inline def apply(applicationName: ApplicationName, deploymentGroupName: DeploymentGroupName): GetDeploymentGroupInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], deploymentGroupName = deploymentGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentGroupInput]
  }
  
  extension [Self <: GetDeploymentGroupInput](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setDeploymentGroupName(value: DeploymentGroupName): Self = StObject.set(x, "deploymentGroupName", value.asInstanceOf[js.Any])
  }
}
