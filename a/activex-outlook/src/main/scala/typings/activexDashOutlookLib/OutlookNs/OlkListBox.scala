package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.OlkListBox")
@js.native
class OlkListBox protected () extends js.Object {
  var BackColor: activexDashStdoleLib.stdoleNs.OLE_COLOR = js.native
  var BorderStyle: OlBorderStyle = js.native
  var Enabled: scala.Boolean = js.native
  val Font: activexDashStdoleLib.stdoleNs.StdFont = js.native
  var ForeColor: activexDashStdoleLib.stdoleNs.OLE_COLOR = js.native
  val ListCount: scala.Double = js.native
  var ListIndex: scala.Double = js.native
  var Locked: scala.Boolean = js.native
  var MatchEntry: OlMatchEntry = js.native
  var MouseIcon: activexDashStdoleLib.stdoleNs.StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  var MultiSelect: OlMultiSelect = js.native
  var `Outlook.OlkListBox_typekey`: OlkListBox = js.native
  var Text: java.lang.String = js.native
  var TextAlign: OlTextAlign = js.native
  var TopIndex: scala.Double = js.native
  var Value: js.Any = js.native
  def AddItem(ItemText: java.lang.String): scala.Unit = js.native
  def AddItem(ItemText: java.lang.String, Index: js.Any): scala.Unit = js.native
  def Clear(): scala.Unit = js.native
  def Copy(): scala.Unit = js.native
  def GetItem(Index: scala.Double): java.lang.String = js.native
  def GetSelected(Index: scala.Double): scala.Boolean = js.native
  def RemoveItem(Index: scala.Double): scala.Unit = js.native
  def SetItem(Index: scala.Double, Item: java.lang.String): scala.Unit = js.native
  def SetSelected(Index: scala.Double, Selected: scala.Boolean): scala.Unit = js.native
}

