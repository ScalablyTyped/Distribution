package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JournalModule extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Name: String
  
  val NavigationGroups: typings.activexOutlook.Outlook.NavigationGroups
  
  val NavigationModuleType: OlNavigationModuleType
  
  /* private */ @JSName("Outlook.JournalModule_typekey")
  var OutlookDotJournalModule_typekey: JournalModule
  
  val Parent: js.Any
  
  var Position: Double
  
  val Session: NameSpace
  
  var Visible: Boolean
}
object JournalModule {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    Name: String,
    NavigationGroups: NavigationGroups,
    NavigationModuleType: OlNavigationModuleType,
    OutlookDotJournalModule_typekey: JournalModule,
    Parent: js.Any,
    Position: Double,
    Session: NameSpace,
    Visible: Boolean
  ): JournalModule = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NavigationGroups = NavigationGroups.asInstanceOf[js.Any], NavigationModuleType = NavigationModuleType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.JournalModule_typekey")(OutlookDotJournalModule_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[JournalModule]
  }
  
  extension [Self <: JournalModule](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNavigationGroups(value: NavigationGroups): Self = StObject.set(x, "NavigationGroups", value.asInstanceOf[js.Any])
    
    inline def setNavigationModuleType(value: OlNavigationModuleType): Self = StObject.set(x, "NavigationModuleType", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotJournalModule_typekey(value: JournalModule): Self = StObject.set(x, "Outlook.JournalModule_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
