package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeConfiguration extends StObject {
  
  /**
    * Configuration for telemetry service.
    */
  var TelemetryConfiguration: js.UndefOr[typings.awsSdk.clientsGreengrassMod.TelemetryConfiguration] = js.undefined
}
object RuntimeConfiguration {
  
  inline def apply(): RuntimeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuntimeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setTelemetryConfiguration(value: TelemetryConfiguration): Self = StObject.set(x, "TelemetryConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTelemetryConfigurationUndefined: Self = StObject.set(x, "TelemetryConfiguration", js.undefined)
  }
}
