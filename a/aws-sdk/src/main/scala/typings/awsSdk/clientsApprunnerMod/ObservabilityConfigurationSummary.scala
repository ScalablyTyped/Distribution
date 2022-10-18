package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObservabilityConfigurationSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of this observability configuration.
    */
  var ObservabilityConfigurationArn: js.UndefOr[AppRunnerResourceArn] = js.undefined
  
  /**
    * The customer-provided observability configuration name. It can be used in multiple revisions of a configuration.
    */
  var ObservabilityConfigurationName: js.UndefOr[typings.awsSdk.clientsApprunnerMod.ObservabilityConfigurationName] = js.undefined
  
  /**
    * The revision of this observability configuration. It's unique among all the active configurations ("Status": "ACTIVE") that share the same ObservabilityConfigurationName.
    */
  var ObservabilityConfigurationRevision: js.UndefOr[Integer] = js.undefined
}
object ObservabilityConfigurationSummary {
  
  inline def apply(): ObservabilityConfigurationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObservabilityConfigurationSummary]
  }
  
  extension [Self <: ObservabilityConfigurationSummary](x: Self) {
    
    inline def setObservabilityConfigurationArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ObservabilityConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setObservabilityConfigurationArnUndefined: Self = StObject.set(x, "ObservabilityConfigurationArn", js.undefined)
    
    inline def setObservabilityConfigurationName(value: ObservabilityConfigurationName): Self = StObject.set(x, "ObservabilityConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setObservabilityConfigurationNameUndefined: Self = StObject.set(x, "ObservabilityConfigurationName", js.undefined)
    
    inline def setObservabilityConfigurationRevision(value: Integer): Self = StObject.set(x, "ObservabilityConfigurationRevision", value.asInstanceOf[js.Any])
    
    inline def setObservabilityConfigurationRevisionUndefined: Self = StObject.set(x, "ObservabilityConfigurationRevision", js.undefined)
  }
}
