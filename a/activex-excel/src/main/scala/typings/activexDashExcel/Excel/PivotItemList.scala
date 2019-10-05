package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotItemList extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Field: String): PivotItem = js.native
  def apply(Field: Double): PivotItem = js.native
  def Item(Index: String): PivotItem = js.native
  def Item(Index: Double): PivotItem = js.native
  def _Default(Field: js.Any): PivotItem = js.native
}

