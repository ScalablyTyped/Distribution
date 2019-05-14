package typings
package antdLib.libTransferRenderListBodyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof antd.antd/lib/transfer/list.TransferListProps, antd.antd/lib/transfer/renderListBody.OmitProp> ]: antd.antd/lib/transfer/list.TransferListProps[P]} */ trait TransferListBodyProps extends js.Object {
  var filteredItems: js.Array[antdLib.libTransferMod.TransferItem]
  var filteredRenderItems: js.Array[antdLib.libTransferListMod.RenderedItem]
  var selectedKeys: js.Array[java.lang.String]
}

object TransferListBodyProps {
  @scala.inline
  def apply(
    filteredItems: js.Array[antdLib.libTransferMod.TransferItem],
    filteredRenderItems: js.Array[antdLib.libTransferListMod.RenderedItem],
    selectedKeys: js.Array[java.lang.String]
  ): TransferListBodyProps = {
    val __obj = js.Dynamic.literal(filteredItems = filteredItems, filteredRenderItems = filteredRenderItems, selectedKeys = selectedKeys)
  
    __obj.asInstanceOf[TransferListBodyProps]
  }
}

