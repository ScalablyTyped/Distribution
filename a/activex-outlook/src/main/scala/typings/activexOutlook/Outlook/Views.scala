package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Views extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  @JSName("Outlook.Views_typekey")
  var OutlookDotViews_typekey: Views
  val Parent: js.Any
  val Session: NameSpace
  def Add(Name: String, ViewType: OlViewType, SaveOption: OlViewSaveOption): View
  def Item(Index: js.Any): View
  def Remove(Index: js.Any): Unit
}

object Views {
  @scala.inline
  def apply(
    Add: (String, OlViewType, OlViewSaveOption) => View,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => View,
    OutlookDotViews_typekey: Views,
    Parent: js.Any,
    Remove: js.Any => Unit,
    Session: NameSpace
  ): Views = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction3(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Views_typekey")(OutlookDotViews_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Views]
  }
}

