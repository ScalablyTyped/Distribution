package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAriaProvider extends js.Object {
  def disableWarnings(): scala.Unit
}

object IAriaProvider {
  @scala.inline
  def apply(disableWarnings: () => scala.Unit): IAriaProvider = {
    val __obj = js.Dynamic.literal(disableWarnings = js.Any.fromFunction0(disableWarnings))
  
    __obj.asInstanceOf[IAriaProvider]
  }
}

