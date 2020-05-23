package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Panes extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  @JSName("Outlook.Panes_typekey")
  var OutlookDotPanes_typekey: Panes
  val Parent: js.Any
  val Session: NameSpace
  def Item(Index: js.Any): js.Any
}

object Panes {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => js.Any,
    OutlookDotPanes_typekey: Panes,
    Parent: js.Any,
    Session: NameSpace
  ): Panes = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Panes_typekey")(OutlookDotPanes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Panes]
  }
}

