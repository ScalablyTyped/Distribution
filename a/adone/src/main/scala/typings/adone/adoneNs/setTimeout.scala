package typings.adone.adoneNs

import typings.node.NodeJSNs.Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.setTimeout")
@js.native
object setTimeout extends js.Object {
  def apply(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
}

