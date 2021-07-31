package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationModule extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Name: String
  
  val NavigationModuleType: OlNavigationModuleType
  
  @JSName("Outlook.NavigationModule_typekey")
  var OutlookDotNavigationModule_typekey: NavigationModule
  
  val Parent: js.Any
  
  var Position: Double
  
  val Session: NameSpace
  
  var Visible: Boolean
}
object NavigationModule {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Name: String,
    NavigationModuleType: OlNavigationModuleType,
    OutlookDotNavigationModule_typekey: NavigationModule,
    Parent: js.Any,
    Position: Double,
    Session: NameSpace,
    Visible: Boolean
  ): NavigationModule = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NavigationModuleType = NavigationModuleType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.NavigationModule_typekey")(OutlookDotNavigationModule_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationModule]
  }
  
  @scala.inline
  implicit class NavigationModuleMutableBuilder[Self <: NavigationModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationModuleType(value: OlNavigationModuleType): Self = StObject.set(x, "NavigationModuleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotNavigationModule_typekey(value: NavigationModule): Self = StObject.set(x, "Outlook.NavigationModule_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
