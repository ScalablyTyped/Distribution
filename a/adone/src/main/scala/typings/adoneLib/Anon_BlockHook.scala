package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockHook extends js.Object {
  var block: adoneLib.adoneNs.shaniNs.INs.Block
  var hook: adoneLib.adoneNs.shaniNs.INs.Hook
  var test: adoneLib.adoneNs.shaniNs.INs.Test
}

object Anon_BlockHook {
  @scala.inline
  def apply(
    block: adoneLib.adoneNs.shaniNs.INs.Block,
    hook: adoneLib.adoneNs.shaniNs.INs.Hook,
    test: adoneLib.adoneNs.shaniNs.INs.Test
  ): Anon_BlockHook = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("block")(block)
    __obj.updateDynamic("hook")(hook)
    __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[Anon_BlockHook]
  }
}

