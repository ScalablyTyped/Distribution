package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_After extends js.Object {
  var after: js.Array[adoneLib.adoneNs.shaniNs.INs.Hook]
  var afterEach: js.Array[adoneLib.adoneNs.shaniNs.INs.Hook]
  var before: js.Array[adoneLib.adoneNs.shaniNs.INs.Hook]
  var beforeEach: js.Array[adoneLib.adoneNs.shaniNs.INs.Hook]
}

object Anon_After {
  @scala.inline
  def apply(
    after: js.Array[adoneLib.adoneNs.shaniNs.INs.Hook],
    afterEach: js.Array[adoneLib.adoneNs.shaniNs.INs.Hook],
    before: js.Array[adoneLib.adoneNs.shaniNs.INs.Hook],
    beforeEach: js.Array[adoneLib.adoneNs.shaniNs.INs.Hook]
  ): Anon_After = {
    val __obj = js.Dynamic.literal(after = after, afterEach = afterEach, before = before, beforeEach = beforeEach)
  
    __obj.asInstanceOf[Anon_After]
  }
}

