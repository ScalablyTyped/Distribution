package typings.antd.libTransferRenderListBodyMod

import typings.antd.libTransferListMod.RenderedItem
import typings.antd.libTransferMod.TransferItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof antd.antd/lib/transfer/list.TransferListProps, antd.antd/lib/transfer/renderListBody.OmitProp> ]: antd.antd/lib/transfer/list.TransferListProps[P]} */ trait TransferListBodyProps extends js.Object {
  var filteredItems: js.Array[TransferItem]
  var filteredRenderItems: js.Array[RenderedItem]
  var selectedKeys: js.Array[String]
}

object TransferListBodyProps {
  @scala.inline
  def apply(
    filteredItems: js.Array[TransferItem],
    filteredRenderItems: js.Array[RenderedItem],
    selectedKeys: js.Array[String]
  ): TransferListBodyProps = {
    val __obj = js.Dynamic.literal(filteredItems = filteredItems, filteredRenderItems = filteredRenderItems, selectedKeys = selectedKeys)
  
    __obj.asInstanceOf[TransferListBodyProps]
  }
}

