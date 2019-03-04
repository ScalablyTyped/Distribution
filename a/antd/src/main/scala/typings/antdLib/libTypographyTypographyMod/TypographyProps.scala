package typings
package antdLib.libTypographyTypographyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypographyProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object TypographyProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    id: java.lang.String = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): TypographyProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TypographyProps]
  }
}

