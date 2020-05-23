package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationGroup extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val GroupType: OlGroupType
  var Name: String
  val NavigationFolders: typings.activexOutlook.Outlook.NavigationFolders
  @JSName("Outlook.NavigationGroup_typekey")
  var OutlookDotNavigationGroup_typekey: NavigationGroup
  val Parent: js.Any
  var Position: Double
  val Session: NameSpace
}

object NavigationGroup {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    GroupType: OlGroupType,
    Name: String,
    NavigationFolders: NavigationFolders,
    OutlookDotNavigationGroup_typekey: NavigationGroup,
    Parent: js.Any,
    Position: Double,
    Session: NameSpace
  ): NavigationGroup = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], GroupType = GroupType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NavigationFolders = NavigationFolders.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.NavigationGroup_typekey")(OutlookDotNavigationGroup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationGroup]
  }
}

