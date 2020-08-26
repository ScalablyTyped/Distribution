package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationGroup extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val GroupType: OlGroupType = js.native
  var Name: String = js.native
  val NavigationFolders: typings.activexOutlook.Outlook.NavigationFolders = js.native
  @JSName("Outlook.NavigationGroup_typekey")
  var OutlookDotNavigationGroup_typekey: NavigationGroup = js.native
  val Parent: js.Any = js.native
  var Position: Double = js.native
  val Session: NameSpace = js.native
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
  @scala.inline
  implicit class NavigationGroupOps[Self <: NavigationGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupType(value: OlGroupType): Self = this.set("GroupType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigationFolders(value: NavigationFolders): Self = this.set("NavigationFolders", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotNavigationGroup_typekey(value: NavigationGroup): Self = this.set("Outlook.NavigationGroup_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("Position", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
  
}

