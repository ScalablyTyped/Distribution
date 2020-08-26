package typings.antd.transferListItemMod

import typings.antd.transferMod.TransferItem
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var item: TransferItem = js.native
  var onRemove: js.UndefOr[js.Function1[/* item */ TransferItem, Unit]] = js.native
  var prefixCls: String = js.native
  var renderedEl: ReactNode = js.native
  var renderedText: js.UndefOr[String | Double] = js.native
  var showRemove: js.UndefOr[Boolean] = js.native
  def onClick(item: TransferItem): Unit = js.native
}

object ListItemProps {
  @scala.inline
  def apply(item: TransferItem, onClick: TransferItem => Unit, prefixCls: String): ListItemProps = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemProps]
  }
  @scala.inline
  implicit class ListItemPropsOps[Self <: ListItemProps] (val x: Self) extends AnyVal {
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
    def setOnClick(value: TransferItem => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setOnRemove(value: /* item */ TransferItem => Unit): Self = this.set("onRemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    @scala.inline
    def setRenderedEl(value: ReactNode): Self = this.set("renderedEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderedEl: Self = this.set("renderedEl", js.undefined)
    @scala.inline
    def setRenderedText(value: String | Double): Self = this.set("renderedText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderedText: Self = this.set("renderedText", js.undefined)
    @scala.inline
    def setShowRemove(value: Boolean): Self = this.set("showRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRemove: Self = this.set("showRemove", js.undefined)
  }
  
}

