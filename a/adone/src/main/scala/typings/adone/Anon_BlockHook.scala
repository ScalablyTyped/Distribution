package typings.adone

import typings.adone.adoneNs.shaniNs.INs.Block
import typings.adone.adoneNs.shaniNs.INs.Hook
import typings.adone.adoneNs.shaniNs.INs.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockHook extends js.Object {
  var block: Block
  var hook: Hook
  var test: Test
}

object Anon_BlockHook {
  @scala.inline
  def apply(block: Block, hook: Hook, test: Test): Anon_BlockHook = {
    val __obj = js.Dynamic.literal(block = block, hook = hook, test = test)
  
    __obj.asInstanceOf[Anon_BlockHook]
  }
}

