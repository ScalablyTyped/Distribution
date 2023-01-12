package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationModules extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def GetNavigationModule(ModuleType: OlNavigationModuleType): NavigationModule
  
  def Item(Index: Any): NavigationModule
  
  /* private */ @JSName("Outlook.NavigationModules_typekey")
  var OutlookDotNavigationModules_typekey: NavigationModules
  
  val Parent: Any
  
  val Session: NameSpace
}
object NavigationModules {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    GetNavigationModule: OlNavigationModuleType => NavigationModule,
    Item: Any => NavigationModule,
    OutlookDotNavigationModules_typekey: NavigationModules,
    Parent: Any,
    Session: NameSpace
  ): NavigationModules = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], GetNavigationModule = js.Any.fromFunction1(GetNavigationModule), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.NavigationModules_typekey")(OutlookDotNavigationModules_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationModules]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationModules] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setGetNavigationModule(value: OlNavigationModuleType => NavigationModule): Self = StObject.set(x, "GetNavigationModule", js.Any.fromFunction1(value))
    
    inline def setItem(value: Any => NavigationModule): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setOutlookDotNavigationModules_typekey(value: NavigationModules): Self = StObject.set(x, "Outlook.NavigationModules_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
