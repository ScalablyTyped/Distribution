package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAutoScalingConfigurationResponse extends StObject {
  
  /**
    * A full description of the App Runner auto scaling configuration that you specified in this request.
    */
  var AutoScalingConfiguration: typings.awsSdk.clientsApprunnerMod.AutoScalingConfiguration
}
object DescribeAutoScalingConfigurationResponse {
  
  inline def apply(AutoScalingConfiguration: AutoScalingConfiguration): DescribeAutoScalingConfigurationResponse = {
    val __obj = js.Dynamic.literal(AutoScalingConfiguration = AutoScalingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAutoScalingConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAutoScalingConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setAutoScalingConfiguration(value: AutoScalingConfiguration): Self = StObject.set(x, "AutoScalingConfiguration", value.asInstanceOf[js.Any])
  }
}
