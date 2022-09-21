package typings.awsSdk.apprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAutoScalingConfigurationResponse extends StObject {
  
  /**
    * A full description of the App Runner auto scaling configuration that you specified in this request.
    */
  var AutoScalingConfiguration: typings.awsSdk.apprunnerMod.AutoScalingConfiguration
}
object DescribeAutoScalingConfigurationResponse {
  
  inline def apply(AutoScalingConfiguration: AutoScalingConfiguration): DescribeAutoScalingConfigurationResponse = {
    val __obj = js.Dynamic.literal(AutoScalingConfiguration = AutoScalingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAutoScalingConfigurationResponse]
  }
  
  extension [Self <: DescribeAutoScalingConfigurationResponse](x: Self) {
    
    inline def setAutoScalingConfiguration(value: AutoScalingConfiguration): Self = StObject.set(x, "AutoScalingConfiguration", value.asInstanceOf[js.Any])
  }
}
