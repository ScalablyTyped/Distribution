package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Views extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.Views_typekey")
  var OutlookDotViews_typekey: Views = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Name: String, ViewType: OlViewType, SaveOption: OlViewSaveOption): View = js.native
  def Item(Index: js.Any): View = js.native
  def Remove(Index: js.Any): Unit = js.native
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
  @scala.inline
  implicit class ViewsOps[Self <: Views] (val x: Self) extends AnyVal {
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
    def setAdd(value: (String, OlViewType, OlViewSaveOption) => View): Self = this.set("Add", js.Any.fromFunction3(value))
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any => View): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setOutlookDotViews_typekey(value: Views): Self = this.set("Outlook.Views_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: js.Any => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
  
}

