package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XPath extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  def Clear(): Unit = js.native
  
  val Creator: XlCreator = js.native
  
  /* private */ @JSName("Excel.XPath_typekey")
  var ExcelDotXPath_typekey: XPath = js.native
  
  val Map: XmlMap = js.native
  
  val Parent: Any = js.native
  
  val Repeating: Boolean = js.native
  
  def SetValue(Map: XmlMap, XPath: String): Unit = js.native
  def SetValue(Map: XmlMap, XPath: String, SelectionNamespace: Any): Unit = js.native
  def SetValue(Map: XmlMap, XPath: String, SelectionNamespace: Any, Repeating: Boolean): Unit = js.native
  def SetValue(Map: XmlMap, XPath: String, SelectionNamespace: Unit, Repeating: Boolean): Unit = js.native
  
  val Value: String = js.native
  
  val _Default: String = js.native
}
