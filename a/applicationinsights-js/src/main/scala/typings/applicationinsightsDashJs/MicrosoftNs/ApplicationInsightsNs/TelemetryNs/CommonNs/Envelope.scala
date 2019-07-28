package typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.TelemetryNs.CommonNs

import org.scalablytyped.runtime.StringDictionary
import typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.IEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.ApplicationInsights.Telemetry.Common.Envelope")
@js.native
class Envelope protected () extends IEnvelope {
  /**
    * Constructs a new instance of telemetry data.
    */
  def this(data: typings.applicationinsightsDashJs.MicrosoftNs.TelemetryNs.Base, name: String) = this()
  /**
    * The set of fields for a serializeable object.
    * This defines the serialization order and a value of true/false
    * for each field defines whether the field is required or not.
    */
  /* CompleteClass */
  override var aiDataContract: js.Any = js.native
  /* CompleteClass */
  override var appId: String = js.native
  /* CompleteClass */
  override var appVer: String = js.native
  /* CompleteClass */
  override var data: js.Any = js.native
  @JSName("data")
  var data_Envelope: Base = js.native
  /* CompleteClass */
  override var deviceId: String = js.native
  /* CompleteClass */
  override var flags: Double = js.native
  /* CompleteClass */
  override var iKey: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var os: String = js.native
  /* CompleteClass */
  override var osVer: String = js.native
  /* CompleteClass */
  override var sampleRate: Double = js.native
  /* CompleteClass */
  override var seq: String = js.native
  /* CompleteClass */
  override var tags: StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override var time: String = js.native
  /* CompleteClass */
  override var userId: String = js.native
  /* CompleteClass */
  override var ver: Double = js.native
}

