package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSForms.ListBox")
@js.native
class ListBox protected () extends js.Object {
  var BackColor: scala.Double = js.native
  var BorderColor: scala.Double = js.native
  var BorderStyle: fmBorderStyle = js.native
  var BordersSuppress: scala.Boolean = js.native
  var BoundColumn: js.Any = js.native
  var ColumnCount: scala.Double = js.native
  var ColumnHeads: scala.Boolean = js.native
  var ColumnWidths: java.lang.String = js.native
  val DisplayStyle: fmDisplayStyle = js.native
  var Enabled: scala.Boolean = js.native
  var Font: NewFont = js.native
  var FontBold: scala.Boolean = js.native
  var FontItalic: scala.Boolean = js.native
  var FontName: java.lang.String = js.native
  var FontSize: scala.Double = js.native
  var FontStrikethru: scala.Boolean = js.native
  var FontUnderline: scala.Boolean = js.native
  var FontWeight: scala.Double = js.native
  var ForeColor: scala.Double = js.native
  var IMEMode: fmIMEMode = js.native
  var IntegralHeight: scala.Boolean = js.native
  val ListCount: scala.Double = js.native
  var ListCursor: js.Any = js.native
  var ListIndex: js.Any = js.native
  var ListStyle: fmListStyle = js.native
  var ListWidth: js.Any = js.native
  var Locked: scala.Boolean = js.native
  var `MSForms.ListBox_typekey`: ListBox = js.native
  var MatchEntry: fmMatchEntry = js.native
  var MouseIcon: activexDashStdoleLib.stdoleNs.StdPicture = js.native
  var MousePointer: fmMousePointer = js.native
  var MultiSelect: fmMultiSelect = js.native
  var SpecialEffect: fmSpecialEffect = js.native
  var Text: java.lang.String = js.native
  var TextAlign: fmTextAlign = js.native
  var TextColumn: js.Any = js.native
  var TopIndex: js.Any = js.native
  val Valid: scala.Boolean = js.native
  var Value: js.Any = js.native
  val _Font_Reserved: NewFont = js.native
  def AddItem(): scala.Unit = js.native
  def AddItem(pvargItem: js.Any): scala.Unit = js.native
  def AddItem(pvargItem: js.Any, pvargIndex: js.Any): scala.Unit = js.native
  def Clear(): scala.Unit = js.native
  def Column(): activexDashInteropLib.SafeArray[_] = js.native
  def Column(pvargColumn: scala.Double): js.Any = js.native
  def Column(pvargColumn: scala.Double, pvargIndex: scala.Double): js.Any = js.native
  def List(): activexDashInteropLib.SafeArray[_] = js.native
  def List(pvargIndex: scala.Double): js.Any = js.native
  def List(pvargIndex: scala.Double, pvargColumn: scala.Double): js.Any = js.native
  def RemoveItem(pvargIndex: js.Any): scala.Unit = js.native
  def Selected(pvargIndex: js.Any): scala.Boolean = js.native
}

