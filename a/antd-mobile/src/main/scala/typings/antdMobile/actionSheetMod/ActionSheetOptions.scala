package typings.antdMobile.actionSheetMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionSheetOptions extends js.Object {
  var cancelButtonIndex: js.UndefOr[Double] = js.native
  var className: js.UndefOr[String] = js.native
  var destructiveButtonIndex: js.UndefOr[Double] = js.native
  var maskClosable: js.UndefOr[Boolean] = js.native
  var maskTransitionName: js.UndefOr[String] = js.native
  var message: js.UndefOr[ReactNode] = js.native
  var title: js.UndefOr[ReactNode] = js.native
  var transitionName: js.UndefOr[String] = js.native
}

object ActionSheetOptions {
  @scala.inline
  def apply(): ActionSheetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionSheetOptions]
  }
  @scala.inline
  implicit class ActionSheetOptionsOps[Self <: ActionSheetOptions] (val x: Self) extends AnyVal {
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
    def setCancelButtonIndex(value: Double): Self = this.set("cancelButtonIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelButtonIndex: Self = this.set("cancelButtonIndex", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDestructiveButtonIndex(value: Double): Self = this.set("destructiveButtonIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestructiveButtonIndex: Self = this.set("destructiveButtonIndex", js.undefined)
    @scala.inline
    def setMaskClosable(value: Boolean): Self = this.set("maskClosable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskClosable: Self = this.set("maskClosable", js.undefined)
    @scala.inline
    def setMaskTransitionName(value: String): Self = this.set("maskTransitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskTransitionName: Self = this.set("maskTransitionName", js.undefined)
    @scala.inline
    def setMessage(value: ReactNode): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
  }
  
}

