package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyActiveItem extends js.Object {
  var copyActiveItem: js.UndefOr[Boolean] = js.native
  var items: js.UndefOr[js.Array[js.Object]] = js.native
}

object CopyActiveItem {
  @scala.inline
  def apply(): CopyActiveItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyActiveItem]
  }
  @scala.inline
  implicit class CopyActiveItemOps[Self <: CopyActiveItem] (val x: Self) extends AnyVal {
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
    def setCopyActiveItem(value: Boolean): Self = this.set("copyActiveItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyActiveItem: Self = this.set("copyActiveItem", js.undefined)
    @scala.inline
    def setItemsVarargs(value: js.Object*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[js.Object]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

