package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddIn extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Author: String
  val CLSID: String
  val Comments: String
  val Creator: XlCreator
  @JSName("Excel.AddIn_typekey")
  var ExcelDotAddIn_typekey: AddIn
  val FullName: String
  var Installed: Boolean
  val IsOpen: Boolean
  val Keywords: String
  val Name: String
  val Parent: js.Any
  val Path: String
  val Subject: String
  val Title: String
  val progID: String
}

object AddIn {
  @scala.inline
  def apply(
    Application: Application,
    Author: String,
    CLSID: String,
    Comments: String,
    Creator: XlCreator,
    ExcelDotAddIn_typekey: AddIn,
    FullName: String,
    Installed: Boolean,
    IsOpen: Boolean,
    Keywords: String,
    Name: String,
    Parent: js.Any,
    Path: String,
    Subject: String,
    Title: String,
    progID: String
  ): AddIn = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], CLSID = CLSID.asInstanceOf[js.Any], Comments = Comments.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], Installed = Installed.asInstanceOf[js.Any], IsOpen = IsOpen.asInstanceOf[js.Any], Keywords = Keywords.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], progID = progID.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.AddIn_typekey")(ExcelDotAddIn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddIn]
  }
}

