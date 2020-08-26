package typings.activexLibreoffice.com_.sun.star.mozilla

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Explains properties of a menu item */
@js.native
trait MenuMultipleChange extends js.Object {
  /** unique ID of the group this menu item belongs to */
  var GroupID: Double = js.native
  /** unique ID of this menu item */
  var ID: Double = js.native
  /** sequence of bytes representing a possible image */
  var Image: SafeArray[Double] = js.native
  /** true if active, so clickable */
  var IsActive: Boolean = js.native
  /** true if checkable, so there can be a checkmark */
  var IsCheckable: Boolean = js.native
  /** true if there is a checkmark */
  var IsChecked: Boolean = js.native
  /** true if visible */
  var IsVisible: Boolean = js.native
  /** text of the menu item */
  var ItemText: String = js.native
  /** unique ID of the item directly above this menu item, used for fuzzy placement */
  var PreItemID: Double = js.native
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
  @scala.inline
  implicit class MenuMultipleChangeOps[Self <: MenuMultipleChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGroupID(value: Double): Self = this.set("GroupID", value.asInstanceOf[js.Any])
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: SafeArray[Double]): Self = this.set("Image", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("IsActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCheckable(value: Boolean): Self = this.set("IsCheckable", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsChecked(value: Boolean): Self = this.set("IsChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("IsVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemText(value: String): Self = this.set("ItemText", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreItemID(value: Double): Self = this.set("PreItemID", value.asInstanceOf[js.Any])
  }
  
}

