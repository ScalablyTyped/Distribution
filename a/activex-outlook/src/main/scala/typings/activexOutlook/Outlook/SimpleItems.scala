package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleItems extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  @JSName("Outlook.SimpleItems_typekey")
  var OutlookDotSimpleItems_typekey: SimpleItems
  val Parent: js.Any
  val Session: NameSpace
  def Item(Index: js.Any): js.Any
}

object SimpleItems {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => js.Any,
    OutlookDotSimpleItems_typekey: SimpleItems,
    Parent: js.Any,
    Session: NameSpace
  ): SimpleItems = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.SimpleItems_typekey")(OutlookDotSimpleItems_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleItems]
  }
}

