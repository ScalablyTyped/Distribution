package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Selection")
@js.native
class Selection protected () extends js.Object {
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  val Count: scala.Double = js.native
  val Location: OlSelectionLocation = js.native
  var `Outlook.Selection_typekey`: Selection = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def GetSelection(SelectionContents: OlSelectionContents): Selection = js.native
  def Item(Index: js.Any): js.Any = js.native
}

