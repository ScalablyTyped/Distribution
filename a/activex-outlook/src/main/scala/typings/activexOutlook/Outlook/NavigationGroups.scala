package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationGroups extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.NavigationGroups_typekey")
  var OutlookDotNavigationGroups_typekey: NavigationGroups = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Create(GroupDisplayName: String): NavigationGroup = js.native
  def Delete(Group: NavigationGroup): Unit = js.native
  def GetDefaultNavigationGroup(DefaultFolderGroup: OlGroupType): NavigationGroup = js.native
  def Item(Index: js.Any): NavigationGroup = js.native
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
  @scala.inline
  implicit class NavigationGroupsOps[Self <: NavigationGroups] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreate(value: String => NavigationGroup): Self = this.set("Create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: NavigationGroup => Unit): Self = this.set("Delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDefaultNavigationGroup(value: OlGroupType => NavigationGroup): Self = this.set("GetDefaultNavigationGroup", js.Any.fromFunction1(value))
    @scala.inline
    def setItem(value: js.Any => NavigationGroup): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setOutlookDotNavigationGroups_typekey(value: NavigationGroups): Self = this.set("Outlook.NavigationGroups_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
  
}

