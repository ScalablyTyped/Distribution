package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockRuntime extends js.Object {
  var block: adoneLib.adoneNs.shaniNs.INs.Block
  var runtime: scala.Boolean
  var test: adoneLib.adoneNs.shaniNs.INs.Test
}

object Anon_BlockRuntime {
  @scala.inline
  def apply(
    block: adoneLib.adoneNs.shaniNs.INs.Block,
    runtime: scala.Boolean,
    test: adoneLib.adoneNs.shaniNs.INs.Test
  ): Anon_BlockRuntime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("block")(block)
    __obj.updateDynamic("runtime")(runtime)
    __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[Anon_BlockRuntime]
  }
}

