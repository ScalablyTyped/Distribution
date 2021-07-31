package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyPages extends StObject {
  
  def Add(Page: js.Any, Title: String): Unit
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def Item(Index: js.Any): js.Any
  
  @JSName("Outlook.PropertyPages_typekey")
  var OutlookDotPropertyPages_typekey: PropertyPages
  
  val Parent: js.Any
  
  def Remove(Index: js.Any): Unit
  
  val Session: NameSpace
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
  implicit class PropertyPagesMutableBuilder[Self <: PropertyPages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (js.Any, String) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => js.Any): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutlookDotPropertyPages_typekey(value: PropertyPages): Self = StObject.set(x, "Outlook.PropertyPages_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: js.Any => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
