package typings.antd.actionButtonMod

import typings.antd.buttonButtonMod.ButtonProps
import typings.antd.buttonButtonMod.LegacyButtonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionButtonProps extends js.Object {
  var actionFn: js.UndefOr[js.Function1[/* repeated */ js.Any, _ | js.Thenable[_]]] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var buttonProps: js.UndefOr[ButtonProps] = js.native
  var closeModal: js.Function = js.native
  var prefixCls: String = js.native
  var `type`: js.UndefOr[LegacyButtonType] = js.native
}

object ActionButtonProps {
  @scala.inline
  def apply(closeModal: js.Function, prefixCls: String): ActionButtonProps = {
    val __obj = js.Dynamic.literal(closeModal = closeModal.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionButtonProps]
  }
  @scala.inline
  implicit class ActionButtonPropsOps[Self <: ActionButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCloseModal(value: js.Function): Self = this.set("closeModal", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionFn(value: /* repeated */ js.Any => _ | js.Thenable[_]): Self = this.set("actionFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteActionFn: Self = this.set("actionFn", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setButtonProps(value: ButtonProps): Self = this.set("buttonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonProps: Self = this.set("buttonProps", js.undefined)
    @scala.inline
    def setType(value: LegacyButtonType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

