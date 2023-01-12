package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateThingRuntimeConfigurationRequest extends StObject {
  
  /**
    * Configuration for telemetry service.
    */
  var TelemetryConfiguration: js.UndefOr[TelemetryConfigurationUpdate] = js.undefined
  
  /**
    * The thing name.
    */
  var ThingName: string
}
object UpdateThingRuntimeConfigurationRequest {
  
  inline def apply(ThingName: string): UpdateThingRuntimeConfigurationRequest = {
    val __obj = js.Dynamic.literal(ThingName = ThingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThingRuntimeConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateThingRuntimeConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setTelemetryConfiguration(value: TelemetryConfigurationUpdate): Self = StObject.set(x, "TelemetryConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTelemetryConfigurationUndefined: Self = StObject.set(x, "TelemetryConfiguration", js.undefined)
    
    inline def setThingName(value: string): Self = StObject.set(x, "ThingName", value.asInstanceOf[js.Any])
  }
}
