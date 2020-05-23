package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLDialog extends js.Object {
  @JSName("MSHTML.HTMLDialog_typekey")
  var MSHTMLDotHTMLDialog_typekey: HTMLDialog
  val dialogArguments: js.Any
  var dialogHeight: js.Any
  var dialogLeft: js.Any
  var dialogTop: js.Any
  var dialogWidth: js.Any
  val menuArguments: js.Any
  var returnValue: js.Any
  def close(): Unit
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
}

