package typings.antd.libTransferListMod

import typings.antd.libTransferMod.TransferItem
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderedItem extends js.Object {
  var item: TransferItem
  var renderedEl: ReactNode
  var renderedText: String
}

object RenderedItem {
  @scala.inline
  def apply(item: TransferItem, renderedText: String, renderedEl: ReactNode = null): RenderedItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], renderedText = renderedText.asInstanceOf[js.Any])
    if (renderedEl != null) __obj.updateDynamic("renderedEl")(renderedEl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderedItem]
  }
}

