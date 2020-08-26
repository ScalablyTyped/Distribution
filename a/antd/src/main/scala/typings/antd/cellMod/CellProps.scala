package typings.antd.cellMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellProps extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var colon: js.UndefOr[Boolean] = js.native
  var component: String = js.native
  var content: js.UndefOr[ReactNode] = js.native
  var itemPrefixCls: String = js.native
  var label: js.UndefOr[ReactNode] = js.native
  var span: Double = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object CellProps {
  @scala.inline
  def apply(component: String, itemPrefixCls: String, span: Double): CellProps = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], itemPrefixCls = itemPrefixCls.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellProps]
  }
  @scala.inline
  implicit class CellPropsOps[Self <: CellProps] (val x: Self) extends AnyVal {
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
    def setComponent(value: String): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemPrefixCls(value: String): Self = this.set("itemPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpan(value: Double): Self = this.set("span", value.asInstanceOf[js.Any])
    @scala.inline
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColon(value: Boolean): Self = this.set("colon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColon: Self = this.set("colon", js.undefined)
    @scala.inline
    def setContent(value: ReactNode): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

