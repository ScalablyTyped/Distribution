package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.esTransferListMod.RenderedItem
import typings.antd.esTransferMod.TransferItem
import typings.antd.esTransferRenderListBodyMod.TransferListBodyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object renderListBody
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.antd.esTransferRenderListBodyMod.^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[String | js.Object]
  def apply(
    filteredItems: js.Array[TransferItem],
    filteredRenderItems: js.Array[RenderedItem],
    selectedKeys: js.Array[String]
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(filteredItems = filteredItems, filteredRenderItems = filteredRenderItems, selectedKeys = selectedKeys)
  
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TransferListBodyProps
}

