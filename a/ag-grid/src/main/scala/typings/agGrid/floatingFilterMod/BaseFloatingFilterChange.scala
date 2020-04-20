package typings.agGrid.floatingFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseFloatingFilterChange[M] extends FloatingFilterChange {
  @JSName("apply")
  var apply: Boolean
  var model: M
}

object BaseFloatingFilterChange {
  @scala.inline
  def apply[M](apply: Boolean, model: M): BaseFloatingFilterChange[M] = {
    val __obj = js.Dynamic.literal(apply = apply.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFloatingFilterChange[M]]
  }
}

