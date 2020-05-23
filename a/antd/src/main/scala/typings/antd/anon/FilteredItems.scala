package typings.antd.anon

import typings.antd.transferListMod.RenderedItem
import typings.antd.transferMod.TransferItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilteredItems extends js.Object {
  var filteredItems: js.Array[TransferItem]
  var filteredRenderItems: js.Array[RenderedItem]
}

object FilteredItems {
  @scala.inline
  def apply(filteredItems: js.Array[TransferItem], filteredRenderItems: js.Array[RenderedItem]): FilteredItems = {
    val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], filteredRenderItems = filteredRenderItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilteredItems]
  }
}

