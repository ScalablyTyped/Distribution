package typings
package antdLib.libTagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLDivElement] {
  var afterClose: js.UndefOr[js.Function] = js.undefined
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  var onClose: js.UndefOr[js.Function] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object TagProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLDivElement] = null,
    afterClose: js.Function = null,
    className: java.lang.String = null,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    onClose: js.Function = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): TagProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (afterClose != null) __obj.updateDynamic("afterClose")(afterClose)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (color != null) __obj.updateDynamic("color")(color)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[TagProps]
  }
}

