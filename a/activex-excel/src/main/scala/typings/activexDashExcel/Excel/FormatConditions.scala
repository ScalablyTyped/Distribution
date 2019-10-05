package typings.activexDashExcel.Excel

import typings.activexDashExcel.activexDashExcelNumbers.`1`
import typings.activexDashExcel.activexDashExcelNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatConditions extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): FormatCondition = js.native
  def apply(Index: Double): FormatCondition = js.native
  def Add(
    Type: XlFormatConditionType,
    Operator: js.UndefOr[XlFormatConditionOperator],
    Formula1: js.UndefOr[String],
    Formula2: js.UndefOr[String],
    String: js.UndefOr[js.Any],
    TextOperator: js.UndefOr[js.Any],
    DateOperator: js.UndefOr[js.Any],
    ScopeType: js.UndefOr[js.Any]
  ): FormatCondition = js.native
  def AddAboveAverage(): AboveAverage = js.native
  def AddColorScale(ColorScaleType: Double): ColorScale = js.native
  def AddDatabar(): Databar = js.native
  def AddIconSetCondition(): IconSetCondition = js.native
  def AddTop10(): Top10 = js.native
  def AddUniqueValues(): UniqueValues = js.native
  @JSName("Add")
  def Add_1(Type: XlFormatConditionType, Operator: `1`, Formula1: String, Formula2: String): FormatCondition = js.native
  @JSName("Add")
  def Add_2(Type: XlFormatConditionType, Operator: `2`, Formula1: String, Formula2: String): FormatCondition = js.native
  @JSName("Add")
  def Add_2(Type: `2`, Operator: js.UndefOr[scala.Nothing], Formula1: String): FormatCondition = js.native
  def Delete(): Unit = js.native
  def Item(Index: String): FormatCondition = js.native
  def Item(Index: Double): FormatCondition = js.native
  def _Default(Index: js.Any): js.Any = js.native
}

