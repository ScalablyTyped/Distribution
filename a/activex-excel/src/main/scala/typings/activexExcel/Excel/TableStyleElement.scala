package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableStyleElement extends js.Object {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  def Borders(Index: XlBordersIndex): Border = js.native
  @JSName("Borders")
  val Borders_Original: Borders = js.native
  
  def Clear(): Unit = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.TableStyleElement_typekey")
  var ExcelDotTableStyleElement_typekey: TableStyleElement = js.native
  
  val Font: typings.activexExcel.Excel.Font = js.native
  
  val HasFormat: Boolean = js.native
  
  val Interior: typings.activexExcel.Excel.Interior = js.native
  
  val Parent: js.Any = js.native
  
  var StripeSize: Double = js.native
}
