package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlNavigationModuleType
import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlSolutionScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.SolutionsModule")
@js.native
/* private */ open class SolutionsModule ()
  extends StObject
     with typings.activexOutlook.Outlook.SolutionsModule {
  
  /* CompleteClass */
  override def AddSolution(Solution: typings.activexOutlook.Outlook.Folder, Scope: OlSolutionScope): Unit = js.native
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override val NavigationModuleType: OlNavigationModuleType = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.SolutionsModule_typekey")
  var OutlookDotSolutionsModule_typekey: typings.activexOutlook.Outlook.SolutionsModule = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var Position: Double = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  var Visible: Boolean = js.native
}
