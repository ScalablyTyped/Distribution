package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyPages extends js.Object {
  
  def Add(Page: js.Any, Title: String): Unit = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Item(Index: js.Any): js.Any = js.native
  
  @JSName("Outlook.PropertyPages_typekey")
  var OutlookDotPropertyPages_typekey: PropertyPages = js.native
  
  val Parent: js.Any = js.native
  
  def Remove(Index: js.Any): Unit = js.native
  
  val Session: NameSpace = js.native
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
  
  @scala.inline
  implicit class PropertyPagesOps[Self <: PropertyPages] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: (js.Any, String) => Unit): Self = this.set("Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => js.Any): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutlookDotPropertyPages_typekey(value: PropertyPages): Self = this.set("Outlook.PropertyPages_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: js.Any => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
}
