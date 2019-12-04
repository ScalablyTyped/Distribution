package typings.applicationinsights

import typings.applicationinsights.outDeclarationsContractsMod.Envelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/TelemetryProcessors/SamplingTelemetryProcessor", JSImport.Namespace)
@js.native
object outTelemetryProcessorsSamplingTelemetryProcessorMod extends js.Object {
  def getSamplingHashCode(input: String): Double = js.native
  def samplingTelemetryProcessor(envelope: Envelope, contextObjects: Anon_CorrelationContext): Boolean = js.native
}

