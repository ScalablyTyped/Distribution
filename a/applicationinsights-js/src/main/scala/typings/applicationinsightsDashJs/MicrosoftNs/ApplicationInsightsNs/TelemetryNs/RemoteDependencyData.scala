package typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.TelemetryNs

import typings.applicationinsightsDashJs.Anon_Async
import typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.ISerializable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.ApplicationInsights.Telemetry.RemoteDependencyData")
@js.native
class RemoteDependencyData protected ()
  extends typings.applicationinsightsDashJs.AINs.RemoteDependencyData
     with ISerializable {
  /**
    * Constructs a new instance of the RemoteDependencyData object
    */
  def this(
    id: String,
    absoluteUrl: String,
    commandName: String,
    value: Double,
    success: Boolean,
    resultCode: Double
  ) = this()
  def this(
    id: String,
    absoluteUrl: String,
    commandName: String,
    value: Double,
    success: Boolean,
    resultCode: Double,
    method: String
  ) = this()
  /**
    * The set of fields for a serializeable object.
    * This defines the serialization order and a value of true/false
    * for each field defines whether the field is required or not.
    */
  /* CompleteClass */
  override var aiDataContract: js.Any = js.native
  @JSName("aiDataContract")
  var aiDataContract_RemoteDependencyData: Anon_Async = js.native
  /* private */ def formatDependencyName(method: js.Any, absoluteUrl: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("Microsoft.ApplicationInsights.Telemetry.RemoteDependencyData")
@js.native
object RemoteDependencyData extends js.Object {
  var dataType: String = js.native
  var envelopeType: String = js.native
}

