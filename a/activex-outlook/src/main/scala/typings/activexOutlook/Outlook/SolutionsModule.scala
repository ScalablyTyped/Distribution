package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SolutionsModule extends StObject {
  
  def AddSolution(Solution: Folder, Scope: OlSolutionScope): Unit
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Name: String
  
  val NavigationModuleType: OlNavigationModuleType
  
  /* private */ @JSName("Outlook.SolutionsModule_typekey")
  var OutlookDotSolutionsModule_typekey: SolutionsModule
  
  val Parent: js.Any
  
  var Position: Double
  
  val Session: NameSpace
  
  var Visible: Boolean
}
object SolutionsModule {
  
  inline def apply(
    AddSolution: (Folder, OlSolutionScope) => Unit,
    Application: Application,
    Class: OlObjectClass,
    Name: String,
    NavigationModuleType: OlNavigationModuleType,
    OutlookDotSolutionsModule_typekey: SolutionsModule,
    Parent: js.Any,
    Position: Double,
    Session: NameSpace,
    Visible: Boolean
  ): SolutionsModule = {
    val __obj = js.Dynamic.literal(AddSolution = js.Any.fromFunction2(AddSolution), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NavigationModuleType = NavigationModuleType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.SolutionsModule_typekey")(OutlookDotSolutionsModule_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SolutionsModule]
  }
  
  extension [Self <: SolutionsModule](x: Self) {
    
    inline def setAddSolution(value: (Folder, OlSolutionScope) => Unit): Self = StObject.set(x, "AddSolution", js.Any.fromFunction2(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNavigationModuleType(value: OlNavigationModuleType): Self = StObject.set(x, "NavigationModuleType", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotSolutionsModule_typekey(value: SolutionsModule): Self = StObject.set(x, "Outlook.SolutionsModule_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
