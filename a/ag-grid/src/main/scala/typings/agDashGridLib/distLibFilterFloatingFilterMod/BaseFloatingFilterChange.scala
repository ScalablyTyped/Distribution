package typings
package agDashGridLib.distLibFilterFloatingFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseFloatingFilterChange[M] extends FloatingFilterChange {
  @JSName("apply")
  var apply: scala.Boolean
  var model: M
}

object BaseFloatingFilterChange {
  @scala.inline
  def apply[M](apply: scala.Boolean, model: M): BaseFloatingFilterChange[M] = {
    val __obj = js.Dynamic.literal(apply = apply, model = model.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseFloatingFilterChange[M]]
  }
}

