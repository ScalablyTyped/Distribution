package typings.awsSdk.apprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateObservabilityConfigurationRequest extends StObject {
  
  /**
    * A name for the observability configuration. When you use it for the first time in an Amazon Web Services Region, App Runner creates revision number 1 of this name. When you use the same name in subsequent calls, App Runner creates incremental revisions of the configuration.  The name DefaultConfiguration is reserved. You can't use it to create a new observability configuration, and you can't create a revision of it. When you want to use your own observability configuration for your App Runner service, create a configuration with a different name, and then provide it when you create or update your service. 
    */
  var ObservabilityConfigurationName: typings.awsSdk.apprunnerMod.ObservabilityConfigurationName
  
  /**
    * A list of metadata items that you can associate with your observability configuration resource. A tag is a key-value pair.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The configuration of the tracing feature within this observability configuration. If you don't specify it, App Runner doesn't enable tracing.
    */
  var TraceConfiguration: js.UndefOr[typings.awsSdk.apprunnerMod.TraceConfiguration] = js.undefined
}
object CreateObservabilityConfigurationRequest {
  
  inline def apply(ObservabilityConfigurationName: ObservabilityConfigurationName): CreateObservabilityConfigurationRequest = {
    val __obj = js.Dynamic.literal(ObservabilityConfigurationName = ObservabilityConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateObservabilityConfigurationRequest]
  }
  
  extension [Self <: CreateObservabilityConfigurationRequest](x: Self) {
    
    inline def setObservabilityConfigurationName(value: ObservabilityConfigurationName): Self = StObject.set(x, "ObservabilityConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTraceConfiguration(value: TraceConfiguration): Self = StObject.set(x, "TraceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTraceConfigurationUndefined: Self = StObject.set(x, "TraceConfiguration", js.undefined)
  }
}
