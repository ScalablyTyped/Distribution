package typings
package applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.TelemetryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.ApplicationInsights.Telemetry.Metric")
@js.native
class Metric protected ()
  extends applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ISerializable {
  /**
    * Constructs a new instance of the MetricTelemetry object
    */
  def this(name: java.lang.String, value: scala.Double) = this()
  def this(name: java.lang.String, value: scala.Double, count: scala.Double) = this()
  def this(name: java.lang.String, value: scala.Double, count: scala.Double, min: scala.Double) = this()
  def this(name: java.lang.String, value: scala.Double, count: scala.Double, min: scala.Double, max: scala.Double) = this()
  def this(name: java.lang.String, value: scala.Double, count: scala.Double, min: scala.Double, max: scala.Double, properties: js.Any) = this()
  /**
    * The set of fields for a serializeable object.
    * This defines the serialization order and a value of true/false
    * for each field defines whether the field is required or not.
    */
  /* CompleteClass */
  override var aiDataContract: js.Any = js.native
  @JSName("aiDataContract")
  var aiDataContract_Metric: applicationinsightsDashJsLib.Anon_Metrics = js.native
  var metrics: js.Array[applicationinsightsDashJsLib.AINs.DataPoint] = js.native
  var properties: js.Any = js.native
  var ver: scala.Double = js.native
}

@JSGlobal("Microsoft.ApplicationInsights.Telemetry.Metric")
@js.native
object Metric extends js.Object {
  var dataType: java.lang.String = js.native
  var envelopeType: java.lang.String = js.native
}

