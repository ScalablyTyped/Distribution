package typings.antd.anon

import typings.antd.transferListMod.RenderedItem
import typings.antd.transferMod.TransferItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilteredItems extends js.Object {
  var filteredItems: js.Array[TransferItem] = js.native
  var filteredRenderItems: js.Array[RenderedItem] = js.native
}

object FilteredItems {
  @scala.inline
  def apply(filteredItems: js.Array[TransferItem], filteredRenderItems: js.Array[RenderedItem]): FilteredItems = {
    val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], filteredRenderItems = filteredRenderItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilteredItems]
  }
  @scala.inline
  implicit class FilteredItemsOps[Self <: FilteredItems] (val x: Self) extends AnyVal {
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
    def setFilteredItemsVarargs(value: TransferItem*): Self = this.set("filteredItems", js.Array(value :_*))
    @scala.inline
    def setFilteredItems(value: js.Array[TransferItem]): Self = this.set("filteredItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilteredRenderItemsVarargs(value: RenderedItem*): Self = this.set("filteredRenderItems", js.Array(value :_*))
    @scala.inline
    def setFilteredRenderItems(value: js.Array[RenderedItem]): Self = this.set("filteredRenderItems", value.asInstanceOf[js.Any])
  }
  
}

