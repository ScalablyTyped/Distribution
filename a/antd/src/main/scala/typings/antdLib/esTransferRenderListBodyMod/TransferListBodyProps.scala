package typings
package antdLib.esTransferRenderListBodyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof antd.antd/es/transfer/list.TransferListProps, antd.antd/es/transfer/renderListBody.OmitProp> ]: antd.antd/es/transfer/list.TransferListProps[P]} */ trait TransferListBodyProps extends js.Object {
  var filteredItems: js.Array[antdLib.esTransferMod.TransferItem]
  var filteredRenderItems: js.Array[antdLib.esTransferListMod.RenderedItem]
  var selectedKeys: js.Array[java.lang.String]
}

object TransferListBodyProps {
  @scala.inline
  def apply(
    filteredItems: js.Array[antdLib.esTransferMod.TransferItem],
    filteredRenderItems: js.Array[antdLib.esTransferListMod.RenderedItem],
    selectedKeys: js.Array[java.lang.String]
  ): TransferListBodyProps = {
    val __obj = js.Dynamic.literal(filteredItems = filteredItems, filteredRenderItems = filteredRenderItems, selectedKeys = selectedKeys)
  
    __obj.asInstanceOf[TransferListBodyProps]
  }
}

