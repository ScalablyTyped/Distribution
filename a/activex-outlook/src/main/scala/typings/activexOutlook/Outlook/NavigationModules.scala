package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationModules extends js.Object {
  
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
  implicit class NavigationModulesOps[Self <: NavigationModules] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetNavigationModule(value: OlNavigationModuleType => NavigationModule): Self = this.set("GetNavigationModule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: js.Any => NavigationModule): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutlookDotNavigationModules_typekey(value: NavigationModules): Self = this.set("Outlook.NavigationModules_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
}
