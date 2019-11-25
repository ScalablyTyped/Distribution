package typings.applicationinsights.outDeclarationsContractsQuickPulseTypesEnvelopeQuickPulseMod

import typings.applicationinsights.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.DocumentQuickPulse
import typings.applicationinsights.outDeclarationsContractsQuickPulseTypesMetricQuickPulseMod.MetricQuickPulse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvelopeQuickPulse extends js.Object {
  var Documents: js.Array[DocumentQuickPulse]
  var Instance: String
  var InstrumentationKey: String
  var InvariantVersion: Double
  var MachineName: String
  var Metrics: js.Array[MetricQuickPulse]
  var StreamId: String
  var Timestamp: String
  var Version: String
}

object EnvelopeQuickPulse {
  @scala.inline
  def apply(
    Documents: js.Array[DocumentQuickPulse],
    Instance: String,
    InstrumentationKey: String,
    InvariantVersion: Double,
    MachineName: String,
    Metrics: js.Array[MetricQuickPulse],
    StreamId: String,
    Timestamp: String,
    Version: String
  ): EnvelopeQuickPulse = {
    val __obj = js.Dynamic.literal(Documents = Documents.asInstanceOf[js.Any], Instance = Instance.asInstanceOf[js.Any], InstrumentationKey = InstrumentationKey.asInstanceOf[js.Any], InvariantVersion = InvariantVersion.asInstanceOf[js.Any], MachineName = MachineName.asInstanceOf[js.Any], Metrics = Metrics.asInstanceOf[js.Any], StreamId = StreamId.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EnvelopeQuickPulse]
  }
}

