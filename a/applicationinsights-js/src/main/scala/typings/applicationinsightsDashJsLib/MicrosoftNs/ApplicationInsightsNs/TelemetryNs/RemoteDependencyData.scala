package typings
package applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.TelemetryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.ApplicationInsights.Telemetry.RemoteDependencyData")
@js.native
class RemoteDependencyData protected ()
  extends applicationinsightsDashJsLib.AINs.RemoteDependencyData
     with applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ISerializable {
  /**
           * Constructs a new instance of the RemoteDependencyData object
           */
  def this(id: java.lang.String, absoluteUrl: java.lang.String, commandName: java.lang.String, value: scala.Double, success: scala.Boolean, resultCode: scala.Double) = this()
  /**
           * Constructs a new instance of the RemoteDependencyData object
           */
  def this(id: java.lang.String, absoluteUrl: java.lang.String, commandName: java.lang.String, value: scala.Double, success: scala.Boolean, resultCode: scala.Double, method: java.lang.String) = this()
  /**
           * The set of fields for a serializeable object.
           * This defines the serialization order and a value of true/false
           * for each field defines whether the field is required or not.
           */
  /* CompleteClass */
  override var aiDataContract: js.Any = js.native
  @JSName("aiDataContract")
  var aiDataContract_RemoteDependencyData: applicationinsightsDashJsLib.Anon_DependencyTypeName = js.native
  /* private */ def formatDependencyName(method: js.Any, absoluteUrl: js.Any): js.Any = js.native
}

@JSGlobal("Microsoft.ApplicationInsights.Telemetry.RemoteDependencyData")
@js.native
object RemoteDependencyData extends js.Object {
  var dataType: java.lang.String = js.native
  var envelopeType: java.lang.String = js.native
}

