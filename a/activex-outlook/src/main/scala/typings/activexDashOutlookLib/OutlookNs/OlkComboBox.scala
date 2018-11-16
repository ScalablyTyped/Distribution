package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.OlkComboBox")
@js.native
class OlkComboBox protected () extends js.Object {
  var AutoSize: scala.Boolean = js.native
  var AutoTab: scala.Boolean = js.native
  var AutoWordSelect: scala.Boolean = js.native
  var BackColor: activexDashStdoleLib.stdoleNs.OLE_COLOR = js.native
  var BorderStyle: OlBorderStyle = js.native
  var DragBehavior: OlDragBehavior = js.native
  var Enabled: scala.Boolean = js.native
  var EnterFieldBehavior: OlEnterFieldBehavior = js.native
  val Font: activexDashStdoleLib.stdoleNs.StdFont = js.native
  var ForeColor: activexDashStdoleLib.stdoleNs.OLE_COLOR = js.native
  var HideSelection: scala.Boolean = js.native
  val ListCount: scala.Double = js.native
  var ListIndex: scala.Double = js.native
  var Locked: scala.Boolean = js.native
  var MaxLength: scala.Double = js.native
  var MouseIcon: activexDashStdoleLib.stdoleNs.StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  var `Outlook.OlkComboBox_typekey`: OlkComboBox = js.native
  var SelLength: scala.Double = js.native
  var SelStart: scala.Double = js.native
  val SelText: java.lang.String = js.native
  var SelectionMargin: scala.Boolean = js.native
  var Style: OlComboBoxStyle = js.native
  var Text: java.lang.String = js.native
  var TextAlign: OlTextAlign = js.native
  var TopIndex: scala.Double = js.native
  var Value: js.Any = js.native
  def AddItem(ItemText: java.lang.String): scala.Unit = js.native
  def AddItem(ItemText: java.lang.String, Index: js.Any): scala.Unit = js.native
  def Clear(): scala.Unit = js.native
  def Copy(): scala.Unit = js.native
  def Cut(): scala.Unit = js.native
  def DropDown(): scala.Unit = js.native
  def GetItem(Index: scala.Double): java.lang.String = js.native
  def Paste(): scala.Unit = js.native
  def RemoveItem(Index: scala.Double): scala.Unit = js.native
  def SetItem(Index: scala.Double, Item: java.lang.String): scala.Unit = js.native
}

