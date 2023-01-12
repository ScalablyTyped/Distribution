package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Explorers extends StObject {
  
  def Add(Folder: Any, DisplayMode: OlFolderDisplayMode): Explorer
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def Item(Index: Any): Explorer
  
  /* private */ @JSName("Outlook.Explorers_typekey")
  var OutlookDotExplorers_typekey: Explorers
  
  val Parent: Any
  
  val Session: NameSpace
}
object Explorers {
  
  inline def apply(
    Add: (Any, OlFolderDisplayMode) => Explorer,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: Any => Explorer,
    OutlookDotExplorers_typekey: Explorers,
    Parent: Any,
    Session: NameSpace
  ): Explorers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Explorers_typekey")(OutlookDotExplorers_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explorers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Explorers] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (Any, OlFolderDisplayMode) => Explorer): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => Explorer): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setOutlookDotExplorers_typekey(value: Explorers): Self = StObject.set(x, "Outlook.Explorers_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
