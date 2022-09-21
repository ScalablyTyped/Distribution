package typings.awsSdk.apprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAutoScalingConfigurationResponse extends StObject {
  
  /**
    * A description of the App Runner auto scaling configuration that this request just deleted.
    */
  var AutoScalingConfiguration: typings.awsSdk.apprunnerMod.AutoScalingConfiguration
}
object DeleteAutoScalingConfigurationResponse {
  
  inline def apply(AutoScalingConfiguration: AutoScalingConfiguration): DeleteAutoScalingConfigurationResponse = {
    val __obj = js.Dynamic.literal(AutoScalingConfiguration = AutoScalingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAutoScalingConfigurationResponse]
  }
  
  extension [Self <: DeleteAutoScalingConfigurationResponse](x: Self) {
    
    inline def setAutoScalingConfiguration(value: AutoScalingConfiguration): Self = StObject.set(x, "AutoScalingConfiguration", value.asInstanceOf[js.Any])
  }
}
