package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileDialogFilter extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val Description: String = js.native
  val Extensions: String = js.native
  @JSName("Office.FileDialogFilter_typekey")
  var OfficeDotFileDialogFilter_typekey: FileDialogFilter = js.native
  val Parent: js.Any = js.native
}

object FileDialogFilter {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Description: String,
    Extensions: String,
    OfficeDotFileDialogFilter_typekey: FileDialogFilter,
    Parent: js.Any
  ): FileDialogFilter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Extensions = Extensions.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.FileDialogFilter_typekey")(OfficeDotFileDialogFilter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDialogFilter]
  }
  @scala.inline
  implicit class FileDialogFilterOps[Self <: FileDialogFilter] (val x: Self) extends AnyVal {
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
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensions(value: String): Self = this.set("Extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotFileDialogFilter_typekey(value: FileDialogFilter): Self = this.set("Office.FileDialogFilter_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
  }
  
}

