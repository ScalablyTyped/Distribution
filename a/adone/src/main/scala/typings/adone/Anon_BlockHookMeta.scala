package typings.adone

import typings.adone.adoneNs.shaniNs.INs.Block
import typings.adone.adoneNs.shaniNs.INs.ExecutionResult
import typings.adone.adoneNs.shaniNs.INs.Hook
import typings.adone.adoneNs.shaniNs.INs.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockHookMeta extends js.Object {
  var block: Block
  var hook: Hook
  var meta: ExecutionResult
  var test: Test
}

object Anon_BlockHookMeta {
  @scala.inline
  def apply(block: Block, hook: Hook, meta: ExecutionResult, test: Test): Anon_BlockHookMeta = {
    val __obj = js.Dynamic.literal(block = block, hook = hook, meta = meta, test = test)
  
    __obj.asInstanceOf[Anon_BlockHookMeta]
  }
}

