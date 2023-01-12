package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteObservabilityConfigurationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the App Runner observability configuration that you want to delete. The ARN can be a full observability configuration ARN, or a partial ARN ending with either .../name  or .../name/revision . If a revision isn't specified, the latest active revision is deleted.
    */
  var ObservabilityConfigurationArn: AppRunnerResourceArn
}
object DeleteObservabilityConfigurationRequest {
  
  inline def apply(ObservabilityConfigurationArn: AppRunnerResourceArn): DeleteObservabilityConfigurationRequest = {
    val __obj = js.Dynamic.literal(ObservabilityConfigurationArn = ObservabilityConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObservabilityConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteObservabilityConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setObservabilityConfigurationArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ObservabilityConfigurationArn", value.asInstanceOf[js.Any])
  }
}
