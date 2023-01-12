package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTelemetryMetadataResponse extends StObject {
  
  /**
    * Telemetry details.
    */
  var telemetryMetadata: TelemetryMetadataList
}
object GetTelemetryMetadataResponse {
  
  inline def apply(telemetryMetadata: TelemetryMetadataList): GetTelemetryMetadataResponse = {
    val __obj = js.Dynamic.literal(telemetryMetadata = telemetryMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTelemetryMetadataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTelemetryMetadataResponse] (val x: Self) extends AnyVal {
    
    inline def setTelemetryMetadata(value: TelemetryMetadataList): Self = StObject.set(x, "telemetryMetadata", value.asInstanceOf[js.Any])
    
    inline def setTelemetryMetadataVarargs(value: TelemetryMetadata*): Self = StObject.set(x, "telemetryMetadata", js.Array(value*))
  }
}
