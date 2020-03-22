package typings.antdMobile

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd-mobile.antd-mobile/lib/list.ListProps> */
trait PartialListProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var renderFooter: js.UndefOr[js.Function0[ReactNode] | ReactNode] = js.undefined
  var renderHeader: js.UndefOr[js.Function0[ReactNode] | ReactNode] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PartialListProps {
  @scala.inline
  def apply(
    className: String = null,
    prefixCls: String = null,
    renderFooter: js.Function0[ReactNode] | ReactNode = null,
    renderHeader: js.Function0[ReactNode] | ReactNode = null,
    role: String = null,
    style: CSSProperties = null
  ): PartialListProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(renderFooter.asInstanceOf[js.Any])
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(renderHeader.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialListProps]
  }
}

