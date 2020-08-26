package typings.antd.listItemMod

import typings.antd.listMod.ListGridType
import typings.react.mod.CSSProperties
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemProps extends HTMLAttributes[HTMLDivElement] {
  var actions: js.UndefOr[js.Array[ReactNode]] = js.native
  var colStyle: js.UndefOr[CSSProperties] = js.native
  var extra: js.UndefOr[ReactNode] = js.native
  var grid: js.UndefOr[ListGridType] = js.native
  var prefixCls: js.UndefOr[String] = js.native
}

object ListItemProps {
  @scala.inline
  def apply(): ListItemProps = {
    val __obj = js.Dynamic.literal()
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
    def setActionsVarargs(value: ReactNode*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[ReactNode]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setColStyle(value: CSSProperties): Self = this.set("colStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColStyle: Self = this.set("colStyle", js.undefined)
    @scala.inline
    def setExtra(value: ReactNode): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setGrid(value: ListGridType): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
  }
  
}

