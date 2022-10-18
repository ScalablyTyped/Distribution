package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeDeploymentConfig extends StObject {
  
  /**
    * Toggle that determines whether to rollback to previous configuration if the current deployment fails. By default this is turned on. You may turn this off if you want to investigate the errors yourself.
    */
  var FailureHandlingPolicy: typings.awsSdk.clientsSagemakerMod.FailureHandlingPolicy
}
object EdgeDeploymentConfig {
  
  inline def apply(FailureHandlingPolicy: FailureHandlingPolicy): EdgeDeploymentConfig = {
    val __obj = js.Dynamic.literal(FailureHandlingPolicy = FailureHandlingPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeDeploymentConfig]
  }
  
  extension [Self <: EdgeDeploymentConfig](x: Self) {
    
    inline def setFailureHandlingPolicy(value: FailureHandlingPolicy): Self = StObject.set(x, "FailureHandlingPolicy", value.asInstanceOf[js.Any])
  }
}
