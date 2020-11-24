package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlkComboBox extends js.Object {
  
  def AddItem(ItemText: String): Unit = js.native
  def AddItem(ItemText: String, Index: js.Any): Unit = js.native
  
  var AutoSize: Boolean = js.native
  
  var AutoTab: Boolean = js.native
  
  var AutoWordSelect: Boolean = js.native
  
  var BackColor: OLE_COLOR = js.native
  
  var BorderStyle: OlBorderStyle = js.native
  
  def Clear(): Unit = js.native
  
  def Copy(): Unit = js.native
  
  def Cut(): Unit = js.native
  
  var DragBehavior: OlDragBehavior = js.native
  
  def DropDown(): Unit = js.native
  
  var Enabled: Boolean = js.native
  
  var EnterFieldBehavior: OlEnterFieldBehavior = js.native
  
  val Font: StdFont = js.native
  
  var ForeColor: OLE_COLOR = js.native
  
  def GetItem(Index: Double): String = js.native
  
  var HideSelection: Boolean = js.native
  
  val ListCount: Double = js.native
  
  var ListIndex: Double = js.native
  
  var Locked: Boolean = js.native
  
  var MaxLength: Double = js.native
  
  var MouseIcon: StdPicture = js.native
  
  var MousePointer: OlMousePointer = js.native
  
  @JSName("Outlook.OlkComboBox_typekey")
  var OutlookDotOlkComboBox_typekey: OlkComboBox = js.native
  
  def Paste(): Unit = js.native
  
  def RemoveItem(Index: Double): Unit = js.native
  
  var SelLength: Double = js.native
  
  var SelStart: Double = js.native
  
  val SelText: String = js.native
  
  var SelectionMargin: Boolean = js.native
  
  def SetItem(Index: Double, Item: String): Unit = js.native
  
  var Style: OlComboBoxStyle = js.native
  
  var Text: String = js.native
  
  var TextAlign: OlTextAlign = js.native
  
  var TopIndex: Double = js.native
  
  var Value: js.Any = js.native
}
