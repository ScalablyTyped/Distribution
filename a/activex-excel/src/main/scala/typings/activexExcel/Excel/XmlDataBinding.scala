package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.XmlDataBinding")
@js.native
class XmlDataBinding protected () extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.XmlDataBinding_typekey")
  var ExcelDotXmlDataBinding_typekey: XmlDataBinding = js.native
  val Parent: js.Any = js.native
  val SourceUrl: String = js.native
  val _Default: String = js.native
  def ClearSettings(): Unit = js.native
  def LoadSettings(Url: String): Unit = js.native
  def Refresh(): XlXmlImportResult = js.native
}

