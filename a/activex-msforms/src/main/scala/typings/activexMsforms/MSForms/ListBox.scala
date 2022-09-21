package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBox extends StObject {
  
  def AddItem(): Unit = js.native
  def AddItem(pvargItem: Any): Unit = js.native
  def AddItem(pvargItem: Any, pvargIndex: Any): Unit = js.native
  def AddItem(pvargItem: Unit, pvargIndex: Any): Unit = js.native
  
  var BackColor: Double = js.native
  
  var BorderColor: Double = js.native
  
  var BorderStyle: fmBorderStyle = js.native
  
  var BordersSuppress: Boolean = js.native
  
  var BoundColumn: Any = js.native
  
  def Clear(): Unit = js.native
  
  def Column(): SafeArray[Any] = js.native
  def Column(pvargColumn: Double): Any = js.native
  def Column(pvargColumn: Double, pvargIndex: Double): Any = js.native
  
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
  
  def List(): SafeArray[Any] = js.native
  def List(pvargIndex: Double): Any = js.native
  def List(pvargIndex: Double, pvargColumn: Double): Any = js.native
  
  val ListCount: Double = js.native
  
  var ListCursor: Any = js.native
  
  var ListIndex: Any = js.native
  
  var ListStyle: fmListStyle = js.native
  
  var ListWidth: Any = js.native
  
  var Locked: Boolean = js.native
  
  /* private */ @JSName("MSForms.ListBox_typekey")
  var MSFormsDotListBox_typekey: ListBox = js.native
  
  var MatchEntry: fmMatchEntry = js.native
  
  var MouseIcon: StdPicture = js.native
  
  var MousePointer: fmMousePointer = js.native
  
  var MultiSelect: fmMultiSelect = js.native
  
  def RemoveItem(pvargIndex: Any): Unit = js.native
  
  def Selected(pvargIndex: Any): Boolean = js.native
  
  var SpecialEffect: fmSpecialEffect = js.native
  
  var Text: String = js.native
  
  var TextAlign: fmTextAlign = js.native
  
  var TextColumn: Any = js.native
  
  var TopIndex: Any = js.native
  
  val Valid: Boolean = js.native
  
  var Value: Any = js.native
  
  val _Font_Reserved: NewFont = js.native
}
