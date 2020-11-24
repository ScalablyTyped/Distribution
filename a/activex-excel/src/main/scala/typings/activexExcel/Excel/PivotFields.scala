package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotFields extends js.Object {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.PivotFields_typekey")
  var ExcelDotPivotFields_typekey: PivotFields = js.native
  
  def Item(Index: String): PivotField = js.native
  def Item(Index: Double): PivotField = js.native
  
  val Parent: PivotTable = js.native
}
