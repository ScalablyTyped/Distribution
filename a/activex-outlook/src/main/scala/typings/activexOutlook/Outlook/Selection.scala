package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selection extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  val Location: OlSelectionLocation
  @JSName("Outlook.Selection_typekey")
  var OutlookDotSelection_typekey: Selection
  val Parent: js.Any
  val Session: NameSpace
  def GetSelection(SelectionContents: OlSelectionContents): Selection
  def Item(Index: js.Any): js.Any
}

object Selection {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    GetSelection: OlSelectionContents => Selection,
    Item: js.Any => js.Any,
    Location: OlSelectionLocation,
    OutlookDotSelection_typekey: Selection,
    Parent: js.Any,
    Session: NameSpace
  ): Selection = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], GetSelection = js.Any.fromFunction1(GetSelection), Item = js.Any.fromFunction1(Item), Location = Location.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Selection_typekey")(OutlookDotSelection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
}

