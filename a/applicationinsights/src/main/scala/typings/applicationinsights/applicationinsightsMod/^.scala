package typings.applicationinsights.applicationinsightsMod

import typings.applicationinsights.TypeofClassConfiguration
import typings.applicationinsights.outAutoCollectionCorrelationContextManagerMod.CorrelationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var defaultClient: TelemetryClient = js.native
  var liveMetricsClient: typings.applicationinsights.outLibraryQuickPulseStateManagerMod.^ = js.native
  def dispose(): Unit = js.native
  def getCorrelationContext(): CorrelationContext = js.native
  def setup(): TypeofClassConfiguration = js.native
  def setup(instrumentationKey: String): TypeofClassConfiguration = js.native
  def start(): TypeofClassConfiguration = js.native
  def wrapWithCorrelationContext[T /* <: js.Function */](fn: T): T = js.native
}

