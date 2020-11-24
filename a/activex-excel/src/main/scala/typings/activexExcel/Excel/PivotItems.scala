package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotItems extends js.Object {
  
  def Add(Name: String): Unit = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.PivotItems_typekey")
  var ExcelDotPivotItems_typekey: PivotItems = js.native
  
  def Item(Index: String): js.Any = js.native
  def Item(Index: Double): js.Any = js.native
  
  val Parent: PivotField = js.native
}
