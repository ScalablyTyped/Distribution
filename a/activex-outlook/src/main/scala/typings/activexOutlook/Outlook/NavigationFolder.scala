package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationFolder extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val DisplayName: String = js.native
  val Folder: typings.activexOutlook.Outlook.Folder = js.native
  val IsRemovable: Boolean = js.native
  var IsSelected: Boolean = js.native
  var IsSideBySide: Boolean = js.native
  @JSName("Outlook.NavigationFolder_typekey")
  var OutlookDotNavigationFolder_typekey: NavigationFolder = js.native
  val Parent: js.Any = js.native
  var Position: Double = js.native
  val Session: NameSpace = js.native
}

object NavigationFolder {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    DisplayName: String,
    Folder: Folder,
    IsRemovable: Boolean,
    IsSelected: Boolean,
    IsSideBySide: Boolean,
    OutlookDotNavigationFolder_typekey: NavigationFolder,
    Parent: js.Any,
    Position: Double,
    Session: NameSpace
  ): NavigationFolder = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], Folder = Folder.asInstanceOf[js.Any], IsRemovable = IsRemovable.asInstanceOf[js.Any], IsSelected = IsSelected.asInstanceOf[js.Any], IsSideBySide = IsSideBySide.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.NavigationFolder_typekey")(OutlookDotNavigationFolder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationFolder]
  }
  @scala.inline
  implicit class NavigationFolderOps[Self <: NavigationFolder] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFolder(value: Folder): Self = this.set("Folder", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRemovable(value: Boolean): Self = this.set("IsRemovable", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("IsSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSideBySide(value: Boolean): Self = this.set("IsSideBySide", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotNavigationFolder_typekey(value: NavigationFolder): Self = this.set("Outlook.NavigationFolder_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("Position", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
  
}

