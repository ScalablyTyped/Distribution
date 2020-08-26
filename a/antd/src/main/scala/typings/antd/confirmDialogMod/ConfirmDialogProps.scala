package typings.antd.confirmDialogMod

import typings.antd.modalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmDialogProps extends ModalFuncProps {
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.native
  var rootPrefixCls: js.UndefOr[String] = js.native
  def close(args: js.Any*): Unit = js.native
}

object ConfirmDialogProps {
  @scala.inline
  def apply(close: /* repeated */ js.Any => Unit): ConfirmDialogProps = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close))
    __obj.asInstanceOf[ConfirmDialogProps]
  }
  @scala.inline
  implicit class ConfirmDialogPropsOps[Self <: ConfirmDialogProps] (val x: Self) extends AnyVal {
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
    def setClose(value: /* repeated */ js.Any => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    @scala.inline
    def setAfterClose(value: () => Unit): Self = this.set("afterClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterClose: Self = this.set("afterClose", js.undefined)
    @scala.inline
    def setRootPrefixCls(value: String): Self = this.set("rootPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootPrefixCls: Self = this.set("rootPrefixCls", js.undefined)
  }
  
}

