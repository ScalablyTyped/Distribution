package typings
package applicationinsightsLib.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights", JSImport.Namespace)
@js.native
object applicationinsightsModMembers extends js.Object {
  var defaultClient: TelemetryClient = js.native
  def dispose(): scala.Unit = js.native
  def getCorrelationContext(): applicationinsightsLib.outAutoCollectionCorrelationContextManagerMod.CorrelationContext = js.native
  def setup(): org.scalablytyped.runtime.Instantiable0[Configuration] = js.native
  def setup(instrumentationKey: java.lang.String): org.scalablytyped.runtime.Instantiable0[Configuration] = js.native
  def start(): org.scalablytyped.runtime.Instantiable0[Configuration] = js.native
  def wrapWithCorrelationContext[T /* <: js.Function */](fn: T): T = js.native
}

