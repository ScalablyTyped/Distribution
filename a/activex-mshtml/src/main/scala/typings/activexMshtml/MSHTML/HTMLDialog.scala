package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLDialog extends js.Object {
  @JSName("MSHTML.HTMLDialog_typekey")
  var MSHTMLDotHTMLDialog_typekey: HTMLDialog = js.native
  val dialogArguments: js.Any = js.native
  var dialogHeight: js.Any = js.native
  var dialogLeft: js.Any = js.native
  var dialogTop: js.Any = js.native
  var dialogWidth: js.Any = js.native
  val menuArguments: js.Any = js.native
  var returnValue: js.Any = js.native
  def close(): Unit = js.native
}

object HTMLDialog {
  @scala.inline
  def apply(
    MSHTMLDotHTMLDialog_typekey: HTMLDialog,
    close: () => Unit,
    dialogArguments: js.Any,
    dialogHeight: js.Any,
    dialogLeft: js.Any,
    dialogTop: js.Any,
    dialogWidth: js.Any,
    menuArguments: js.Any,
    returnValue: js.Any
  ): HTMLDialog = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), dialogArguments = dialogArguments.asInstanceOf[js.Any], dialogHeight = dialogHeight.asInstanceOf[js.Any], dialogLeft = dialogLeft.asInstanceOf[js.Any], dialogTop = dialogTop.asInstanceOf[js.Any], dialogWidth = dialogWidth.asInstanceOf[js.Any], menuArguments = menuArguments.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLDialog_typekey")(MSHTMLDotHTMLDialog_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLDialog]
  }
  @scala.inline
  implicit class HTMLDialogOps[Self <: HTMLDialog] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotHTMLDialog_typekey(value: HTMLDialog): Self = this.set("MSHTML.HTMLDialog_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setDialogArguments(value: js.Any): Self = this.set("dialogArguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setDialogHeight(value: js.Any): Self = this.set("dialogHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setDialogLeft(value: js.Any): Self = this.set("dialogLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setDialogTop(value: js.Any): Self = this.set("dialogTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setDialogWidth(value: js.Any): Self = this.set("dialogWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuArguments(value: js.Any): Self = this.set("menuArguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnValue(value: js.Any): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
  
}

