package typings
package antdLib.esTransferListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderedItem extends js.Object {
  var item: antdLib.esTransferMod.TransferItem
  var renderedEl: reactLib.reactMod.ReactNode
  var renderedText: java.lang.String
}

object RenderedItem {
  @scala.inline
  def apply(
    item: antdLib.esTransferMod.TransferItem,
    renderedEl: reactLib.reactMod.ReactNode,
    renderedText: java.lang.String
  ): RenderedItem = {
    val __obj = js.Dynamic.literal(item = item, renderedEl = renderedEl.asInstanceOf[js.Any], renderedText = renderedText)
  
    __obj.asInstanceOf[RenderedItem]
  }
}

