package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelemetryConfiguration extends StObject {
  
  /**
    * Synchronization status of the device reported configuration with the desired configuration.
    */
  var ConfigurationSyncStatus: js.UndefOr[typings.awsSdk.clientsGreengrassMod.ConfigurationSyncStatus] = js.undefined
  
  /**
    * Configure telemetry to be on or off.
    */
  var Telemetry: typings.awsSdk.clientsGreengrassMod.Telemetry
}
object TelemetryConfiguration {
  
  inline def apply(Telemetry: Telemetry): TelemetryConfiguration = {
    val __obj = js.Dynamic.literal(Telemetry = Telemetry.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelemetryConfiguration] (val x: Self) extends AnyVal {
    
    inline def setConfigurationSyncStatus(value: ConfigurationSyncStatus): Self = StObject.set(x, "ConfigurationSyncStatus", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSyncStatusUndefined: Self = StObject.set(x, "ConfigurationSyncStatus", js.undefined)
    
    inline def setTelemetry(value: Telemetry): Self = StObject.set(x, "Telemetry", value.asInstanceOf[js.Any])
  }
}
