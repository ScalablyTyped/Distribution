package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotesModule extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Name: String
  
  val NavigationGroups: typings.activexOutlook.Outlook.NavigationGroups
  
  val NavigationModuleType: OlNavigationModuleType
  
  @JSName("Outlook.NotesModule_typekey")
  var OutlookDotNotesModule_typekey: NotesModule
  
  val Parent: js.Any
  
  var Position: Double
  
  val Session: NameSpace
  
  var Visible: Boolean
}
object NotesModule {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Name: String,
    NavigationGroups: NavigationGroups,
    NavigationModuleType: OlNavigationModuleType,
    OutlookDotNotesModule_typekey: NotesModule,
    Parent: js.Any,
    Position: Double,
    Session: NameSpace,
    Visible: Boolean
  ): NotesModule = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NavigationGroups = NavigationGroups.asInstanceOf[js.Any], NavigationModuleType = NavigationModuleType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.NotesModule_typekey")(OutlookDotNotesModule_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotesModule]
  }
  
  @scala.inline
  implicit class NotesModuleMutableBuilder[Self <: NotesModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationGroups(value: NavigationGroups): Self = StObject.set(x, "NavigationGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationModuleType(value: OlNavigationModuleType): Self = StObject.set(x, "NavigationModuleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotNotesModule_typekey(value: NotesModule): Self = StObject.set(x, "Outlook.NotesModule_typekey", value.asInstanceOf[js.Any])
    
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
