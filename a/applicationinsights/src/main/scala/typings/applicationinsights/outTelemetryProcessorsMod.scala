package typings.applicationinsights

import typings.applicationinsights.outDeclarationsContractsMod.Envelope
import typings.applicationinsights.outLibraryQuickPulseStateManagerMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/TelemetryProcessors", JSImport.Namespace)
@js.native
object outTelemetryProcessorsMod extends js.Object {
  def getSamplingHashCode(input: String): Double = js.native
  def performanceMetricsTelemetryProcessor(envelope: Envelope): Boolean = js.native
  def performanceMetricsTelemetryProcessor(envelope: Envelope, client: ^): Boolean = js.native
  def samplingTelemetryProcessor(envelope: Envelope, contextObjects: Anon_CorrelationContext): Boolean = js.native
}

