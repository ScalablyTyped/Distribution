package typings
package applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.TelemetryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.ApplicationInsights.Telemetry.Event")
@js.native
class Event protected ()
  extends applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ISerializable {
  /**
    * Constructs a new instance of the EventTelemetry object
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, properties: js.Any) = this()
  def this(name: java.lang.String, properties: js.Any, measurements: js.Any) = this()
  /**
    * The set of fields for a serializeable object.
    * This defines the serialization order and a value of true/false
    * for each field defines whether the field is required or not.
    */
  /* CompleteClass */
  override var aiDataContract: js.Any = js.native
  @JSName("aiDataContract")
  var aiDataContract_Event: applicationinsightsDashJsLib.Anon_Measurements = js.native
  var measurements: js.Any = js.native
  var name: java.lang.String = js.native
  var properties: js.Any = js.native
  var ver: scala.Double = js.native
}

/* static members */
@JSGlobal("Microsoft.ApplicationInsights.Telemetry.Event")
@js.native
object Event extends js.Object {
  var dataType: java.lang.String = js.native
  var envelopeType: java.lang.String = js.native
}

