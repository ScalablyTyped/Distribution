package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlkListBox extends StObject {
  
  def AddItem(ItemText: String): Unit = js.native
  def AddItem(ItemText: String, Index: js.Any): Unit = js.native
  
  var BackColor: OLE_COLOR = js.native
  
  var BorderStyle: OlBorderStyle = js.native
  
  def Clear(): Unit = js.native
  
  def Copy(): Unit = js.native
  
  var Enabled: Boolean = js.native
  
  val Font: StdFont = js.native
  
  var ForeColor: OLE_COLOR = js.native
  
  def GetItem(Index: Double): String = js.native
  
  def GetSelected(Index: Double): Boolean = js.native
  
  val ListCount: Double = js.native
  
  var ListIndex: Double = js.native
  
  var Locked: Boolean = js.native
  
  var MatchEntry: OlMatchEntry = js.native
  
  var MouseIcon: StdPicture = js.native
  
  var MousePointer: OlMousePointer = js.native
  
  var MultiSelect: OlMultiSelect = js.native
  
  /* private */ @JSName("Outlook.OlkListBox_typekey")
  var OutlookDotOlkListBox_typekey: OlkListBox = js.native
  
  def RemoveItem(Index: Double): Unit = js.native
  
  def SetItem(Index: Double, Item: String): Unit = js.native
  
  def SetSelected(Index: Double, Selected: Boolean): Unit = js.native
  
  var Text: String = js.native
  
  var TextAlign: OlTextAlign = js.native
  
  var TopIndex: Double = js.native
  
  var Value: js.Any = js.native
}
