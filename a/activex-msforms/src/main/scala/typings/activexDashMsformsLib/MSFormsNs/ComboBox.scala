package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSForms.ComboBox")
@js.native
class ComboBox protected () extends js.Object {
  var AutoSize: scala.Boolean = js.native
  var AutoTab: scala.Boolean = js.native
  var AutoWordSelect: scala.Boolean = js.native
  var BackColor: scala.Double = js.native
  var BackStyle: fmBackStyle = js.native
  var BorderColor: scala.Double = js.native
  var BorderStyle: fmBorderStyle = js.native
  var BordersSuppress: scala.Boolean = js.native
  var BoundColumn: scala.Double = js.native
  val CanPaste: scala.Boolean = js.native
  var ColumnCount: scala.Double = js.native
  var ColumnHeads: scala.Boolean = js.native
  var ColumnWidths: java.lang.String = js.native
  val CurTargetX: scala.Double = js.native
  val CurTargetY: scala.Double = js.native
  var CurX: scala.Double = js.native
  val DisplayStyle: fmDisplayStyle = js.native
  var DragBehavior: fmDragBehavior = js.native
  var DropButtonStyle: fmDropButtonStyle = js.native
  var Enabled: scala.Boolean = js.native
  var EnterFieldBehavior: fmEnterFieldBehavior = js.native
  var Font: NewFont = js.native
  var FontBold: scala.Boolean = js.native
  var FontItalic: scala.Boolean = js.native
  var FontName: java.lang.String = js.native
  var FontSize: scala.Double = js.native
  var FontStrikethru: scala.Boolean = js.native
  var FontUnderline: scala.Boolean = js.native
  var FontWeight: scala.Double = js.native
  var ForeColor: scala.Double = js.native
  var HideSelection: scala.Boolean = js.native
  var IMEMode: fmIMEMode = js.native
  val LineCount: scala.Double = js.native
  val ListCount: scala.Double = js.native
  var ListCursor: js.Any = js.native
  var ListIndex: scala.Double = js.native
  var ListRows: scala.Double = js.native
  var ListStyle: fmListStyle = js.native
  var ListWidth: scala.Double = js.native
  var Locked: scala.Boolean = js.native
  var `MSForms.ComboBox_typekey`: ComboBox = js.native
  var MatchEntry: fmMatchEntry = js.native
  val MatchFound: scala.Boolean = js.native
  var MatchRequired: scala.Boolean = js.native
  var MaxLength: scala.Double = js.native
  var MouseIcon: activexDashStdoleLib.stdoleNs.StdPicture = js.native
  var MousePointer: fmMousePointer = js.native
  var SelLength: scala.Double = js.native
  var SelStart: scala.Double = js.native
  var SelText: java.lang.String = js.native
  var SelectionMargin: scala.Boolean = js.native
  var ShowDropButtonWhen: fmShowDropButtonWhen = js.native
  var SpecialEffect: fmSpecialEffect = js.native
  var Style: fmStyle = js.native
  var Text: java.lang.String = js.native
  var TextAlign: fmTextAlign = js.native
  var TextColumn: scala.Double = js.native
  val TextLength: scala.Double = js.native
  var TopIndex: scala.Double = js.native
  val Valid: scala.Boolean = js.native
  var Value: js.Any = js.native
  val _Font_Reserved: NewFont = js.native
  def AddItem(): scala.Unit = js.native
  def AddItem(pvargItem: scala.Double): scala.Unit = js.native
  def AddItem(pvargItem: scala.Double, pvargIndex: scala.Double): scala.Unit = js.native
  def Clear(): scala.Unit = js.native
  def Column(): stdLib.SafeArray[_] = js.native
  def Column(pvargColumn: scala.Double): js.Any = js.native
  def Column(pvargColumn: scala.Double, pvargIndex: scala.Double): js.Any = js.native
  def Copy(): scala.Unit = js.native
  def Cut(): scala.Unit = js.native
  def DropDown(): scala.Unit = js.native
  def List(): stdLib.SafeArray[_] = js.native
  def List(pvargIndex: scala.Double): js.Any = js.native
  def List(pvargIndex: scala.Double, pvargColumn: scala.Double): js.Any = js.native
  def Paste(): scala.Unit = js.native
  def RemoveItem(pvargIndex: scala.Double): scala.Boolean = js.native
}

