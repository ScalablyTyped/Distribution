package typings.activexDashOutlook.OutlookNs

import typings.activexDashStdole.stdoleNs.OLE_COLOR
import typings.activexDashStdole.stdoleNs.StdFont
import typings.activexDashStdole.stdoleNs.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Outlook TextBox */
@JSGlobal("Outlook.OlkTextBox")
@js.native
class OlkTextBox protected () extends js.Object {
  var AutoSize: Boolean = js.native
  var AutoTab: Boolean = js.native
  var AutoWordSelect: Boolean = js.native
  var BackColor: OLE_COLOR = js.native
  var BorderStyle: OlBorderStyle = js.native
  var DragBehavior: OlDragBehavior = js.native
  var EnableRichText: Boolean = js.native
  var Enabled: Boolean = js.native
  var EnterFieldBehavior: OlEnterFieldBehavior = js.native
  var EnterKeyBehavior: Boolean = js.native
  val Font: StdFont = js.native
  var ForeColor: OLE_COLOR = js.native
  var HideSelection: Boolean = js.native
  var IntegralHeight: Boolean = js.native
  var Locked: Boolean = js.native
  var MaxLength: Double = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  var MultiLine: Boolean = js.native
  var `Outlook.OlkTextBox_typekey`: OlkTextBox = js.native
  var PasswordChar: String = js.native
  var Scrollbars: OlScrollBars = js.native
  var SelLength: Double = js.native
  var SelStart: Double = js.native
  val SelText: String = js.native
  var SelectionMargin: Boolean = js.native
  var TabKeyBehavior: Boolean = js.native
  var Text: String = js.native
  var TextAlign: OlTextAlign = js.native
  var Value: js.Any = js.native
  var WordWrap: Boolean = js.native
  def Clear(): Unit = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Paste(): Unit = js.native
}

