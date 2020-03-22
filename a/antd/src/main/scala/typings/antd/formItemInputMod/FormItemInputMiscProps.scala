package typings.antd.formItemInputMod

import typings.antd.formItemMod.ValidateStatus
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormItemInputMiscProps extends js.Object {
  var children: ReactNode
  var errors: js.Array[ReactNode]
  var hasFeedback: js.UndefOr[Boolean] = js.undefined
  var prefixCls: String
  var validateStatus: js.UndefOr[ValidateStatus] = js.undefined
  def onDomErrorVisibleChange(visible: Boolean): Unit
}

object FormItemInputMiscProps {
  @scala.inline
  def apply(
    errors: js.Array[ReactNode],
    onDomErrorVisibleChange: Boolean => Unit,
    prefixCls: String,
    children: ReactNode = null,
    hasFeedback: js.UndefOr[Boolean] = js.undefined,
    validateStatus: ValidateStatus = null
  ): FormItemInputMiscProps = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], onDomErrorVisibleChange = js.Any.fromFunction1(onDomErrorVisibleChange), prefixCls = prefixCls.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(hasFeedback)) __obj.updateDynamic("hasFeedback")(hasFeedback.asInstanceOf[js.Any])
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(validateStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormItemInputMiscProps]
  }
}

