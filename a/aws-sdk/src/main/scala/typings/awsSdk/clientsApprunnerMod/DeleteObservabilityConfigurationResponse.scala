package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteObservabilityConfigurationResponse extends StObject {
  
  /**
    * A description of the App Runner observability configuration that this request just deleted.
    */
  var ObservabilityConfiguration: typings.awsSdk.clientsApprunnerMod.ObservabilityConfiguration
}
object DeleteObservabilityConfigurationResponse {
  
  inline def apply(ObservabilityConfiguration: ObservabilityConfiguration): DeleteObservabilityConfigurationResponse = {
    val __obj = js.Dynamic.literal(ObservabilityConfiguration = ObservabilityConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObservabilityConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteObservabilityConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setObservabilityConfiguration(value: ObservabilityConfiguration): Self = StObject.set(x, "ObservabilityConfiguration", value.asInstanceOf[js.Any])
  }
}
