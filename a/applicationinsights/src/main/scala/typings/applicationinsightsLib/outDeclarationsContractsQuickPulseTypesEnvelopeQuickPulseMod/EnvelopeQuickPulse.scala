package typings
package applicationinsightsLib.outDeclarationsContractsQuickPulseTypesEnvelopeQuickPulseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvelopeQuickPulse extends js.Object {
  var Documents: js.Array[
    applicationinsightsLib.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.DocumentQuickPulse
  ]
  var Instance: java.lang.String
  var InstrumentationKey: java.lang.String
  var InvariantVersion: scala.Double
  var MachineName: java.lang.String
  var Metrics: js.Array[
    applicationinsightsLib.outDeclarationsContractsQuickPulseTypesMetricQuickPulseMod.MetricQuickPulse
  ]
  var StreamId: java.lang.String
  var Timestamp: java.lang.String
  var Version: java.lang.String
}

object EnvelopeQuickPulse {
  @scala.inline
  def apply(
    Documents: js.Array[
      applicationinsightsLib.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.DocumentQuickPulse
    ],
    Instance: java.lang.String,
    InstrumentationKey: java.lang.String,
    InvariantVersion: scala.Double,
    MachineName: java.lang.String,
    Metrics: js.Array[
      applicationinsightsLib.outDeclarationsContractsQuickPulseTypesMetricQuickPulseMod.MetricQuickPulse
    ],
    StreamId: java.lang.String,
    Timestamp: java.lang.String,
    Version: java.lang.String
  ): EnvelopeQuickPulse = {
    val __obj = js.Dynamic.literal(Documents = Documents, Instance = Instance, InstrumentationKey = InstrumentationKey, InvariantVersion = InvariantVersion, MachineName = MachineName, Metrics = Metrics, StreamId = StreamId, Timestamp = Timestamp, Version = Version)
  
    __obj.asInstanceOf[EnvelopeQuickPulse]
  }
}

