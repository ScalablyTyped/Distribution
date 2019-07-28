package typings.activexDashOutlook.OutlookNs

import typings.activexDashStdole.stdoleNs.OLE_COLOR
import typings.activexDashStdole.stdoleNs.StdFont
import typings.activexDashStdole.stdoleNs.StdPicture
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.OlkDateControl")
@js.native
class OlkDateControl protected () extends js.Object {
  var AutoSize: Boolean = js.native
  var AutoWordSelect: Boolean = js.native
  var BackColor: OLE_COLOR = js.native
  var BackStyle: OlBackStyle = js.native
  var Date: VarDate = js.native
  var Enabled: Boolean = js.native
  var EnterFieldBehavior: OlEnterFieldBehavior = js.native
  val Font: StdFont = js.native
  var ForeColor: OLE_COLOR = js.native
  var HideSelection: Boolean = js.native
  var Locked: Boolean = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  var `Outlook.OlkDateControl_typekey`: OlkDateControl = js.native
  var ShowNoneButton: Boolean = js.native
  var Text: String = js.native
  var TextAlign: OlTextAlign = js.native
  var Value: js.Any = js.native
  def DropDown(): Unit = js.native
}

