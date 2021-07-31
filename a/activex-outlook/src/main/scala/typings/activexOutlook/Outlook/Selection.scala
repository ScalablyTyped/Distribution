package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selection extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def GetSelection(SelectionContents: OlSelectionContents): Selection
  
  def Item(Index: js.Any): js.Any
  
  val Location: OlSelectionLocation
  
  @JSName("Outlook.Selection_typekey")
  var OutlookDotSelection_typekey: Selection
  
  val Parent: js.Any
  
  val Session: NameSpace
}
object Selection {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    GetSelection: OlSelectionContents => Selection,
    Item: js.Any => js.Any,
    Location: OlSelectionLocation,
    OutlookDotSelection_typekey: Selection,
    Parent: js.Any,
    Session: NameSpace
  ): Selection = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], GetSelection = js.Any.fromFunction1(GetSelection), Item = js.Any.fromFunction1(Item), Location = Location.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Selection_typekey")(OutlookDotSelection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  
  @scala.inline
  implicit class SelectionMutableBuilder[Self <: Selection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSelection(value: OlSelectionContents => Selection): Self = StObject.set(x, "GetSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: js.Any => js.Any): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocation(value: OlSelectionLocation): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotSelection_typekey(value: Selection): Self = StObject.set(x, "Outlook.Selection_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
