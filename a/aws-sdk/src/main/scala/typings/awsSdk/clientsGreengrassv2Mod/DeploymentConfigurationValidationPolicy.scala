package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentConfigurationValidationPolicy extends StObject {
  
  /**
    * The amount of time in seconds that a component can validate its configuration updates. If the validation time exceeds this timeout, then the deployment proceeds for the device. Default: 30 
    */
  var timeoutInSeconds: js.UndefOr[OptionalInteger] = js.undefined
}
object DeploymentConfigurationValidationPolicy {
  
  inline def apply(): DeploymentConfigurationValidationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentConfigurationValidationPolicy]
  }
  
  extension [Self <: DeploymentConfigurationValidationPolicy](x: Self) {
    
    inline def setTimeoutInSeconds(value: OptionalInteger): Self = StObject.set(x, "timeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInSecondsUndefined: Self = StObject.set(x, "timeoutInSeconds", js.undefined)
  }
}
