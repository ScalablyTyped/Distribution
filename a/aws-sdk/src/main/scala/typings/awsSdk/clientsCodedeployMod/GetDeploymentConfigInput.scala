package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeploymentConfigInput extends StObject {
  
  /**
    * The name of a deployment configuration associated with the IAM user or Amazon Web Services account.
    */
  var deploymentConfigName: DeploymentConfigName
}
object GetDeploymentConfigInput {
  
  inline def apply(deploymentConfigName: DeploymentConfigName): GetDeploymentConfigInput = {
    val __obj = js.Dynamic.literal(deploymentConfigName = deploymentConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentConfigInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDeploymentConfigInput] (val x: Self) extends AnyVal {
    
    inline def setDeploymentConfigName(value: DeploymentConfigName): Self = StObject.set(x, "deploymentConfigName", value.asInstanceOf[js.Any])
  }
}
