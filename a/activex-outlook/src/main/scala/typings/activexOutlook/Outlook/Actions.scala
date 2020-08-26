package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actions extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.Actions_typekey")
  var OutlookDotActions_typekey: Actions = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(): Action = js.native
  def Item(Index: js.Any): Action = js.native
  def Remove(Index: Double): Unit = js.native
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
  @scala.inline
  implicit class ActionsOps[Self <: Actions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: () => Action): Self = this.set("Add", js.Any.fromFunction0(value))
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any => Action): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setOutlookDotActions_typekey(value: Actions): Self = this.set("Outlook.Actions_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: Double => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
  
}

