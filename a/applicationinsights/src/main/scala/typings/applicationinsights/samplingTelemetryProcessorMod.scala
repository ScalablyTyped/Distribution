package typings.applicationinsights

import typings.applicationinsights.contractsMod.Envelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/TelemetryProcessors/SamplingTelemetryProcessor", JSImport.Namespace)
@js.native
object samplingTelemetryProcessorMod extends js.Object {
  def getSamplingHashCode(input: String): Double = js.native
  def samplingTelemetryProcessor(envelope: Envelope, contextObjects: AnonCorrelationContext): Boolean = js.native
}

