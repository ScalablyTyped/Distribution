package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddIn extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Author: String = js.native
  val CLSID: String = js.native
  val Comments: String = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.AddIn_typekey")
  var ExcelDotAddIn_typekey: AddIn = js.native
  val FullName: String = js.native
  var Installed: Boolean = js.native
  val IsOpen: Boolean = js.native
  val Keywords: String = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val Path: String = js.native
  val Subject: String = js.native
  val Title: String = js.native
  val progID: String = js.native
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
  @scala.inline
  implicit class AddInOps[Self <: AddIn] (val x: Self) extends AnyVal {
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
    def setAuthor(value: String): Self = this.set("Author", value.asInstanceOf[js.Any])
    @scala.inline
    def setCLSID(value: String): Self = this.set("CLSID", value.asInstanceOf[js.Any])
    @scala.inline
    def setComments(value: String): Self = this.set("Comments", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcelDotAddIn_typekey(value: AddIn): Self = this.set("Excel.AddIn_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullName(value: String): Self = this.set("FullName", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstalled(value: Boolean): Self = this.set("Installed", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("IsOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeywords(value: String): Self = this.set("Keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("Path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: String): Self = this.set("Subject", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgID(value: String): Self = this.set("progID", value.asInstanceOf[js.Any])
  }
  
}

