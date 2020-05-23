package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlNavigationModuleType
import typings.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.NavigationModule")
@js.native
class NavigationModule protected ()
  extends typings.activexOutlook.Outlook.NavigationModule {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  override val NavigationModuleType: OlNavigationModuleType = js.native
  /* CompleteClass */
  @JSName("Outlook.NavigationModule_typekey")
  override var OutlookDotNavigationModule_typekey: typings.activexOutlook.Outlook.NavigationModule = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Position: Double = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override var Visible: Boolean = js.native
}

