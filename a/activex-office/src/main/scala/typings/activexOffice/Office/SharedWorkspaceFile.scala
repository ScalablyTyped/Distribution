package typings.activexOffice.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedWorkspaceFile extends js.Object {
  val Application: js.Any
  val CreatedBy: String
  val CreatedDate: VarDate
  val Creator: Double
  val ModifiedBy: String
  val ModifiedDate: VarDate
  @JSName("Office.SharedWorkspaceFile_typekey")
  var OfficeDotSharedWorkspaceFile_typekey: SharedWorkspaceFile
  val Parent: js.Any
  val URL: String
  def Delete(): Unit
}

object SharedWorkspaceFile {
  @scala.inline
  def apply(
    Application: js.Any,
    CreatedBy: String,
    CreatedDate: VarDate,
    Creator: Double,
    Delete: () => Unit,
    ModifiedBy: String,
    ModifiedDate: VarDate,
    OfficeDotSharedWorkspaceFile_typekey: SharedWorkspaceFile,
    Parent: js.Any,
    URL: String
  ): SharedWorkspaceFile = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CreatedBy = CreatedBy.asInstanceOf[js.Any], CreatedDate = CreatedDate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), ModifiedBy = ModifiedBy.asInstanceOf[js.Any], ModifiedDate = ModifiedDate.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SharedWorkspaceFile_typekey")(OfficeDotSharedWorkspaceFile_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedWorkspaceFile]
  }
}

