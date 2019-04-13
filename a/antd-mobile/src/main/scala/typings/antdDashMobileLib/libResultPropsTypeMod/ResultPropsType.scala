package typings
package antdDashMobileLib.libResultPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultPropsType extends js.Object {
  var buttonText: js.UndefOr[java.lang.String] = js.undefined
  var buttonType: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibStrings.primary | antdDashMobileLib.antdDashMobileLibStrings.ghost
  ] = js.undefined
  var img: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var imgUrl: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var onButtonClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object ResultPropsType {
  @scala.inline
  def apply(
    buttonText: java.lang.String = null,
    buttonType: antdDashMobileLib.antdDashMobileLibStrings.primary | antdDashMobileLib.antdDashMobileLibStrings.ghost = null,
    img: reactLib.reactMod.ReactNode = null,
    imgUrl: java.lang.String = null,
    message: reactLib.reactMod.ReactNode = null,
    onButtonClick: () => scala.Unit = null,
    title: reactLib.reactMod.ReactNode = null
  ): ResultPropsType = {
    val __obj = js.Dynamic.literal()
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText)
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl)
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onButtonClick != null) __obj.updateDynamic("onButtonClick")(js.Any.fromFunction0(onButtonClick))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultPropsType]
  }
}

