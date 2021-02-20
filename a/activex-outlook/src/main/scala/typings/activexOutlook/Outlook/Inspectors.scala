package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inspectors extends StObject {
  
  def Add(Item: js.Any): Inspector = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Item(Index: js.Any): Inspector = js.native
  
  @JSName("Outlook.Inspectors_typekey")
  var OutlookDotInspectors_typekey: Inspectors = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
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
