package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileDialogFilter extends js.Object {
  val Application: js.Any
  val Creator: Double
  val Description: String
  val Extensions: String
  @JSName("Office.FileDialogFilter_typekey")
  var OfficeDotFileDialogFilter_typekey: FileDialogFilter
  val Parent: js.Any
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
}

