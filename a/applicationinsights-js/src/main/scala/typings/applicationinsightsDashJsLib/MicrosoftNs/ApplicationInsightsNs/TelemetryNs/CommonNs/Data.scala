package typings
package applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.TelemetryNs.CommonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.ApplicationInsights.Telemetry.Common.Data")
@js.native
class Data[TDomain] protected ()
  extends applicationinsightsDashJsLib.MicrosoftNs.TelemetryNs.Data[TDomain]
     with applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ISerializable {
  /**
    * Constructs a new instance of telemetry data.
    */
  def this(`type`: java.lang.String, data: TDomain) = this()
  /**
    * The set of fields for a serializeable object.
    * This defines the serialization order and a value of true/false
    * for each field defines whether the field is required or not.
    */
  /* CompleteClass */
  override var aiDataContract: js.Any = js.native
  /**
    * The data contract for serializing this object.
    */
  @JSName("aiDataContract")
  var aiDataContract_Data: applicationinsightsDashJsLib.Anon_BaseType = js.native
}

