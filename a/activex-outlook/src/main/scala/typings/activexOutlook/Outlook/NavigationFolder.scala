package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationFolder extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val DisplayName: String
  val Folder: typings.activexOutlook.Outlook.Folder
  val IsRemovable: Boolean
  var IsSelected: Boolean
  var IsSideBySide: Boolean
  @JSName("Outlook.NavigationFolder_typekey")
  var OutlookDotNavigationFolder_typekey: NavigationFolder
  val Parent: js.Any
  var Position: Double
  val Session: NameSpace
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
}

