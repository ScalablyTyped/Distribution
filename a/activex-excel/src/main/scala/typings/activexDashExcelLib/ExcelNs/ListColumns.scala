package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListColumns extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): ListColumn = js.native
  def apply(Index: scala.Double): ListColumn = js.native
  def Add(): ListColumn = js.native
  def Add(Position: scala.Double): ListColumn = js.native
  def Item(Index: java.lang.String): ListColumn = js.native
  def Item(Index: scala.Double): ListColumn = js.native
  def _Default(Index: js.Any): ListColumn = js.native
}

