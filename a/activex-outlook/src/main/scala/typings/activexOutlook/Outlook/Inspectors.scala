package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inspectors extends StObject {
  
  def Add(Item: js.Any): Inspector
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def Item(Index: js.Any): Inspector
  
  @JSName("Outlook.Inspectors_typekey")
  var OutlookDotInspectors_typekey: Inspectors
  
  val Parent: js.Any
  
  val Session: NameSpace
}
object Inspectors {
  
  @scala.inline
  def apply(
    Add: js.Any => Inspector,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => Inspector,
    OutlookDotInspectors_typekey: Inspectors,
    Parent: js.Any,
    Session: NameSpace
  ): Inspectors = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Inspectors_typekey")(OutlookDotInspectors_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inspectors]
  }
  
  @scala.inline
  implicit class InspectorsMutableBuilder[Self <: Inspectors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: js.Any => Inspector): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => Inspector): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutlookDotInspectors_typekey(value: Inspectors): Self = StObject.set(x, "Outlook.Inspectors_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
