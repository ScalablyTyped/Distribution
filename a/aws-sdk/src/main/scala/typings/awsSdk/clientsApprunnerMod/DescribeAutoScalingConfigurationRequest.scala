package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAutoScalingConfigurationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the App Runner auto scaling configuration that you want a description for. The ARN can be a full auto scaling configuration ARN, or a partial ARN ending with either .../name  or .../name/revision . If a revision isn't specified, the latest active revision is described.
    */
  var AutoScalingConfigurationArn: AppRunnerResourceArn
}
object DescribeAutoScalingConfigurationRequest {
  
  inline def apply(AutoScalingConfigurationArn: AppRunnerResourceArn): DescribeAutoScalingConfigurationRequest = {
    val __obj = js.Dynamic.literal(AutoScalingConfigurationArn = AutoScalingConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAutoScalingConfigurationRequest]
  }
  
  extension [Self <: DescribeAutoScalingConfigurationRequest](x: Self) {
    
    inline def setAutoScalingConfigurationArn(value: AppRunnerResourceArn): Self = StObject.set(x, "AutoScalingConfigurationArn", value.asInstanceOf[js.Any])
  }
}
