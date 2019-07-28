package typings.adone

import typings.adone.adoneNs.shaniNs.INs.Block
import typings.adone.adoneNs.shaniNs.INs.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockRuntime extends js.Object {
  var block: Block
  var runtime: Boolean
  var test: Test
}

object Anon_BlockRuntime {
  @scala.inline
  def apply(block: Block, runtime: Boolean, test: Test): Anon_BlockRuntime = {
    val __obj = js.Dynamic.literal(block = block, runtime = runtime, test = test)
  
    __obj.asInstanceOf[Anon_BlockRuntime]
  }
}

