package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoFormatRules extends StObject {
  
  def Add(Name: String): AutoFormatRule
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def Insert(Name: String, Index: js.Any): AutoFormatRule
  
  def Item(Index: js.Any): AutoFormatRule
  
  @JSName("Outlook.AutoFormatRules_typekey")
  var OutlookDotAutoFormatRules_typekey: AutoFormatRules
  
  val Parent: js.Any
  
  def Remove(Index: js.Any): Unit
  
  def RemoveAll(): Unit
  
  def Save(): Unit
  
  val Session: NameSpace
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
  implicit class AutoFormatRulesMutableBuilder[Self <: AutoFormatRules] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: String => AutoFormatRule): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsert(value: (String, js.Any) => AutoFormatRule): Self = StObject.set(x, "Insert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItem(value: js.Any => AutoFormatRule): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutlookDotAutoFormatRules_typekey(value: AutoFormatRules): Self = StObject.set(x, "Outlook.AutoFormatRules_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: js.Any => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAll(value: () => Unit): Self = StObject.set(x, "RemoveAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
