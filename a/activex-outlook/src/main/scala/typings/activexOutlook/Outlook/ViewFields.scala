package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewFields extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.ViewFields_typekey")
  var OutlookDotViewFields_typekey: ViewFields = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(PropertyName: String): ViewField = js.native
  def Insert(PropertyName: String, Index: js.Any): ViewField = js.native
  def Item(Index: js.Any): ViewField = js.native
  def Remove(Index: js.Any): Unit = js.native
}

object ViewFields {
  @scala.inline
  def apply(
    Add: String => ViewField,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Insert: (String, js.Any) => ViewField,
    Item: js.Any => ViewField,
    OutlookDotViewFields_typekey: ViewFields,
    Parent: js.Any,
    Remove: js.Any => Unit,
    Session: NameSpace
  ): ViewFields = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Insert = js.Any.fromFunction2(Insert), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ViewFields_typekey")(OutlookDotViewFields_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewFields]
  }
  @scala.inline
  implicit class ViewFieldsOps[Self <: ViewFields] (val x: Self) extends AnyVal {
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
    def setAdd(value: String => ViewField): Self = this.set("Add", js.Any.fromFunction1(value))
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsert(value: (String, js.Any) => ViewField): Self = this.set("Insert", js.Any.fromFunction2(value))
    @scala.inline
    def setItem(value: js.Any => ViewField): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setOutlookDotViewFields_typekey(value: ViewFields): Self = this.set("Outlook.ViewFields_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: js.Any => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
  
}

