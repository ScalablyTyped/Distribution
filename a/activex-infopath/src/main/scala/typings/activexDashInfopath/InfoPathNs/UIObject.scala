package typings.activexDashInfopath.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.UIObject")
@js.native
class UIObject protected () extends js.Object {
  var `InfoPath.UIObject_typekey`: UIObject = js.native
  def Alert(bstrAlertString: String): Unit = js.native
  def Confirm(bstrPrompt: String, lButtons: XdConfirmButtons): XdConfirmChoice = js.native
  def SetSaveAsDialogFileName(bstrFileName: String): Unit = js.native
  def SetSaveAsDialogLocation(bstrLocation: String): Unit = js.native
  def ShowMailItem(bstrTo: String, bstrCC: String, bstrBCC: String, bstrSubject: String, bstrBody: String): Unit = js.native
  def ShowModalDialog(bstrName: String): js.Any = js.native
  def ShowModalDialog(bstrName: String, varArguments: js.Any): js.Any = js.native
  def ShowModalDialog(bstrName: String, varArguments: js.Any, varHeight: js.Any): js.Any = js.native
  def ShowModalDialog(bstrName: String, varArguments: js.Any, varHeight: js.Any, varWidth: js.Any): js.Any = js.native
  def ShowModalDialog(bstrName: String, varArguments: js.Any, varHeight: js.Any, varWidth: js.Any, varTop: js.Any): js.Any = js.native
  def ShowModalDialog(
    bstrName: String,
    varArguments: js.Any,
    varHeight: js.Any,
    varWidth: js.Any,
    varTop: js.Any,
    varLeft: js.Any
  ): js.Any = js.native
  def ShowSignatureDialog(): Unit = js.native
}

