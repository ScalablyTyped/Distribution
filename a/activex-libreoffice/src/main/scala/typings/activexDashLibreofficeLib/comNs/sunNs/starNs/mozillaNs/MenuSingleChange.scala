package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Explains a change for a menu item */
trait MenuSingleChange extends js.Object {
  /** value of change */
  var Change: js.Any
  /** ID identifying the type of change in the any type change */
  var ChangeID: scala.Double
  /** unique ID of this menu item */
  var ID: scala.Double
}

object MenuSingleChange {
  @scala.inline
  def apply(Change: js.Any, ChangeID: scala.Double, ID: scala.Double): MenuSingleChange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Change")(Change)
    __obj.updateDynamic("ChangeID")(ChangeID)
    __obj.updateDynamic("ID")(ID)
    __obj.asInstanceOf[MenuSingleChange]
  }
}

