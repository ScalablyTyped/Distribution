package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Explains properties of a menu item */
trait MenuMultipleChange extends js.Object {
  /** unique ID of the group this menu item belongs to */
  var GroupID: scala.Double
  /** unique ID of this menu item */
  var ID: scala.Double
  /** sequence of bytes representing a possible image */
  var Image: activexDashInteropLib.SafeArray[scala.Double]
  /** true if active, so clickable */
  var IsActive: scala.Boolean
  /** true if checkable, so there can be a checkmark */
  var IsCheckable: scala.Boolean
  /** true if there is a checkmark */
  var IsChecked: scala.Boolean
  /** true if visible */
  var IsVisible: scala.Boolean
  /** text of the menu item */
  var ItemText: java.lang.String
  /** unique ID of the item directly above this menu item, used for fuzzy placement */
  var PreItemID: scala.Double
}

object MenuMultipleChange {
  @scala.inline
  def apply(
    GroupID: scala.Double,
    ID: scala.Double,
    Image: activexDashInteropLib.SafeArray[scala.Double],
    IsActive: scala.Boolean,
    IsCheckable: scala.Boolean,
    IsChecked: scala.Boolean,
    IsVisible: scala.Boolean,
    ItemText: java.lang.String,
    PreItemID: scala.Double
  ): MenuMultipleChange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GroupID")(GroupID)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("Image")(Image)
    __obj.updateDynamic("IsActive")(IsActive)
    __obj.updateDynamic("IsCheckable")(IsCheckable)
    __obj.updateDynamic("IsChecked")(IsChecked)
    __obj.updateDynamic("IsVisible")(IsVisible)
    __obj.updateDynamic("ItemText")(ItemText)
    __obj.updateDynamic("PreItemID")(PreItemID)
    __obj.asInstanceOf[MenuMultipleChange]
  }
}

