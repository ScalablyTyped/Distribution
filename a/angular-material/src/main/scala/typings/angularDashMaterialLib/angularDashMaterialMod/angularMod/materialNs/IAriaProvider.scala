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
  def apply(disableWarnings: js.Function0[scala.Unit]): IAriaProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disableWarnings")(disableWarnings)
    __obj.asInstanceOf[IAriaProvider]
  }
}

