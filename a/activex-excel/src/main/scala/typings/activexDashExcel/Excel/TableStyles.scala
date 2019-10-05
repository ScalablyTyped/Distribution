package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableStyles extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): TableStyle = js.native
  def apply(Index: Double): TableStyle = js.native
  def Add(TableStyleName: String): TableStyle = js.native
  def Item(Index: String): TableStyle = js.native
  def Item(Index: Double): TableStyle = js.native
  def _Default(Index: js.Any): TableStyle = js.native
}

