package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlNavigationModuleType
import typings.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.NavigationModules")
@js.native
/* private */ open class NavigationModules ()
  extends StObject
     with typings.activexOutlook.Outlook.NavigationModules {
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def GetNavigationModule(ModuleType: OlNavigationModuleType): typings.activexOutlook.Outlook.NavigationModule = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): typings.activexOutlook.Outlook.NavigationModule = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.NavigationModules_typekey")
  var OutlookDotNavigationModules_typekey: typings.activexOutlook.Outlook.NavigationModules = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}
