package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDeploymentConfigInput extends StObject {
  
  /**
    * The name of a deployment configuration associated with the IAM user or Amazon Web Services account.
    */
  var deploymentConfigName: DeploymentConfigName
}
object DeleteDeploymentConfigInput {
  
  inline def apply(deploymentConfigName: DeploymentConfigName): DeleteDeploymentConfigInput = {
    val __obj = js.Dynamic.literal(deploymentConfigName = deploymentConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeploymentConfigInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDeploymentConfigInput] (val x: Self) extends AnyVal {
    
    inline def setDeploymentConfigName(value: DeploymentConfigName): Self = StObject.set(x, "deploymentConfigName", value.asInstanceOf[js.Any])
  }
}
