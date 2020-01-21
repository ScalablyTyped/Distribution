package typings.applicationinsights

import typings.applicationinsights.contractsMod.Envelope
import typings.applicationinsights.quickPulseStateManagerMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/TelemetryProcessors/PerformanceMetricsTelemetryProcessor", JSImport.Namespace)
@js.native
object performanceMetricsTelemetryProcessorMod extends js.Object {
  def performanceMetricsTelemetryProcessor(envelope: Envelope): Boolean = js.native
  def performanceMetricsTelemetryProcessor(envelope: Envelope, client: ^): Boolean = js.native
}

