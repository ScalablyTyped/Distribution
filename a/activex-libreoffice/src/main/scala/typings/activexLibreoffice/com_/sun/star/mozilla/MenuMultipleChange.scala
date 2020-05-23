package typings.activexLibreoffice.com_.sun.star.mozilla

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
    val __obj = js.Dynamic.literal(GroupID = GroupID.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], IsActive = IsActive.asInstanceOf[js.Any], IsCheckable = IsCheckable.asInstanceOf[js.Any], IsChecked = IsChecked.asInstanceOf[js.Any], IsVisible = IsVisible.asInstanceOf[js.Any], ItemText = ItemText.asInstanceOf[js.Any], PreItemID = PreItemID.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuMultipleChange]
  }
}

