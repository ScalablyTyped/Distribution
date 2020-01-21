package typings.applicationinsights

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/AutoCollection/diagnostic-channel/initialization", JSImport.Namespace)
@js.native
object initializationMod extends js.Object {
  val IsInitialized: Boolean = js.native
  def registerContextPreservation(cb: js.Function1[/* cb */ js.Function, js.Function]): Unit = js.native
}

