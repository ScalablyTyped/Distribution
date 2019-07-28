package typings.antd.esModalActionButtonMod

import typings.antd.esButtonButtonMod.ButtonType
import typings.antd.esButtonButtonMod.NativeButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionButtonProps extends js.Object {
  var actionFn: js.UndefOr[js.Function1[/* repeated */ js.Any, _ | js.Thenable[_]]] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var buttonProps: js.UndefOr[NativeButtonProps] = js.undefined
  var closeModal: js.Function
  var `type`: js.UndefOr[ButtonType] = js.undefined
}

object ActionButtonProps {
  @scala.inline
  def apply(
    closeModal: js.Function,
    actionFn: /* repeated */ js.Any => _ | js.Thenable[_] = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    buttonProps: NativeButtonProps = null,
    `type`: ButtonType = null
  ): ActionButtonProps = {
    val __obj = js.Dynamic.literal(closeModal = closeModal)
    if (actionFn != null) __obj.updateDynamic("actionFn")(js.Any.fromFunction1(actionFn))
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActionButtonProps]
  }
}

