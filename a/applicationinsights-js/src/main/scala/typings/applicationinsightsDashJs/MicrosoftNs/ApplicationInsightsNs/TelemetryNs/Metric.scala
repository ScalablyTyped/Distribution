package typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.TelemetryNs

import typings.applicationinsightsDashJs.AINs.DataPoint
import typings.applicationinsightsDashJs.Anon_Metrics
import typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.ISerializable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.ApplicationInsights.Telemetry.Metric")
@js.native
class Metric protected () extends ISerializable {
  /**
    * Constructs a new instance of the MetricTelemetry object
    */
  def this(name: String, value: Double) = this()
  def this(name: String, value: Double, count: Double) = this()
  def this(name: String, value: Double, count: Double, min: Double) = this()
  def this(name: String, value: Double, count: Double, min: Double, max: Double) = this()
  def this(name: String, value: Double, count: Double, min: Double, max: Double, properties: js.Any) = this()
  /**
    * The set of fields for a serializeable object.
    * This defines the serialization order and a value of true/false
    * for each field defines whether the field is required or not.
    */
  /* CompleteClass */
  override var aiDataContract: js.Any = js.native
  @JSName("aiDataContract")
  var aiDataContract_Metric: Anon_Metrics = js.native
  var metrics: js.Array[DataPoint] = js.native
  var properties: js.Any = js.native
  var ver: Double = js.native
}

/* static members */
@JSGlobal("Microsoft.ApplicationInsights.Telemetry.Metric")
@js.native
object Metric extends js.Object {
  var dataType: String = js.native
  var envelopeType: String = js.native
}

