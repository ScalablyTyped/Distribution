package typings.activexDashLibreoffice.comNs.sunNs.starNs.mozillaNs

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Explains properties of a menu item */
trait MenuMultipleChange extends js.Object {
  /** unique ID of the group this menu item belongs to */
  var GroupID: Double
  /** unique ID of this menu item */
  var ID: Double
  /** sequence of bytes representing a possible image */
  var Image: SafeArray[Double]
  /** true if active, so clickable */
  var IsActive: Boolean
  /** true if checkable, so there can be a checkmark */
  var IsCheckable: Boolean
  /** true if there is a checkmark */
  var IsChecked: Boolean
  /** true if visible */
  var IsVisible: Boolean
  /** text of the menu item */
  var ItemText: String
  /** unique ID of the item directly above this menu item, used for fuzzy placement */
  var PreItemID: Double
}

object MenuMultipleChange {
  @scala.inline
  def apply(
    GroupID: Double,
    ID: Double,
    Image: SafeArray[Double],
    IsActive: Boolean,
    IsCheckable: Boolean,
    IsChecked: Boolean,
    IsVisible: Boolean,
    ItemText: String,
    PreItemID: Double
  ): MenuMultipleChange = {
    val __obj = js.Dynamic.literal(GroupID = GroupID, ID = ID, Image = Image, IsActive = IsActive, IsCheckable = IsCheckable, IsChecked = IsChecked, IsVisible = IsVisible, ItemText = ItemText, PreItemID = PreItemID)
  
    __obj.asInstanceOf[MenuMultipleChange]
  }
}

