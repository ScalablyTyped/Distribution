package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotFilters extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: Double): PivotFilter = js.native
  def Add(
    Type: XlPivotFilterType,
    DataField: js.UndefOr[js.Any],
    Value1: js.UndefOr[js.Any],
    Value2: js.UndefOr[js.Any],
    Order: js.UndefOr[js.Any],
    Name: js.UndefOr[js.Any],
    Description: js.UndefOr[js.Any],
    MemberPropertyField: js.UndefOr[js.Any]
  ): PivotFilter = js.native
  def Item(Index: Double): PivotFilter = js.native
  def _Default(Index: js.Any): PivotFilter = js.native
}

