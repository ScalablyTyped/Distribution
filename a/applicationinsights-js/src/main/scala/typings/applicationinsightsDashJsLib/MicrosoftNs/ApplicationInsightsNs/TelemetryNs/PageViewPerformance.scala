package typings
package applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.TelemetryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.ApplicationInsights.Telemetry.PageViewPerformance")
@js.native
class PageViewPerformance protected ()
  extends applicationinsightsDashJsLib.AINs.PageViewPerfData
     with applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ISerializable {
  /**
    * Constructs a new instance of the PageEventTelemetry object
    */
  def this(name: java.lang.String, url: java.lang.String, unused: scala.Double) = this()
  def this(name: java.lang.String, url: java.lang.String, unused: scala.Double, properties: js.Any) = this()
  def this(name: java.lang.String, url: java.lang.String, unused: scala.Double, properties: js.Any, measurements: js.Any) = this()
  /**
    * The set of fields for a serializeable object.
    * This defines the serialization order and a value of true/false
    * for each field defines whether the field is required or not.
    */
  /* CompleteClass */
  override var aiDataContract: js.Any = js.native
  @JSName("aiDataContract")
  var aiDataContract_PageViewPerformance: applicationinsightsDashJsLib.Anon_DomProcessing = js.native
  var durationMs: js.Any = js.native
  /**
    * Field indicating whether this instance of PageViewPerformance is valid and should be sent
    */
  var isValid: js.Any = js.native
  /**
    * Gets the total duration (PLT) in milliseconds. Check getIsValid() before using this method.
    */
  def getDurationMs(): scala.Double = js.native
  /**
    * Indicates whether this instance of PageViewPerformance is valid and should be sent
    */
  def getIsValid(): scala.Boolean = js.native
}

/* static members */
@JSGlobal("Microsoft.ApplicationInsights.Telemetry.PageViewPerformance")
@js.native
object PageViewPerformance extends js.Object {
  var dataType: java.lang.String = js.native
  var envelopeType: java.lang.String = js.native
  def getDuration(start: js.Any, end: js.Any): scala.Double = js.native
  def getPerformanceTiming(): stdLib.PerformanceTiming = js.native
  /**
    * As page loads different parts of performance timing numbers get set. When all of them are set we can report it.
    * Returns true if ready, false otherwise.
    */
  def isPerformanceTimingDataReady(): scala.Boolean = js.native
  /**
    * Returns true is window performance timing API is supported, false otherwise.
    */
  def isPerformanceTimingSupported(): stdLib.PerformanceTiming = js.native
}

