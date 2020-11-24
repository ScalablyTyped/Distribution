package typings.antd.anon

import typings.antd.transferListMod.RenderedItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilteredItems[RecordType /* <: typings.antd.transferMod.KeyWiseTransferItem */] extends js.Object {
  
  var filteredItems: js.Array[RecordType] = js.native
  
  var filteredRenderItems: js.Array[RenderedItem[RecordType]] = js.native
}
object FilteredItems {
  
  @scala.inline
  def apply[RecordType /* <: typings.antd.transferMod.KeyWiseTransferItem */](filteredItems: js.Array[RecordType], filteredRenderItems: js.Array[RenderedItem[RecordType]]): FilteredItems[RecordType] = {
    val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], filteredRenderItems = filteredRenderItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilteredItems[RecordType]]
  }
  
  @scala.inline
  implicit class FilteredItemsOps[Self <: FilteredItems[_], RecordType /* <: typings.antd.transferMod.KeyWiseTransferItem */] (val x: Self with FilteredItems[RecordType]) extends AnyVal {
    
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
    def setFilteredItemsVarargs(value: RecordType*): Self = this.set("filteredItems", js.Array(value :_*))
    
    @scala.inline
    def setFilteredItems(value: js.Array[RecordType]): Self = this.set("filteredItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredRenderItemsVarargs(value: RenderedItem[RecordType]*): Self = this.set("filteredRenderItems", js.Array(value :_*))
    
    @scala.inline
    def setFilteredRenderItems(value: js.Array[RenderedItem[RecordType]]): Self = this.set("filteredRenderItems", value.asInstanceOf[js.Any])
  }
}
