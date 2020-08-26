package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBox extends js.Object {
  var BackColor: Double = js.native
  var BorderColor: Double = js.native
  var BorderStyle: fmBorderStyle = js.native
  var BordersSuppress: Boolean = js.native
  var BoundColumn: js.Any = js.native
  var ColumnCount: Double = js.native
  var ColumnHeads: Boolean = js.native
  var ColumnWidths: String = js.native
  val DisplayStyle: fmDisplayStyle = js.native
  var Enabled: Boolean = js.native
  var Font: NewFont = js.native
  var FontBold: Boolean = js.native
  var FontItalic: Boolean = js.native
  var FontName: String = js.native
  var FontSize: Double = js.native
  var FontStrikethru: Boolean = js.native
  var FontUnderline: Boolean = js.native
  var FontWeight: Double = js.native
  var ForeColor: Double = js.native
  var IMEMode: fmIMEMode = js.native
  var IntegralHeight: Boolean = js.native
  val ListCount: Double = js.native
  var ListCursor: js.Any = js.native
  var ListIndex: js.Any = js.native
  var ListStyle: fmListStyle = js.native
  var ListWidth: js.Any = js.native
  var Locked: Boolean = js.native
  @JSName("MSForms.ListBox_typekey")
  var MSFormsDotListBox_typekey: ListBox = js.native
  var MatchEntry: fmMatchEntry = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: fmMousePointer = js.native
  var MultiSelect: fmMultiSelect = js.native
  var SpecialEffect: fmSpecialEffect = js.native
  var Text: String = js.native
  var TextAlign: fmTextAlign = js.native
  var TextColumn: js.Any = js.native
  var TopIndex: js.Any = js.native
  val Valid: Boolean = js.native
  var Value: js.Any = js.native
  val _Font_Reserved: NewFont = js.native
  def AddItem(): Unit = js.native
  def AddItem(pvargItem: js.UndefOr[scala.Nothing], pvargIndex: js.Any): Unit = js.native
  def AddItem(pvargItem: js.Any): Unit = js.native
  def AddItem(pvargItem: js.Any, pvargIndex: js.Any): Unit = js.native
  def Clear(): Unit = js.native
  def Column(): SafeArray[_] = js.native
  def Column(pvargColumn: Double): js.Any = js.native
  def Column(pvargColumn: Double, pvargIndex: Double): js.Any = js.native
  def List(): SafeArray[_] = js.native
  def List(pvargIndex: Double): js.Any = js.native
  def List(pvargIndex: Double, pvargColumn: Double): js.Any = js.native
  def RemoveItem(pvargIndex: js.Any): Unit = js.native
  def Selected(pvargIndex: js.Any): Boolean = js.native
}

