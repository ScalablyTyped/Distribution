package typings.applicationinsights.quickPulseEnvelopeFactoryMod

import typings.applicationinsights.contractsMod.Envelope
import typings.applicationinsights.documentQuickPulseMod.DocumentQuickPulse
import typings.applicationinsights.envelopeQuickPulseMod.EnvelopeQuickPulse
import typings.applicationinsights.metricQuickPulseMod.MetricQuickPulse
import typings.applicationinsights.metricTelemetryMod.MetricTelemetry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/Library/QuickPulseEnvelopeFactory", JSImport.Namespace)
@js.native
class ^ () extends QuickPulseEnvelopeFactory

@JSImport("applicationinsights/out/Library/QuickPulseEnvelopeFactory", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var keys: js.Any = js.native
  /* private */ def aggregateProperties(envelope: js.Any): js.Any = js.native
  /* private */ def createQuickPulseDependencyDocument(envelope: js.Any): js.Any = js.native
  /* private */ def createQuickPulseDocument(envelope: js.Any): js.Any = js.native
  def createQuickPulseEnvelope(
    metrics: js.Array[MetricQuickPulse],
    documents: js.Array[DocumentQuickPulse],
    config: typings.applicationinsights.configMod.^,
    context: typings.applicationinsights.contextMod.^
  ): EnvelopeQuickPulse = js.native
  /* private */ def createQuickPulseEventDocument(envelope: js.Any): js.Any = js.native
  /* private */ def createQuickPulseExceptionDocument(envelope: js.Any): js.Any = js.native
  def createQuickPulseMetric(telemetry: MetricTelemetry): MetricQuickPulse = js.native
  /* private */ def createQuickPulseRequestDocument(envelope: js.Any): js.Any = js.native
  /* private */ def createQuickPulseTraceDocument(envelope: js.Any): js.Any = js.native
  def telemetryEnvelopeToQuickPulseDocument(envelope: Envelope): DocumentQuickPulse = js.native
}

