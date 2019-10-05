package typings.activexDashOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.NavigationGroups")
@js.native
class NavigationGroups protected () extends js.Object {
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  var `Outlook.NavigationGroups_typekey`: NavigationGroups = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Create(GroupDisplayName: String): NavigationGroup = js.native
  def Delete(Group: NavigationGroup): Unit = js.native
  def GetDefaultNavigationGroup(DefaultFolderGroup: OlGroupType): NavigationGroup = js.native
  def Item(Index: js.Any): NavigationGroup = js.native
}

