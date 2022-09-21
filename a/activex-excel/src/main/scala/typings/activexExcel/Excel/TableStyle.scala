package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableStyle extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val BuiltIn: Boolean = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  def Duplicate(): TableStyle = js.native
  def Duplicate(NewTableStyleName: String): TableStyle = js.native
  
  /* private */ @JSName("Excel.TableStyle_typekey")
  var ExcelDotTableStyle_typekey: TableStyle = js.native
  
  val Name: String = js.native
  
  val NameLocal: String = js.native
  
  val Parent: Any = js.native
  
  var ShowAsAvailablePivotTableStyle: Boolean = js.native
  
  var ShowAsAvailableSlicerStyle: Boolean = js.native
  
  var ShowAsAvailableTableStyle: Boolean = js.native
  
  def TableStyleElements(Index: XlTableStyleElementType): TableStyleElement = js.native
  @JSName("TableStyleElements")
  val TableStyleElements_Original: TableStyleElements = js.native
  
  val _Default: String = js.native
}
