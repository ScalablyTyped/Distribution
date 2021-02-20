package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationPane extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  var CurrentModule: NavigationModule = js.native
  
  var DisplayedModuleCount: Double = js.native
  
  var IsCollapsed: Boolean = js.native
  
  val Modules: NavigationModules = js.native
  
  @JSName("Outlook.NavigationPane_typekey")
  var OutlookDotNavigationPane_typekey: NavigationPane = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
}
object NavigationPane {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    CurrentModule: NavigationModule,
    DisplayedModuleCount: Double,
    IsCollapsed: Boolean,
    Modules: NavigationModules,
    OutlookDotNavigationPane_typekey: NavigationPane,
    Parent: js.Any,
    Session: NameSpace
  ): NavigationPane = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], CurrentModule = CurrentModule.asInstanceOf[js.Any], DisplayedModuleCount = DisplayedModuleCount.asInstanceOf[js.Any], IsCollapsed = IsCollapsed.asInstanceOf[js.Any], Modules = Modules.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.NavigationPane_typekey")(OutlookDotNavigationPane_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationPane]
  }
  
  @scala.inline
  implicit class NavigationPaneMutableBuilder[Self <: NavigationPane] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentModule(value: NavigationModule): Self = StObject.set(x, "CurrentModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayedModuleCount(value: Double): Self = StObject.set(x, "DisplayedModuleCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCollapsed(value: Boolean): Self = StObject.set(x, "IsCollapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModules(value: NavigationModules): Self = StObject.set(x, "Modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotNavigationPane_typekey(value: NavigationPane): Self = StObject.set(x, "Outlook.NavigationPane_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
