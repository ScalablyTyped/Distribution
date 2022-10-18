package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelEnvironmentDeploymentInput extends StObject {
  
  /**
    * The name of the environment with the deployment to cancel.
    */
  var environmentName: ResourceName
}
object CancelEnvironmentDeploymentInput {
  
  inline def apply(environmentName: ResourceName): CancelEnvironmentDeploymentInput = {
    val __obj = js.Dynamic.literal(environmentName = environmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelEnvironmentDeploymentInput]
  }
  
  extension [Self <: CancelEnvironmentDeploymentInput](x: Self) {
    
    inline def setEnvironmentName(value: ResourceName): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
  }
}
