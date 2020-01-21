package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Selection")
@js.native
class Selection protected () extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  val Location: OlSelectionLocation = js.native
  @JSName("Outlook.Selection_typekey")
  var OutlookDotSelection_typekey: Selection = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def GetSelection(SelectionContents: OlSelectionContents): Selection = js.native
  def Item(Index: js.Any): js.Any = js.native
}

