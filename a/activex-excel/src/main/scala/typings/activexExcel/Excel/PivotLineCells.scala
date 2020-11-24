package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotLineCells extends js.Object {
  
  def apply(Index: Double): PivotCell = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: Double): PivotCell = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: js.Any): PivotCell = js.native
}
