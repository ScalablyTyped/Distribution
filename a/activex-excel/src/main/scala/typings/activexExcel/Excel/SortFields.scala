package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortFields extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: js.Any): SortField = js.native
  def Add(Key: Range): SortField = js.native
  def Add(Key: Range, SortOn: js.Any): SortField = js.native
  def Add(Key: Range, SortOn: js.Any, Order: js.Any): SortField = js.native
  def Add(Key: Range, SortOn: js.Any, Order: js.Any, CustomOrder: js.Any): SortField = js.native
  def Add(Key: Range, SortOn: js.Any, Order: js.Any, CustomOrder: js.Any, DataOption: js.Any): SortField = js.native
  def Clear(): Unit = js.native
  def Item(Index: js.Any): SortField = js.native
  def _Default(Index: js.Any): SortField = js.native
}

