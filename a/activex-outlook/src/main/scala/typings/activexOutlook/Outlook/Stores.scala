package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stores extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def Item(Index: js.Any): Store
  
  /* private */ @JSName("Outlook.Stores_typekey")
  var OutlookDotStores_typekey: Stores
  
  val Parent: js.Any
  
  val Session: NameSpace
}
object Stores {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => Store,
    OutlookDotStores_typekey: Stores,
    Parent: js.Any,
    Session: NameSpace
  ): Stores = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Stores_typekey")(OutlookDotStores_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stores]
  }
  
  extension [Self <: Stores](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: js.Any => Store): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setOutlookDotStores_typekey(value: Stores): Self = StObject.set(x, "Outlook.Stores_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
