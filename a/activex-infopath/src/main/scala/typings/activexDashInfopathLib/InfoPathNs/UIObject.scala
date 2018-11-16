package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.UIObject")
@js.native
class UIObject protected () extends js.Object {
  var `InfoPath.UIObject_typekey`: UIObject = js.native
  def Alert(bstrAlertString: java.lang.String): scala.Unit = js.native
  def Confirm(bstrPrompt: java.lang.String, lButtons: XdConfirmButtons): XdConfirmChoice = js.native
  def SetSaveAsDialogFileName(bstrFileName: java.lang.String): scala.Unit = js.native
  def SetSaveAsDialogLocation(bstrLocation: java.lang.String): scala.Unit = js.native
  def ShowMailItem(
    bstrTo: java.lang.String,
    bstrCC: java.lang.String,
    bstrBCC: java.lang.String,
    bstrSubject: java.lang.String,
    bstrBody: java.lang.String
  ): scala.Unit = js.native
  def ShowModalDialog(bstrName: java.lang.String): js.Any = js.native
  def ShowModalDialog(bstrName: java.lang.String, varArguments: js.Any): js.Any = js.native
  def ShowModalDialog(bstrName: java.lang.String, varArguments: js.Any, varHeight: js.Any): js.Any = js.native
  def ShowModalDialog(bstrName: java.lang.String, varArguments: js.Any, varHeight: js.Any, varWidth: js.Any): js.Any = js.native
  def ShowModalDialog(
    bstrName: java.lang.String,
    varArguments: js.Any,
    varHeight: js.Any,
    varWidth: js.Any,
    varTop: js.Any
  ): js.Any = js.native
  def ShowModalDialog(
    bstrName: java.lang.String,
    varArguments: js.Any,
    varHeight: js.Any,
    varWidth: js.Any,
    varTop: js.Any,
    varLeft: js.Any
  ): js.Any = js.native
  def ShowSignatureDialog(): scala.Unit = js.native
}

