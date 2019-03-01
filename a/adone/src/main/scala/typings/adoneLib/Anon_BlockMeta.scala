package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockMeta extends js.Object {
  var block: adoneLib.adoneNs.shaniNs.INs.Block
  var meta: adoneLib.adoneNs.shaniNs.INs.ExecutionResult
  var test: adoneLib.adoneNs.shaniNs.INs.Test
}

object Anon_BlockMeta {
  @scala.inline
  def apply(
    block: adoneLib.adoneNs.shaniNs.INs.Block,
    meta: adoneLib.adoneNs.shaniNs.INs.ExecutionResult,
    test: adoneLib.adoneNs.shaniNs.INs.Test
  ): Anon_BlockMeta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("block")(block)
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[Anon_BlockMeta]
  }
}

