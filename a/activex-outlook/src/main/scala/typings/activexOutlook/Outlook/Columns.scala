package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Columns extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.Columns_typekey")
  var OutlookDotColumns_typekey: Columns = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Name: String): Column = js.native
  def Item(Index: js.Any): Column = js.native
  def Remove(Index: js.Any): Unit = js.native
  def RemoveAll(): Unit = js.native
}

object Columns {
  @scala.inline
  def apply(
    Add: String => Column,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => Column,
    OutlookDotColumns_typekey: Columns,
    Parent: js.Any,
    Remove: js.Any => Unit,
    RemoveAll: () => Unit,
    Session: NameSpace
  ): Columns = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove), RemoveAll = js.Any.fromFunction0(RemoveAll), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Columns_typekey")(OutlookDotColumns_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
  @scala.inline
  implicit class ColumnsOps[Self <: Columns] (val x: Self) extends AnyVal {
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
    def setAdd(value: String => Column): Self = this.set("Add", js.Any.fromFunction1(value))
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any => Column): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setOutlookDotColumns_typekey(value: Columns): Self = this.set("Outlook.Columns_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: js.Any => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveAll(value: () => Unit): Self = this.set("RemoveAll", js.Any.fromFunction0(value))
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
  
}

