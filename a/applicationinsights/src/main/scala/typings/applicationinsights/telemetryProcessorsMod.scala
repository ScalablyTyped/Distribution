package typings.applicationinsights

import typings.applicationinsights.contractsMod.Envelope
import typings.applicationinsights.quickPulseStateManagerMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/TelemetryProcessors", JSImport.Namespace)
@js.native
object telemetryProcessorsMod extends js.Object {
  def getSamplingHashCode(input: String): Double = js.native
  def performanceMetricsTelemetryProcessor(envelope: Envelope): Boolean = js.native
  def performanceMetricsTelemetryProcessor(envelope: Envelope, client: ^): Boolean = js.native
  def samplingTelemetryProcessor(envelope: Envelope, contextObjects: AnonCorrelationContext): Boolean = js.native
}

