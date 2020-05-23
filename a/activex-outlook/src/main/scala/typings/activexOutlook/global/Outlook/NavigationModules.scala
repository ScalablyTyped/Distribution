package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlNavigationModuleType
import typings.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.NavigationModules")
@js.native
class NavigationModules protected ()
  extends typings.activexOutlook.Outlook.NavigationModules {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  @JSName("Outlook.NavigationModules_typekey")
  override var OutlookDotNavigationModules_typekey: typings.activexOutlook.Outlook.NavigationModules = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def GetNavigationModule(ModuleType: OlNavigationModuleType): typings.activexOutlook.Outlook.NavigationModule = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexOutlook.Outlook.NavigationModule = js.native
}

