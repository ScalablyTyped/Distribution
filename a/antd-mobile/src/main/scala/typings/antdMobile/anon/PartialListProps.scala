package typings.antdMobile.anon

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd-mobile.antd-mobile/lib/list.ListProps> */
@js.native
trait PartialListProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var renderFooter: js.UndefOr[js.Function0[ReactNode] | ReactNode] = js.native
  var renderHeader: js.UndefOr[js.Function0[ReactNode] | ReactNode] = js.native
  var role: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object PartialListProps {
  @scala.inline
  def apply(): PartialListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListProps]
  }
  @scala.inline
  implicit class PartialListPropsOps[Self <: PartialListProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRenderFooterFunction0(value: () => ReactNode): Self = this.set("renderFooter", js.Any.fromFunction0(value))
    @scala.inline
    def setRenderFooter(value: js.Function0[ReactNode] | ReactNode): Self = this.set("renderFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderFooter: Self = this.set("renderFooter", js.undefined)
    @scala.inline
    def setRenderHeaderFunction0(value: () => ReactNode): Self = this.set("renderHeader", js.Any.fromFunction0(value))
    @scala.inline
    def setRenderHeader(value: js.Function0[ReactNode] | ReactNode): Self = this.set("renderHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderHeader: Self = this.set("renderHeader", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

