package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockHookMeta extends js.Object {
  var block: adoneLib.adoneNs.shaniNs.INs.Block
  var hook: adoneLib.adoneNs.shaniNs.INs.Hook
  var meta: adoneLib.adoneNs.shaniNs.INs.ExecutionResult
  var test: adoneLib.adoneNs.shaniNs.INs.Test
}

object Anon_BlockHookMeta {
  @scala.inline
  def apply(
    block: adoneLib.adoneNs.shaniNs.INs.Block,
    hook: adoneLib.adoneNs.shaniNs.INs.Hook,
    meta: adoneLib.adoneNs.shaniNs.INs.ExecutionResult,
    test: adoneLib.adoneNs.shaniNs.INs.Test
  ): Anon_BlockHookMeta = {
    val __obj = js.Dynamic.literal(block = block, hook = hook, meta = meta, test = test)
  
    __obj.asInstanceOf[Anon_BlockHookMeta]
  }
}

