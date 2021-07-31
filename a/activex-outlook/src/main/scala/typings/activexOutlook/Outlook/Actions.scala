package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  def Add(): Action
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def Item(Index: js.Any): Action
  
  @JSName("Outlook.Actions_typekey")
  var OutlookDotActions_typekey: Actions
  
  val Parent: js.Any
  
  def Remove(Index: Double): Unit
  
  val Session: NameSpace
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
  implicit class ActionsMutableBuilder[Self <: Actions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: () => Action): Self = StObject.set(x, "Add", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => Action): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutlookDotActions_typekey(value: Actions): Self = StObject.set(x, "Outlook.Actions_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
