package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationGroups extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  @JSName("Outlook.NavigationGroups_typekey")
  var OutlookDotNavigationGroups_typekey: NavigationGroups
  val Parent: js.Any
  val Session: NameSpace
  def Create(GroupDisplayName: String): NavigationGroup
  def Delete(Group: NavigationGroup): Unit
  def GetDefaultNavigationGroup(DefaultFolderGroup: OlGroupType): NavigationGroup
  def Item(Index: js.Any): NavigationGroup
}

object NavigationGroups {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Create: String => NavigationGroup,
    Delete: NavigationGroup => Unit,
    GetDefaultNavigationGroup: OlGroupType => NavigationGroup,
    Item: js.Any => NavigationGroup,
    OutlookDotNavigationGroups_typekey: NavigationGroups,
    Parent: js.Any,
    Session: NameSpace
  ): NavigationGroups = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Create = js.Any.fromFunction1(Create), Delete = js.Any.fromFunction1(Delete), GetDefaultNavigationGroup = js.Any.fromFunction1(GetDefaultNavigationGroup), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.NavigationGroups_typekey")(OutlookDotNavigationGroups_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationGroups]
  }
}

