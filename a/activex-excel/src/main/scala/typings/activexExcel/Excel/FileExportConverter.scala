package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileExportConverter extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  val Description: String = js.native
  @JSName("Excel.FileExportConverter_typekey")
  var ExcelDotFileExportConverter_typekey: FileExportConverter = js.native
  val Extensions: String = js.native
  val FileFormat: Double = js.native
  val Parent: js.Any = js.native
}

object FileExportConverter {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Description: String,
    ExcelDotFileExportConverter_typekey: FileExportConverter,
    Extensions: String,
    FileFormat: Double,
    Parent: js.Any
  ): FileExportConverter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Extensions = Extensions.asInstanceOf[js.Any], FileFormat = FileFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.FileExportConverter_typekey")(ExcelDotFileExportConverter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileExportConverter]
  }
  @scala.inline
  implicit class FileExportConverterOps[Self <: FileExportConverter] (val x: Self) extends AnyVal {
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
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcelDotFileExportConverter_typekey(value: FileExportConverter): Self = this.set("Excel.FileExportConverter_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensions(value: String): Self = this.set("Extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileFormat(value: Double): Self = this.set("FileFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
  }
  
}

