package typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.TelemetryNs

import typings.applicationinsightsDashJs.AINs.PageViewPerfData
import typings.applicationinsightsDashJs.Anon_DomProcessing
import typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.ISerializable
import typings.std.PerformanceTiming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.ApplicationInsights.Telemetry.PageViewPerformance")
@js.native
class PageViewPerformance protected ()
  extends PageViewPerfData
     with ISerializable {
  /**
    * Constructs a new instance of the PageEventTelemetry object
    */
  def this(name: String, url: String, unused: Double) = this()
  def this(name: String, url: String, unused: Double, properties: js.Any) = this()
  def this(name: String, url: String, unused: Double, properties: js.Any, measurements: js.Any) = this()
  /**
    * The set of fields for a serializeable object.
    * This defines the serialization order and a value of true/false
    * for each field defines whether the field is required or not.
    */
  /* CompleteClass */
  override var aiDataContract: js.Any = js.native
  @JSName("aiDataContract")
  var aiDataContract_PageViewPerformance: Anon_DomProcessing = js.native
  var durationMs: js.Any = js.native
  /**
    * Field indicating whether this instance of PageViewPerformance is valid and should be sent
    */
  var isValid: js.Any = js.native
  /**
    * Gets the total duration (PLT) in milliseconds. Check getIsValid() before using this method.
    */
  def getDurationMs(): Double = js.native
  /**
    * Indicates whether this instance of PageViewPerformance is valid and should be sent
    */
  def getIsValid(): Boolean = js.native
}

/* static members */
@JSGlobal("Microsoft.ApplicationInsights.Telemetry.PageViewPerformance")
@js.native
object PageViewPerformance extends js.Object {
  var dataType: String = js.native
  var envelopeType: String = js.native
  def getDuration(start: js.Any, end: js.Any): Double = js.native
  def getPerformanceTiming(): PerformanceTiming = js.native
  /**
    * As page loads different parts of performance timing numbers get set. When all of them are set we can report it.
    * Returns true if ready, false otherwise.
    */
  def isPerformanceTimingDataReady(): Boolean = js.native
  /**
    * Returns true is window performance timing API is supported, false otherwise.
    */
  def isPerformanceTimingSupported(): PerformanceTiming = js.native
}

