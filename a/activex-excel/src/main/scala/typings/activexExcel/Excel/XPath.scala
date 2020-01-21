package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.XPath")
@js.native
class XPath protected () extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.XPath_typekey")
  var ExcelDotXPath_typekey: XPath = js.native
  val Map: XmlMap = js.native
  val Parent: js.Any = js.native
  val Repeating: Boolean = js.native
  val Value: String = js.native
  val _Default: String = js.native
  def Clear(): Unit = js.native
  def SetValue(Map: XmlMap, XPath: String): Unit = js.native
  def SetValue(Map: XmlMap, XPath: String, SelectionNamespace: js.Any): Unit = js.native
  def SetValue(Map: XmlMap, XPath: String, SelectionNamespace: js.Any, Repeating: Boolean): Unit = js.native
}

