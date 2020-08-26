package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemMoveTo extends js.Object {
  var Cancel: Boolean = js.native
  val Item: js.Any = js.native
  val MoveTo: typings.activexOutlook.Outlook.Folder = js.native
}

object ItemMoveTo {
  @scala.inline
  def apply(Cancel: Boolean, Item: js.Any, MoveTo: typings.activexOutlook.Outlook.Folder): ItemMoveTo = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], MoveTo = MoveTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemMoveTo]
  }
  @scala.inline
  implicit class ItemMoveToOps[Self <: ItemMoveTo] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any): Self = this.set("Item", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoveTo(value: typings.activexOutlook.Outlook.Folder): Self = this.set("MoveTo", value.asInstanceOf[js.Any])
  }
  
}

