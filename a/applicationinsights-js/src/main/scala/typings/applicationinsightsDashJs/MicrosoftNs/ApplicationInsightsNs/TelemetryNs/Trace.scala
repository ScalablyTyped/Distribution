package typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.TelemetryNs

import typings.applicationinsightsDashJs.AINs.MessageData
import typings.applicationinsightsDashJs.Anon_MeasurementsMessage
import typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.ISerializable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.ApplicationInsights.Telemetry.Trace")
@js.native
class Trace protected ()
  extends MessageData
     with ISerializable {
  /**
    * Constructs a new instance of the MetricTelemetry object
    */
  def this(message: String) = this()
  def this(message: String, properties: js.Any) = this()
  /**
    * The set of fields for a serializeable object.
    * This defines the serialization order and a value of true/false
    * for each field defines whether the field is required or not.
    */
  /* CompleteClass */
  override var aiDataContract: js.Any = js.native
  @JSName("aiDataContract")
  var aiDataContract_Trace: Anon_MeasurementsMessage = js.native
}

/* static members */
@JSGlobal("Microsoft.ApplicationInsights.Telemetry.Trace")
@js.native
object Trace extends js.Object {
  var dataType: String = js.native
  var envelopeType: String = js.native
}

