package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConfigurationRequest extends StObject {
  
  /**
    * Specifies how the ECR automated re-scan will be updated for your environment.
    */
  var ecrConfiguration: EcrConfiguration
}
object UpdateConfigurationRequest {
  
  inline def apply(ecrConfiguration: EcrConfiguration): UpdateConfigurationRequest = {
    val __obj = js.Dynamic.literal(ecrConfiguration = ecrConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationRequest]
  }
  
  extension [Self <: UpdateConfigurationRequest](x: Self) {
    
    inline def setEcrConfiguration(value: EcrConfiguration): Self = StObject.set(x, "ecrConfiguration", value.asInstanceOf[js.Any])
  }
}
