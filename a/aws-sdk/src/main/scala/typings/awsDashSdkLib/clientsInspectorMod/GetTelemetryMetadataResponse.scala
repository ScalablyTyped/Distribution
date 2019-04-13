package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTelemetryMetadataResponse extends js.Object {
  /**
    * Telemetry details.
    */
  var telemetryMetadata: TelemetryMetadataList
}

object GetTelemetryMetadataResponse {
  @scala.inline
  def apply(telemetryMetadata: TelemetryMetadataList): GetTelemetryMetadataResponse = {
    val __obj = js.Dynamic.literal(telemetryMetadata = telemetryMetadata)
  
    __obj.asInstanceOf[GetTelemetryMetadataResponse]
  }
}

