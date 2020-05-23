package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileExportConverter extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  val Description: String
  @JSName("Excel.FileExportConverter_typekey")
  var ExcelDotFileExportConverter_typekey: FileExportConverter
  val Extensions: String
  val FileFormat: Double
  val Parent: js.Any
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
}

