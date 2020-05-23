package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlGroupType
import typings.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.NavigationGroups")
@js.native
class NavigationGroups protected ()
  extends typings.activexOutlook.Outlook.NavigationGroups {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  @JSName("Outlook.NavigationGroups_typekey")
  override var OutlookDotNavigationGroups_typekey: typings.activexOutlook.Outlook.NavigationGroups = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def Create(GroupDisplayName: String): typings.activexOutlook.Outlook.NavigationGroup = js.native
  /* CompleteClass */
  override def Delete(Group: typings.activexOutlook.Outlook.NavigationGroup): Unit = js.native
  /* CompleteClass */
  override def GetDefaultNavigationGroup(DefaultFolderGroup: OlGroupType): typings.activexOutlook.Outlook.NavigationGroup = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexOutlook.Outlook.NavigationGroup = js.native
}

