package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationModules extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def GetNavigationModule(ModuleType: OlNavigationModuleType): NavigationModule = js.native
  
  def Item(Index: js.Any): NavigationModule = js.native
  
  @JSName("Outlook.NavigationModules_typekey")
  var OutlookDotNavigationModules_typekey: NavigationModules = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
}
object NavigationModules {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    GetNavigationModule: OlNavigationModuleType => NavigationModule,
    Item: js.Any => NavigationModule,
    OutlookDotNavigationModules_typekey: NavigationModules,
    Parent: js.Any,
    Session: NameSpace
  ): NavigationModules = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], GetNavigationModule = js.Any.fromFunction1(GetNavigationModule), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.NavigationModules_typekey")(OutlookDotNavigationModules_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationModules]
  }
  
  @scala.inline
  implicit class NavigationModulesMutableBuilder[Self <: NavigationModules] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetNavigationModule(value: OlNavigationModuleType => NavigationModule): Self = StObject.set(x, "GetNavigationModule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: js.Any => NavigationModule): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutlookDotNavigationModules_typekey(value: NavigationModules): Self = StObject.set(x, "Outlook.NavigationModules_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
