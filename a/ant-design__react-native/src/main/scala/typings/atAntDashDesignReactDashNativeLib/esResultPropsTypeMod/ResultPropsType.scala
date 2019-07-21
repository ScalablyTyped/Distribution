package typings
package atAntDashDesignReactDashNativeLib.esResultPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultPropsType extends js.Object {
  var buttonText: js.UndefOr[java.lang.String] = js.undefined
  var buttonType: js.UndefOr[
    atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.primary | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.ghost
  ] = js.undefined
  var img: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var imgUrl: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ImagePropertiesSourceOptions */ js.Any
  ] = js.undefined
  var message: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var onButtonClick: js.UndefOr[js.Function1[/* e */ js.Any, scala.Unit]] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object ResultPropsType {
  @scala.inline
  def apply(
    buttonText: java.lang.String = null,
    buttonType: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.primary | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.ghost = null,
    img: reactLib.reactMod.ReactNode = null,
    imgUrl: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ImagePropertiesSourceOptions */ js.Any = null,
    message: reactLib.reactMod.ReactNode = null,
    onButtonClick: /* e */ js.Any => scala.Unit = null,
    title: reactLib.reactMod.ReactNode = null
  ): ResultPropsType = {
    val __obj = js.Dynamic.literal()
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText)
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl)
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onButtonClick != null) __obj.updateDynamic("onButtonClick")(js.Any.fromFunction1(onButtonClick))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultPropsType]
  }
}

