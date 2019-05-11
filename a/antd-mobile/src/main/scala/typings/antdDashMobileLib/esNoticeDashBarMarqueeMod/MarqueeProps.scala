package typings
package antdDashMobileLib.esNoticeDashBarMarqueeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarqueeProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var fps: js.UndefOr[scala.Double] = js.undefined
  var leading: js.UndefOr[scala.Double] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var text: java.lang.String
  var trailing: js.UndefOr[scala.Double] = js.undefined
}

object MarqueeProps {
  @scala.inline
  def apply(
    text: java.lang.String,
    className: java.lang.String = null,
    fps: scala.Int | scala.Double = null,
    leading: scala.Int | scala.Double = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    trailing: scala.Int | scala.Double = null
  ): MarqueeProps = {
    val __obj = js.Dynamic.literal(text = text)
    if (className != null) __obj.updateDynamic("className")(className)
    if (fps != null) __obj.updateDynamic("fps")(fps.asInstanceOf[js.Any])
    if (leading != null) __obj.updateDynamic("leading")(leading.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (trailing != null) __obj.updateDynamic("trailing")(trailing.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarqueeProps]
  }
}

