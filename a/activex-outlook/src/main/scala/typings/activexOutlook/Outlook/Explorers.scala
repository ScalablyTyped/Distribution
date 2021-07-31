package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Explorers extends StObject {
  
  def Add(Folder: js.Any, DisplayMode: OlFolderDisplayMode): Explorer
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def Item(Index: js.Any): Explorer
  
  @JSName("Outlook.Explorers_typekey")
  var OutlookDotExplorers_typekey: Explorers
  
  val Parent: js.Any
  
  val Session: NameSpace
}
object Explorers {
  
  @scala.inline
  def apply(
    Add: (js.Any, OlFolderDisplayMode) => Explorer,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => Explorer,
    OutlookDotExplorers_typekey: Explorers,
    Parent: js.Any,
    Session: NameSpace
  ): Explorers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Explorers_typekey")(OutlookDotExplorers_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explorers]
  }
  
  @scala.inline
  implicit class ExplorersMutableBuilder[Self <: Explorers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (js.Any, OlFolderDisplayMode) => Explorer): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => Explorer): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutlookDotExplorers_typekey(value: Explorers): Self = StObject.set(x, "Outlook.Explorers_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
