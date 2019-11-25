package typings.antdDashMobileDashRn.libResultPropsTypeMod

import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.ghost
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.primary
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultPropsType extends js.Object {
  var buttonText: js.UndefOr[String] = js.undefined
  var buttonType: js.UndefOr[primary | ghost] = js.undefined
  var img: js.UndefOr[ReactNode] = js.undefined
  var imgUrl: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[ReactNode] = js.undefined
  var onButtonClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
}

object ResultPropsType {
  @scala.inline
  def apply(
    buttonText: String = null,
    buttonType: primary | ghost = null,
    img: ReactNode = null,
    imgUrl: String = null,
    message: ReactNode = null,
    onButtonClick: () => Unit = null,
    title: ReactNode = null
  ): ResultPropsType = {
    val __obj = js.Dynamic.literal()
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onButtonClick != null) __obj.updateDynamic("onButtonClick")(js.Any.fromFunction0(onButtonClick))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultPropsType]
  }
}

