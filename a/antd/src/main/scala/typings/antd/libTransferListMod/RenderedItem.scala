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
  def apply(item: TransferItem, renderedEl: ReactNode, renderedText: String): RenderedItem = {
    val __obj = js.Dynamic.literal(item = item, renderedEl = renderedEl.asInstanceOf[js.Any], renderedText = renderedText)
  
    __obj.asInstanceOf[RenderedItem]
  }
}

