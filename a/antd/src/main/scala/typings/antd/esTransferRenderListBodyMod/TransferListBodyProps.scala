package typings.antd.esTransferRenderListBodyMod

import typings.antd.esTransferListMod.RenderedItem
import typings.antd.esTransferMod.TransferItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof antd.antd/es/transfer/list.TransferListProps, antd.antd/es/transfer/renderListBody.OmitProp> ]: antd.antd/es/transfer/list.TransferListProps[P]} */ trait TransferListBodyProps extends js.Object {
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
    val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], filteredRenderItems = filteredRenderItems.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransferListBodyProps]
  }
}

