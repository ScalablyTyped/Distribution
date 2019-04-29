package typings
package antdDashMobileLib.libListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProps
  extends antdDashMobileLib.libListPropsTypeMod.ListPropsType {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object ListProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    prefixCls: java.lang.String = null,
    renderFooter: () => reactLib.reactMod.ReactNode = null,
    renderHeader: () => reactLib.reactMod.ReactNode = null,
    role: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null
  ): ListProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(js.Any.fromFunction0(renderFooter))
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(js.Any.fromFunction0(renderHeader))
    if (role != null) __obj.updateDynamic("role")(role)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ListProps]
  }
}

