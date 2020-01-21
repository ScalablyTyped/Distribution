package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.UI")
@js.native
class UI protected () extends js.Object {
  @JSName("InfoPath.UI_typekey")
  var InfoPathDotUI_typekey: UI = js.native
  def Alert(bstrAlertString: String): Unit = js.native
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

