package typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.TelemetryNs

import typings.applicationinsightsDashJs.AINs.PageViewData
import typings.applicationinsightsDashJs.Anon_Duration
import typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.ISerializable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.ApplicationInsights.Telemetry.PageView")
@js.native
/**
  * Constructs a new instance of the PageEventTelemetry object
  */
class PageView ()
  extends PageViewData
     with ISerializable {
  def this(name: String) = this()
  def this(name: String, url: String) = this()
  def this(name: String, url: String, durationMs: Double) = this()
  def this(name: String, url: String, durationMs: Double, properties: js.Any) = this()
  def this(name: String, url: String, durationMs: Double, properties: js.Any, measurements: js.Any) = this()
  /**
    * The set of fields for a serializeable object.
    * This defines the serialization order and a value of true/false
    * for each field defines whether the field is required or not.
    */
  /* CompleteClass */
  override var aiDataContract: js.Any = js.native
  @JSName("aiDataContract")
  var aiDataContract_PageView: Anon_Duration = js.native
}

/* static members */
@JSGlobal("Microsoft.ApplicationInsights.Telemetry.PageView")
@js.native
object PageView extends js.Object {
  var dataType: String = js.native
  var envelopeType: String = js.native
}

