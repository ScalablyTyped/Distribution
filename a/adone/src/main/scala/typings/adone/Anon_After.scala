package typings.adone

import typings.adone.adoneNs.shaniNs.INs.Hook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_After extends js.Object {
  var after: js.Array[Hook]
  var afterEach: js.Array[Hook]
  var before: js.Array[Hook]
  var beforeEach: js.Array[Hook]
}

object Anon_After {
  @scala.inline
  def apply(
    after: js.Array[Hook],
    afterEach: js.Array[Hook],
    before: js.Array[Hook],
    beforeEach: js.Array[Hook]
  ): Anon_After = {
    val __obj = js.Dynamic.literal(after = after, afterEach = afterEach, before = before, beforeEach = beforeEach)
  
    __obj.asInstanceOf[Anon_After]
  }
}

