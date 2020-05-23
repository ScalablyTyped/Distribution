package typings.activexLibreoffice.com_.sun.star.mozilla

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Explains a change for a menu item */
trait MenuSingleChange extends js.Object {
  /** value of change */
  var Change: js.Any
  /** ID identifying the type of change in the any type change */
  var ChangeID: Double
  /** unique ID of this menu item */
  var ID: Double
}

object MenuSingleChange {
  @scala.inline
  def apply(Change: js.Any, ChangeID: Double, ID: Double): MenuSingleChange = {
    val __obj = js.Dynamic.literal(Change = Change.asInstanceOf[js.Any], ChangeID = ChangeID.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuSingleChange]
  }
}

