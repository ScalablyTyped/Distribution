package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeploymentConfigOutput extends StObject {
  
  /**
    * Information about the deployment configuration.
    */
  var deploymentConfigInfo: js.UndefOr[DeploymentConfigInfo] = js.undefined
}
object GetDeploymentConfigOutput {
  
  inline def apply(): GetDeploymentConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeploymentConfigOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDeploymentConfigOutput] (val x: Self) extends AnyVal {
    
    inline def setDeploymentConfigInfo(value: DeploymentConfigInfo): Self = StObject.set(x, "deploymentConfigInfo", value.asInstanceOf[js.Any])
    
    inline def setDeploymentConfigInfoUndefined: Self = StObject.set(x, "deploymentConfigInfo", js.undefined)
  }
}
