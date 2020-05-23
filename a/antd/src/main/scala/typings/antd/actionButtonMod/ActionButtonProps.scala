package typings.antd.actionButtonMod

import typings.antd.buttonButtonMod.ButtonProps
import typings.antd.buttonButtonMod.LegacyButtonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionButtonProps extends js.Object {
  var actionFn: js.UndefOr[js.Function1[/* repeated */ js.Any, _ | js.Thenable[_]]] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var buttonProps: js.UndefOr[ButtonProps] = js.undefined
  var closeModal: js.Function
  var `type`: js.UndefOr[LegacyButtonType] = js.undefined
}

object ActionButtonProps {
  @scala.inline
  def apply(
    closeModal: js.Function,
    actionFn: /* repeated */ js.Any => _ | js.Thenable[_] = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    buttonProps: ButtonProps = null,
    `type`: LegacyButtonType = null
  ): ActionButtonProps = {
    val __obj = js.Dynamic.literal(closeModal = closeModal.asInstanceOf[js.Any])
    if (actionFn != null) __obj.updateDynamic("actionFn")(js.Any.fromFunction1(actionFn))
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionButtonProps]
  }
}

