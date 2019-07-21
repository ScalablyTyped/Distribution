package typings
package atAntDashDesignReactDashNativeLib.libResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultNativeProps
  extends atAntDashDesignReactDashNativeLib.libResultPropsTypeMod.ResultPropsType
     with atAntDashDesignReactDashNativeLib.libStyleMod.WithThemeStyles[atAntDashDesignReactDashNativeLib.libResultStyleMod.ResultStyle] {
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object ResultNativeProps {
  @scala.inline
  def apply(
    buttonText: java.lang.String = null,
    buttonType: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.primary | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.ghost = null,
    img: reactLib.reactMod.ReactNode = null,
    imgUrl: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ImagePropertiesSourceOptions */ js.Any = null,
    message: reactLib.reactMod.ReactNode = null,
    onButtonClick: /* e */ js.Any => scala.Unit = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    styles: stdLib.Partial[atAntDashDesignReactDashNativeLib.libResultStyleMod.ResultStyle] = null,
    title: reactLib.reactMod.ReactNode = null
  ): ResultNativeProps = {
    val __obj = js.Dynamic.literal()
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText)
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl)
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onButtonClick != null) __obj.updateDynamic("onButtonClick")(js.Any.fromFunction1(onButtonClick))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultNativeProps]
  }
}

