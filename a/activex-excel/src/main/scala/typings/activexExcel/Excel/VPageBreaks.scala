package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VPageBreaks extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: Double): VPageBreak = js.native
  def Add(Before: Range): VPageBreak = js.native
  def Item(Index: Double): VPageBreak = js.native
  def _Default(Index: Double): VPageBreak = js.native
}

