package typings
package antdLib.esAvatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarProps extends js.Object {
  var alt: js.UndefOr[java.lang.String] = js.undefined
  var children: js.UndefOr[js.Any] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Type of the Icon to be used in avatar */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var onError: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  /** Shape of avatar, options:`circle`, `square` */
  var shape: js.UndefOr[antdLib.antdLibStrings.circle | antdLib.antdLibStrings.square] = js.undefined
  var size: js.UndefOr[
    antdLib.antdLibStrings.large | antdLib.antdLibStrings.small | antdLib.antdLibStrings.default | scala.Double
  ] = js.undefined
  /** Src of image avatar */
  var src: js.UndefOr[java.lang.String] = js.undefined
  /** Srcset of image avatar */
  var srcSet: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object AvatarProps {
  @scala.inline
  def apply(
    alt: java.lang.String = null,
    children: js.Any = null,
    className: java.lang.String = null,
    icon: java.lang.String = null,
    onError: () => scala.Boolean = null,
    prefixCls: java.lang.String = null,
    shape: antdLib.antdLibStrings.circle | antdLib.antdLibStrings.square = null,
    size: antdLib.antdLibStrings.large | antdLib.antdLibStrings.small | antdLib.antdLibStrings.default | scala.Double = null,
    src: java.lang.String = null,
    srcSet: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null
  ): AvatarProps = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction0(onError))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src)
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[AvatarProps]
  }
}

