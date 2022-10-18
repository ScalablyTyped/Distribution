package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelemetryConfigurationUpdate extends StObject {
  
  /**
    * Configure telemetry to be on or off.
    */
  var Telemetry: typings.awsSdk.clientsGreengrassMod.Telemetry
}
object TelemetryConfigurationUpdate {
  
  inline def apply(Telemetry: Telemetry): TelemetryConfigurationUpdate = {
    val __obj = js.Dynamic.literal(Telemetry = Telemetry.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryConfigurationUpdate]
  }
  
  extension [Self <: TelemetryConfigurationUpdate](x: Self) {
    
    inline def setTelemetry(value: Telemetry): Self = StObject.set(x, "Telemetry", value.asInstanceOf[js.Any])
  }
}
