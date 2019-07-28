package typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.TelemetryNs.CommonNs

import typings.applicationinsightsDashJs.Anon_BaseData
import typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.ISerializable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.ApplicationInsights.Telemetry.Common.Data")
@js.native
class Data[TDomain] protected ()
  extends typings.applicationinsightsDashJs.MicrosoftNs.TelemetryNs.Data[TDomain]
     with ISerializable {
  /**
    * Constructs a new instance of telemetry data.
    */
  def this(`type`: String, data: TDomain) = this()
  /**
    * The set of fields for a serializeable object.
    * This defines the serialization order and a value of true/false
    * for each field defines whether the field is required or not.
    */
  /* CompleteClass */
  override var aiDataContract: js.Any = js.native
  /**
    * The data contract for serializing this object.
    */
  @JSName("aiDataContract")
  var aiDataContract_Data: Anon_BaseData = js.native
}

