package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.XPath")
@js.native
class XPath protected () extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Creator: XlCreator = js.native
  var `Excel.XPath_typekey`: XPath = js.native
  val Map: XmlMap = js.native
  val Parent: js.Any = js.native
  val Repeating: scala.Boolean = js.native
  val Value: java.lang.String = js.native
  val _Default: java.lang.String = js.native
  def Clear(): scala.Unit = js.native
  def SetValue(Map: XmlMap, XPath: java.lang.String): scala.Unit = js.native
  def SetValue(Map: XmlMap, XPath: java.lang.String, SelectionNamespace: js.Any): scala.Unit = js.native
  def SetValue(Map: XmlMap, XPath: java.lang.String, SelectionNamespace: js.Any, Repeating: scala.Boolean): scala.Unit = js.native
}

