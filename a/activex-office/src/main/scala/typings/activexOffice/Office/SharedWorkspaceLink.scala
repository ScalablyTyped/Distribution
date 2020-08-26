package typings.activexOffice.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedWorkspaceLink extends js.Object {
  val Application: js.Any = js.native
  val CreatedBy: String = js.native
  val CreatedDate: VarDate = js.native
  val Creator: Double = js.native
  var Description: String = js.native
  val ModifiedBy: String = js.native
  val ModifiedDate: VarDate = js.native
  var Notes: String = js.native
  @JSName("Office.SharedWorkspaceLink_typekey")
  var OfficeDotSharedWorkspaceLink_typekey: SharedWorkspaceLink = js.native
  val Parent: js.Any = js.native
  var URL: String = js.native
  def Delete(): Unit = js.native
  def Save(): Unit = js.native
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
  @scala.inline
  implicit class SharedWorkspaceLinkOps[Self <: SharedWorkspaceLink] (val x: Self) extends AnyVal {
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
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedBy(value: String): Self = this.set("CreatedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedDate(value: VarDate): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiedBy(value: String): Self = this.set("ModifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiedDate(value: VarDate): Self = this.set("ModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotes(value: String): Self = this.set("Notes", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotSharedWorkspaceLink_typekey(value: SharedWorkspaceLink): Self = this.set("Office.SharedWorkspaceLink_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSave(value: () => Unit): Self = this.set("Save", js.Any.fromFunction0(value))
    @scala.inline
    def setURL(value: String): Self = this.set("URL", value.asInstanceOf[js.Any])
  }
  
}

