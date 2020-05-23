package typings.antDesignReactNative.toastContainerMod

import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.toastStyleMod.ToastStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastProps extends WithThemeStyles[ToastStyle] {
  var content: String
  var duration: js.UndefOr[Double] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
  var onAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ToastProps {
  @scala.inline
  def apply(
    content: String,
    duration: js.UndefOr[Double] = js.undefined,
    mask: js.UndefOr[Boolean] = js.undefined,
    onAnimationEnd: () => Unit = null,
    onClose: () => Unit = null,
    styles: Partial[ToastStyle] = null,
    `type`: String = null
  ): ToastProps = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.get.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction0(onAnimationEnd))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastProps]
  }
}

