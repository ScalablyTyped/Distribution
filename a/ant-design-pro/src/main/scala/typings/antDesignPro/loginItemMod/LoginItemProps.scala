package typings.antDesignPro.loginItemMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginItemProps extends js.Object {
  var buttonText: js.UndefOr[ReactNode] = js.undefined
  var countDown: js.UndefOr[Double] = js.undefined
  var customprops: js.UndefOr[js.Any] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var form: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ js.Any
  var getCaptchaButtonText: js.UndefOr[String] = js.undefined
  var getCaptchaSecondText: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
  var onGetCaptcha: js.UndefOr[js.Function1[/* event */ js.UndefOr[MouseEvent], Unit]] = js.undefined
  var onPressEnter: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var rules: js.UndefOr[js.Array[_]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var `type`: String
  def updateActive(activeItem: js.Any): Unit
}

object LoginItemProps {
  @scala.inline
  def apply(
    form: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ js.Any,
    `type`: String,
    updateActive: js.Any => Unit,
    buttonText: ReactNode = null,
    countDown: js.UndefOr[Double] = js.undefined,
    customprops: js.Any = null,
    defaultValue: String = null,
    getCaptchaButtonText: String = null,
    getCaptchaSecondText: String = null,
    name: String = null,
    onChange: /* e */ js.Any => Unit = null,
    onGetCaptcha: /* event */ js.UndefOr[MouseEvent] => Unit = null,
    onPressEnter: /* e */ js.Any => Unit = null,
    placeholder: String = null,
    rules: js.Array[_] = null,
    style: CSSProperties = null
  ): LoginItemProps = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], updateActive = js.Any.fromFunction1(updateActive))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (!js.isUndefined(countDown)) __obj.updateDynamic("countDown")(countDown.get.asInstanceOf[js.Any])
    if (customprops != null) __obj.updateDynamic("customprops")(customprops.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (getCaptchaButtonText != null) __obj.updateDynamic("getCaptchaButtonText")(getCaptchaButtonText.asInstanceOf[js.Any])
    if (getCaptchaSecondText != null) __obj.updateDynamic("getCaptchaSecondText")(getCaptchaSecondText.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onGetCaptcha != null) __obj.updateDynamic("onGetCaptcha")(js.Any.fromFunction1(onGetCaptcha))
    if (onPressEnter != null) __obj.updateDynamic("onPressEnter")(js.Any.fromFunction1(onPressEnter))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginItemProps]
  }
}

