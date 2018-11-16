package typings
package applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.TelemetryNs.CommonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.ApplicationInsights.Telemetry.Common.Envelope")
@js.native
class Envelope protected ()
  extends applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.IEnvelope {
  /**
           * Constructs a new instance of telemetry data.
           */
  def this(data: applicationinsightsDashJsLib.MicrosoftNs.TelemetryNs.Base, name: java.lang.String) = this()
  /**
           * The set of fields for a serializeable object.
           * This defines the serialization order and a value of true/false
           * for each field defines whether the field is required or not.
           */
  /* CompleteClass */
  override var aiDataContract: js.Any = js.native
  /* CompleteClass */
  override var appId: java.lang.String = js.native
  /* CompleteClass */
  override var appVer: java.lang.String = js.native
  /* CompleteClass */
  override var data: js.Any = js.native
  @JSName("data")
  var data_Envelope: Base = js.native
  /* CompleteClass */
  override var deviceId: java.lang.String = js.native
  /* CompleteClass */
  override var flags: scala.Double = js.native
  /* CompleteClass */
  override var iKey: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var os: java.lang.String = js.native
  /* CompleteClass */
  override var osVer: java.lang.String = js.native
  /* CompleteClass */
  override var sampleRate: scala.Double = js.native
  /* CompleteClass */
  override var seq: java.lang.String = js.native
  /* CompleteClass */
  override var tags: ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override var time: java.lang.String = js.native
  /* CompleteClass */
  override var userId: java.lang.String = js.native
  /* CompleteClass */
  override var ver: scala.Double = js.native
}

