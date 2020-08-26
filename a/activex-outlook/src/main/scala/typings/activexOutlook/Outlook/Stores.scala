package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stores extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.Stores_typekey")
  var OutlookDotStores_typekey: Stores = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Item(Index: js.Any): Store = js.native
}

object Stores {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => Store,
    OutlookDotStores_typekey: Stores,
    Parent: js.Any,
    Session: NameSpace
  ): Stores = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Stores_typekey")(OutlookDotStores_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stores]
  }
  @scala.inline
  implicit class StoresOps[Self <: Stores] (val x: Self) extends AnyVal {
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any => Store): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setOutlookDotStores_typekey(value: Stores): Self = this.set("Outlook.Stores_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
  
}

