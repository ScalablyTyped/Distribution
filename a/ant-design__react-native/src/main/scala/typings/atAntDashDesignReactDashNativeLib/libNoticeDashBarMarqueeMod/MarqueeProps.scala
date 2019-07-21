package typings
package atAntDashDesignReactDashNativeLib.libNoticeDashBarMarqueeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarqueeProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var fps: js.UndefOr[scala.Double] = js.undefined
  var leading: js.UndefOr[scala.Double] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var text: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var trailing: js.UndefOr[scala.Double] = js.undefined
}

object MarqueeProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    fps: scala.Int | scala.Double = null,
    leading: scala.Int | scala.Double = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    maxWidth: scala.Int | scala.Double = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    text: reactLib.reactMod.ReactNode = null,
    trailing: scala.Int | scala.Double = null
  ): MarqueeProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (fps != null) __obj.updateDynamic("fps")(fps.asInstanceOf[js.Any])
    if (leading != null) __obj.updateDynamic("leading")(leading.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (trailing != null) __obj.updateDynamic("trailing")(trailing.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarqueeProps]
  }
}

