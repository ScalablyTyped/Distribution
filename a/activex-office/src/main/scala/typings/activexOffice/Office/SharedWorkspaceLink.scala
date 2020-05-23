package typings.activexOffice.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedWorkspaceLink extends js.Object {
  val Application: js.Any
  val CreatedBy: String
  val CreatedDate: VarDate
  val Creator: Double
  var Description: String
  val ModifiedBy: String
  val ModifiedDate: VarDate
  var Notes: String
  @JSName("Office.SharedWorkspaceLink_typekey")
  var OfficeDotSharedWorkspaceLink_typekey: SharedWorkspaceLink
  val Parent: js.Any
  var URL: String
  def Delete(): Unit
  def Save(): Unit
}

object SharedWorkspaceLink {
  @scala.inline
  def apply(
    Application: js.Any,
    CreatedBy: String,
    CreatedDate: VarDate,
    Creator: Double,
    Delete: () => Unit,
    Description: String,
    ModifiedBy: String,
    ModifiedDate: VarDate,
    Notes: String,
    OfficeDotSharedWorkspaceLink_typekey: SharedWorkspaceLink,
    Parent: js.Any,
    Save: () => Unit,
    URL: String
  ): SharedWorkspaceLink = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CreatedBy = CreatedBy.asInstanceOf[js.Any], CreatedDate = CreatedDate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Description = Description.asInstanceOf[js.Any], ModifiedBy = ModifiedBy.asInstanceOf[js.Any], ModifiedDate = ModifiedDate.asInstanceOf[js.Any], Notes = Notes.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), URL = URL.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SharedWorkspaceLink_typekey")(OfficeDotSharedWorkspaceLink_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedWorkspaceLink]
  }
}

