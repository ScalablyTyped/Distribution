package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecentFile extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  @JSName("Excel.RecentFile_typekey")
  var ExcelDotRecentFile_typekey: RecentFile
  val Index: Double
  val Name: String
  val Parent: js.Any
  val Path: String
  def Delete(): Unit
  def Open(): Workbook
}

object RecentFile {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Delete: () => Unit,
    ExcelDotRecentFile_typekey: RecentFile,
    Index: Double,
    Name: String,
    Open: () => Workbook,
    Parent: js.Any,
    Path: String
  ): RecentFile = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Open = js.Any.fromFunction0(Open), Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.RecentFile_typekey")(ExcelDotRecentFile_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecentFile]
  }
}

