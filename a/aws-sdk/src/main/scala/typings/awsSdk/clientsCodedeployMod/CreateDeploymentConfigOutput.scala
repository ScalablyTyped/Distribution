package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeploymentConfigOutput extends StObject {
  
  /**
    * A unique deployment configuration ID.
    */
  var deploymentConfigId: js.UndefOr[DeploymentConfigId] = js.undefined
}
object CreateDeploymentConfigOutput {
  
  inline def apply(): CreateDeploymentConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeploymentConfigOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDeploymentConfigOutput] (val x: Self) extends AnyVal {
    
    inline def setDeploymentConfigId(value: DeploymentConfigId): Self = StObject.set(x, "deploymentConfigId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentConfigIdUndefined: Self = StObject.set(x, "deploymentConfigId", js.undefined)
  }
}
