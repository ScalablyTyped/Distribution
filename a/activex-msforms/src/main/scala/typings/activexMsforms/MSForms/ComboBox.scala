package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComboBox extends js.Object {
  var AutoSize: Boolean = js.native
  var AutoTab: Boolean = js.native
  var AutoWordSelect: Boolean = js.native
  var BackColor: Double = js.native
  var BackStyle: fmBackStyle = js.native
  var BorderColor: Double = js.native
  var BorderStyle: fmBorderStyle = js.native
  var BordersSuppress: Boolean = js.native
  var BoundColumn: Double = js.native
  val CanPaste: Boolean = js.native
  var ColumnCount: Double = js.native
  var ColumnHeads: Boolean = js.native
  var ColumnWidths: String = js.native
  val CurTargetX: Double = js.native
  val CurTargetY: Double = js.native
  var CurX: Double = js.native
  val DisplayStyle: fmDisplayStyle = js.native
  var DragBehavior: fmDragBehavior = js.native
  var DropButtonStyle: fmDropButtonStyle = js.native
  var Enabled: Boolean = js.native
  var EnterFieldBehavior: fmEnterFieldBehavior = js.native
  var Font: NewFont = js.native
  var FontBold: Boolean = js.native
  var FontItalic: Boolean = js.native
  var FontName: String = js.native
  var FontSize: Double = js.native
  var FontStrikethru: Boolean = js.native
  var FontUnderline: Boolean = js.native
  var FontWeight: Double = js.native
  var ForeColor: Double = js.native
  var HideSelection: Boolean = js.native
  var IMEMode: fmIMEMode = js.native
  val LineCount: Double = js.native
  val ListCount: Double = js.native
  var ListCursor: js.Any = js.native
  var ListIndex: Double = js.native
  var ListRows: Double = js.native
  var ListStyle: fmListStyle = js.native
  var ListWidth: Double = js.native
  var Locked: Boolean = js.native
  @JSName("MSForms.ComboBox_typekey")
  var MSFormsDotComboBox_typekey: ComboBox = js.native
  var MatchEntry: fmMatchEntry = js.native
  val MatchFound: Boolean = js.native
  var MatchRequired: Boolean = js.native
  var MaxLength: Double = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: fmMousePointer = js.native
  var SelLength: Double = js.native
  var SelStart: Double = js.native
  var SelText: String = js.native
  var SelectionMargin: Boolean = js.native
  var ShowDropButtonWhen: fmShowDropButtonWhen = js.native
  var SpecialEffect: fmSpecialEffect = js.native
  var Style: fmStyle = js.native
  var Text: String = js.native
  var TextAlign: fmTextAlign = js.native
  var TextColumn: Double = js.native
  val TextLength: Double = js.native
  var TopIndex: Double = js.native
  val Valid: Boolean = js.native
  var Value: js.Any = js.native
  val _Font_Reserved: NewFont = js.native
  def AddItem(): Unit = js.native
  def AddItem(pvargItem: js.UndefOr[scala.Nothing], pvargIndex: Double): Unit = js.native
  def AddItem(pvargItem: Double): Unit = js.native
  def AddItem(pvargItem: Double, pvargIndex: Double): Unit = js.native
  def Clear(): Unit = js.native
  def Column(): SafeArray[_] = js.native
  def Column(pvargColumn: Double): js.Any = js.native
  def Column(pvargColumn: Double, pvargIndex: Double): js.Any = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def DropDown(): Unit = js.native
  def List(): SafeArray[_] = js.native
  def List(pvargIndex: Double): js.Any = js.native
  def List(pvargIndex: Double, pvargColumn: Double): js.Any = js.native
  def Paste(): Unit = js.native
  def RemoveItem(pvargIndex: Double): Boolean = js.native
}

