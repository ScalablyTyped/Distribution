package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlGroupType
import typings.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.NavigationGroup")
@js.native
class NavigationGroup protected ()
  extends typings.activexOutlook.Outlook.NavigationGroup {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val GroupType: OlGroupType = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  override val NavigationFolders: typings.activexOutlook.Outlook.NavigationFolders = js.native
  /* CompleteClass */
  @JSName("Outlook.NavigationGroup_typekey")
  override var OutlookDotNavigationGroup_typekey: typings.activexOutlook.Outlook.NavigationGroup = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Position: Double = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}

