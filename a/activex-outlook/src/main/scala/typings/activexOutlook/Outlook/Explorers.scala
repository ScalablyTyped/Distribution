package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Explorers extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  @JSName("Outlook.Explorers_typekey")
  var OutlookDotExplorers_typekey: Explorers
  val Parent: js.Any
  val Session: NameSpace
  def Add(Folder: js.Any, DisplayMode: OlFolderDisplayMode): Explorer
  def Item(Index: js.Any): Explorer
}

object Explorers {
  @scala.inline
  def apply(
    Add: (js.Any, OlFolderDisplayMode) => Explorer,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => Explorer,
    OutlookDotExplorers_typekey: Explorers,
    Parent: js.Any,
    Session: NameSpace
  ): Explorers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Explorers_typekey")(OutlookDotExplorers_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explorers]
  }
}

