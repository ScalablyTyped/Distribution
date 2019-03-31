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
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object ListProps {
  @scala.inline
  def apply(
    children: antdDashMobileLib.antdDashMobileLibNumbers.`false` | reactLib.reactMod.Global.JSXNs.Element | js.Array[reactLib.reactMod.Global.JSXNs.Element] = null,
    className: java.lang.String = null,
    prefixCls: java.lang.String = null,
    renderFooter: js.Function0[reactLib.reactMod.ReactNs.ReactType[_]] | java.lang.String | reactLib.reactMod.Global.JSXNs.Element = null,
    renderHeader: js.Function0[reactLib.reactMod.ReactNs.ReactType[_]] | java.lang.String | reactLib.reactMod.Global.JSXNs.Element = null,
    role: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): ListProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(renderFooter.asInstanceOf[js.Any])
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(renderHeader.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ListProps]
  }
}

