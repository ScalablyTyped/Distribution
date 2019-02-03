package typings
package applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.TelemetryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.ApplicationInsights.Telemetry.Trace")
@js.native
class Trace protected ()
  extends applicationinsightsDashJsLib.AINs.MessageData
     with applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ISerializable {
  /**
    * Constructs a new instance of the MetricTelemetry object
    */
  def this(message: java.lang.String) = this()
  def this(message: java.lang.String, properties: js.Any) = this()
  /**
    * The set of fields for a serializeable object.
    * This defines the serialization order and a value of true/false
    * for each field defines whether the field is required or not.
    */
  /* CompleteClass */
  override var aiDataContract: js.Any = js.native
  @JSName("aiDataContract")
  var aiDataContract_Trace: applicationinsightsDashJsLib.Anon_MeasurementsMessage = js.native
}

/* static members */
@JSGlobal("Microsoft.ApplicationInsights.Telemetry.Trace")
@js.native
object Trace extends js.Object {
  var dataType: java.lang.String = js.native
  var envelopeType: java.lang.String = js.native
}

