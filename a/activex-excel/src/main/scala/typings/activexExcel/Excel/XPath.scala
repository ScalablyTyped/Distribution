package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XPath extends js.Object {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  def Clear(): Unit = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.XPath_typekey")
  var ExcelDotXPath_typekey: XPath = js.native
  
  val Map: XmlMap = js.native
  
  val Parent: js.Any = js.native
  
  val Repeating: Boolean = js.native
  
  def SetValue(Map: XmlMap, XPath: String): Unit = js.native
  def SetValue(Map: XmlMap, XPath: String, SelectionNamespace: js.UndefOr[scala.Nothing], Repeating: Boolean): Unit = js.native
  def SetValue(Map: XmlMap, XPath: String, SelectionNamespace: js.Any): Unit = js.native
  def SetValue(Map: XmlMap, XPath: String, SelectionNamespace: js.Any, Repeating: Boolean): Unit = js.native
  
  val Value: String = js.native
  
  val _Default: String = js.native
}
