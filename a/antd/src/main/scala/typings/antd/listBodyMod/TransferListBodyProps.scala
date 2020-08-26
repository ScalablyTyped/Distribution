package typings.antd.listBodyMod

import typings.antd.transferListMod.RenderedItem
import typings.antd.transferMod.TransferItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof antd.antd/lib/transfer/list.TransferListProps, antd.antd/lib/transfer/ListBody.OmitProp> ]: antd.antd/lib/transfer/list.TransferListProps[P]} */ @js.native
trait TransferListBodyProps extends js.Object {
  var filteredItems: js.Array[TransferItem] = js.native
  var filteredRenderItems: js.Array[RenderedItem] = js.native
  var selectedKeys: js.Array[String] = js.native
}

object TransferListBodyProps {
  @scala.inline
  def apply(
    filteredItems: js.Array[TransferItem],
    filteredRenderItems: js.Array[RenderedItem],
    selectedKeys: js.Array[String]
  ): TransferListBodyProps = {
    val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], filteredRenderItems = filteredRenderItems.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferListBodyProps]
  }
  @scala.inline
  implicit class TransferListBodyPropsOps[Self <: TransferListBodyProps] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setSelectedKeysVarargs(value: String*): Self = this.set("selectedKeys", js.Array(value :_*))
    @scala.inline
    def setSelectedKeys(value: js.Array[String]): Self = this.set("selectedKeys", value.asInstanceOf[js.Any])
  }
  
}

