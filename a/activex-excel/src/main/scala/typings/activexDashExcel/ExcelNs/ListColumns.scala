package typings.activexDashExcel.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListColumns extends js.Object {
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): ListColumn = js.native
  def apply(Index: Double): ListColumn = js.native
  def Add(): ListColumn = js.native
  def Add(Position: Double): ListColumn = js.native
  def Item(Index: String): ListColumn = js.native
  def Item(Index: Double): ListColumn = js.native
  def _Default(Index: js.Any): ListColumn = js.native
}

