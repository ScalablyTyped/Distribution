package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoFormatRules extends js.Object {
  
  def Add(Name: String): AutoFormatRule = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Insert(Name: String, Index: js.Any): AutoFormatRule = js.native
  
  def Item(Index: js.Any): AutoFormatRule = js.native
  
  @JSName("Outlook.AutoFormatRules_typekey")
  var OutlookDotAutoFormatRules_typekey: AutoFormatRules = js.native
  
  val Parent: js.Any = js.native
  
  def Remove(Index: js.Any): Unit = js.native
  
  def RemoveAll(): Unit = js.native
  
  def Save(): Unit = js.native
  
  val Session: NameSpace = js.native
}
object AutoFormatRules {
  
  @scala.inline
  def apply(
    Add: String => AutoFormatRule,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Insert: (String, js.Any) => AutoFormatRule,
    Item: js.Any => AutoFormatRule,
    OutlookDotAutoFormatRules_typekey: AutoFormatRules,
    Parent: js.Any,
    Remove: js.Any => Unit,
    RemoveAll: () => Unit,
    Save: () => Unit,
    Session: NameSpace
  ): AutoFormatRules = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Insert = js.Any.fromFunction2(Insert), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove), RemoveAll = js.Any.fromFunction0(RemoveAll), Save = js.Any.fromFunction0(Save), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AutoFormatRules_typekey")(OutlookDotAutoFormatRules_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFormatRules]
  }
  
  @scala.inline
  implicit class AutoFormatRulesOps[Self <: AutoFormatRules] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: String => AutoFormatRule): Self = this.set("Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsert(value: (String, js.Any) => AutoFormatRule): Self = this.set("Insert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItem(value: js.Any => AutoFormatRule): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutlookDotAutoFormatRules_typekey(value: AutoFormatRules): Self = this.set("Outlook.AutoFormatRules_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: js.Any => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAll(value: () => Unit): Self = this.set("RemoveAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSave(value: () => Unit): Self = this.set("Save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
}
