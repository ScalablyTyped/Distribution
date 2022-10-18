package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeObservabilityConfigurationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the App Runner observability configuration that you want a description for. The ARN can be a full observability configuration ARN, or a partial ARN ending with either .../name  or .../name/revision . If a revision isn't specified, the latest active revision is described.
    */
  var ObservabilityConfigurationArn: AppRunnerResourceArn
}
object DescribeObservabilityConfigurationRequest {
  
  inline def apply(ObservabilityConfigurationArn: AppRunnerResourceArn): DescribeObservabilityConfigurationRequest = {
    val __obj = js.Dynamic.literal(ObservabilityConfigurationArn = ObservabilityConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeObservabilityConfigurationRequest]
  }
  
  extension [Self <: DescribeObservabilityConfigurationRequest](x: Self) {
    
    inline def setObservabilityConfigurationArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ObservabilityConfigurationArn", value.asInstanceOf[js.Any])
  }
}
