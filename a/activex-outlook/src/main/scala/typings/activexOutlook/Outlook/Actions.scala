package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Actions extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  @JSName("Outlook.Actions_typekey")
  var OutlookDotActions_typekey: Actions
  val Parent: js.Any
  val Session: NameSpace
  def Add(): Action
  def Item(Index: js.Any): Action
  def Remove(Index: Double): Unit
}

object Actions {
  @scala.inline
  def apply(
    Add: () => Action,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => Action,
    OutlookDotActions_typekey: Actions,
    Parent: js.Any,
    Remove: Double => Unit,
    Session: NameSpace
  ): Actions = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction0(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Actions_typekey")(OutlookDotActions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
}

