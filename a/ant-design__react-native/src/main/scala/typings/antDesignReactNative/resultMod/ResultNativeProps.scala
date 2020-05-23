package typings.antDesignReactNative.resultMod

import typings.antDesignReactNative.antDesignReactNativeStrings.ghost
import typings.antDesignReactNative.antDesignReactNativeStrings.primary
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.resultPropsTypeMod.ResultPropsType
import typings.antDesignReactNative.resultStyleMod.ResultStyle
import typings.react.mod.ReactNode
import typings.reactNative.mod.ImagePropertiesSourceOptions
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultNativeProps
  extends ResultPropsType
     with WithThemeStyles[ResultStyle] {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object ResultNativeProps {
  @scala.inline
  def apply(
    buttonText: String = null,
    buttonType: primary | ghost = null,
    img: ReactNode = null,
    imgUrl: ImagePropertiesSourceOptions = null,
    message: ReactNode = null,
    onButtonClick: /* e */ js.Any => Unit = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    styles: Partial[ResultStyle] = null,
    title: ReactNode = null
  ): ResultNativeProps = {
    val __obj = js.Dynamic.literal()
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onButtonClick != null) __obj.updateDynamic("onButtonClick")(js.Any.fromFunction1(onButtonClick))
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultNativeProps]
  }
}

