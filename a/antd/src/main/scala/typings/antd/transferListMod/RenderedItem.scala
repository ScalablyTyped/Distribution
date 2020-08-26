package typings.antd.transferListMod

import typings.antd.transferMod.TransferItem
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderedItem extends js.Object {
  var item: TransferItem = js.native
  var renderedEl: ReactNode = js.native
  var renderedText: String = js.native
}

object RenderedItem {
  @scala.inline
  def apply(item: TransferItem, renderedText: String): RenderedItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], renderedText = renderedText.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderedItem]
  }
  @scala.inline
  implicit class RenderedItemOps[Self <: RenderedItem] (val x: Self) extends AnyVal {
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
    def setItem(value: TransferItem): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderedText(value: String): Self = this.set("renderedText", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderedEl(value: ReactNode): Self = this.set("renderedEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderedEl: Self = this.set("renderedEl", js.undefined)
  }
  
}

