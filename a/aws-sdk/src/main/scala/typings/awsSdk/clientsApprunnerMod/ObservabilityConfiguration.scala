package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObservabilityConfiguration extends StObject {
  
  /**
    * The time when the observability configuration was created. It's in Unix time stamp format.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time when the observability configuration was deleted. It's in Unix time stamp format.
    */
  var DeletedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * It's set to true for the configuration with the highest Revision among all configurations that share the same ObservabilityConfigurationName. It's set to false otherwise.
    */
  var Latest: js.UndefOr[Boolean] = js.undefined
  
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
  
  /**
    * The current state of the observability configuration. If the status of a configuration revision is INACTIVE, it was deleted and can't be used. Inactive configuration revisions are permanently removed some time after they are deleted.
    */
  var Status: js.UndefOr[ObservabilityConfigurationStatus] = js.undefined
  
  /**
    * The configuration of the tracing feature within this observability configuration. If not specified, tracing isn't enabled.
    */
  var TraceConfiguration: js.UndefOr[typings.awsSdk.clientsApprunnerMod.TraceConfiguration] = js.undefined
}
object ObservabilityConfiguration {
  
  inline def apply(): ObservabilityConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObservabilityConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObservabilityConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDeletedAt(value: js.Date): Self = StObject.set(x, "DeletedAt", value.asInstanceOf[js.Any])
    
    inline def setDeletedAtUndefined: Self = StObject.set(x, "DeletedAt", js.undefined)
    
    inline def setLatest(value: Boolean): Self = StObject.set(x, "Latest", value.asInstanceOf[js.Any])
    
    inline def setLatestUndefined: Self = StObject.set(x, "Latest", js.undefined)
    
    inline def setObservabilityConfigurationArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ObservabilityConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setObservabilityConfigurationArnUndefined: Self = StObject.set(x, "ObservabilityConfigurationArn", js.undefined)
    
    inline def setObservabilityConfigurationName(value: ObservabilityConfigurationName): Self = StObject.set(x, "ObservabilityConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setObservabilityConfigurationNameUndefined: Self = StObject.set(x, "ObservabilityConfigurationName", js.undefined)
    
    inline def setObservabilityConfigurationRevision(value: Integer): Self = StObject.set(x, "ObservabilityConfigurationRevision", value.asInstanceOf[js.Any])
    
    inline def setObservabilityConfigurationRevisionUndefined: Self = StObject.set(x, "ObservabilityConfigurationRevision", js.undefined)
    
    inline def setStatus(value: ObservabilityConfigurationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTraceConfiguration(value: TraceConfiguration): Self = StObject.set(x, "TraceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTraceConfigurationUndefined: Self = StObject.set(x, "TraceConfiguration", js.undefined)
  }
}
