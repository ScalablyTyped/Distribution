package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HPageBreaks extends js.Object {
  
  def apply(Index: Double): HPageBreak = js.native
  
  def Add(Before: Range): HPageBreak = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: Double): HPageBreak = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: Double): HPageBreak = js.native
}
