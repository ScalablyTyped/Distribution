package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyPages extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  @JSName("Outlook.PropertyPages_typekey")
  var OutlookDotPropertyPages_typekey: PropertyPages
  val Parent: js.Any
  val Session: NameSpace
  def Add(Page: js.Any, Title: String): Unit
  def Item(Index: js.Any): js.Any
  def Remove(Index: js.Any): Unit
}

object PropertyPages {
  @scala.inline
  def apply(
    Add: (js.Any, String) => Unit,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => js.Any,
    OutlookDotPropertyPages_typekey: PropertyPages,
    Parent: js.Any,
    Remove: js.Any => Unit,
    Session: NameSpace
  ): PropertyPages = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.PropertyPages_typekey")(OutlookDotPropertyPages_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyPages]
  }
}

