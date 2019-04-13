package typings
package antdDashMobileDashRnLib.libResultIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultNativeProps
  extends antdDashMobileDashRnLib.libResultPropsTypeMod.ResultPropsType {
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var styles: js.UndefOr[antdDashMobileDashRnLib.libResultStyleIndexDotNativeMod.IResultStyle] = js.undefined
}

object ResultNativeProps {
  @scala.inline
  def apply(
    buttonText: java.lang.String = null,
    buttonType: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.primary | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.ghost = null,
    img: reactLib.reactMod.ReactNode = null,
    imgUrl: java.lang.String = null,
    message: reactLib.reactMod.ReactNode = null,
    onButtonClick: () => scala.Unit = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    styles: antdDashMobileDashRnLib.libResultStyleIndexDotNativeMod.IResultStyle = null,
    title: reactLib.reactMod.ReactNode = null
  ): ResultNativeProps = {
    val __obj = js.Dynamic.literal()
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText)
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl)
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onButtonClick != null) __obj.updateDynamic("onButtonClick")(js.Any.fromFunction0(onButtonClick))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultNativeProps]
  }
}

