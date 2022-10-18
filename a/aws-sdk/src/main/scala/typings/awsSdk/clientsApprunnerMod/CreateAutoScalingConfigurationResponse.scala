package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAutoScalingConfigurationResponse extends StObject {
  
  /**
    * A description of the App Runner auto scaling configuration that's created by this request.
    */
  var AutoScalingConfiguration: typings.awsSdk.clientsApprunnerMod.AutoScalingConfiguration
}
object CreateAutoScalingConfigurationResponse {
  
  inline def apply(AutoScalingConfiguration: AutoScalingConfiguration): CreateAutoScalingConfigurationResponse = {
    val __obj = js.Dynamic.literal(AutoScalingConfiguration = AutoScalingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAutoScalingConfigurationResponse]
  }
  
  extension [Self <: CreateAutoScalingConfigurationResponse](x: Self) {
    
    inline def setAutoScalingConfiguration(value: AutoScalingConfiguration): Self = StObject.set(x, "AutoScalingConfiguration", value.asInstanceOf[js.Any])
  }
}
