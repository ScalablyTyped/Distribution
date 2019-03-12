package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HPageBreaks extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: scala.Double): HPageBreak = js.native
  def Add(Before: Range): HPageBreak = js.native
  def Item(Index: scala.Double): HPageBreak = js.native
  def _Default(Index: scala.Double): HPageBreak = js.native
}

