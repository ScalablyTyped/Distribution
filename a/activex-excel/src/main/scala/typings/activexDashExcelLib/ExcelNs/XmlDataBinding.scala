package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.XmlDataBinding")
@js.native
class XmlDataBinding protected () extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Creator: XlCreator = js.native
  var `Excel.XmlDataBinding_typekey`: XmlDataBinding = js.native
  val Parent: js.Any = js.native
  val SourceUrl: java.lang.String = js.native
  val _Default: java.lang.String = js.native
  def ClearSettings(): scala.Unit = js.native
  def LoadSettings(Url: java.lang.String): scala.Unit = js.native
  def Refresh(): XlXmlImportResult = js.native
}

