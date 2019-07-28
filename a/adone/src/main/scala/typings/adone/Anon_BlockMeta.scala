package typings.adone

import typings.adone.adoneNs.shaniNs.INs.Block
import typings.adone.adoneNs.shaniNs.INs.ExecutionResult
import typings.adone.adoneNs.shaniNs.INs.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockMeta extends js.Object {
  var block: Block
  var meta: ExecutionResult
  var test: Test
}

object Anon_BlockMeta {
  @scala.inline
  def apply(block: Block, meta: ExecutionResult, test: Test): Anon_BlockMeta = {
    val __obj = js.Dynamic.literal(block = block, meta = meta, test = test)
  
    __obj.asInstanceOf[Anon_BlockMeta]
  }
}

