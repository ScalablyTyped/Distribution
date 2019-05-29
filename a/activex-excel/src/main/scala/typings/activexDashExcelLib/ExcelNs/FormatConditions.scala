package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatConditions extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): FormatCondition = js.native
  def apply(Index: scala.Double): FormatCondition = js.native
  def Add(
    Type: XlFormatConditionType,
    Operator: js.UndefOr[XlFormatConditionOperator],
    Formula1: js.UndefOr[java.lang.String],
    Formula2: js.UndefOr[java.lang.String],
    String: js.UndefOr[js.Any],
    TextOperator: js.UndefOr[js.Any],
    DateOperator: js.UndefOr[js.Any],
    ScopeType: js.UndefOr[js.Any]
  ): FormatCondition = js.native
  def Add(Type: XlFormatConditionType, Operator: js.UndefOr[scala.Nothing], Formula1: java.lang.String): FormatCondition = js.native
  def Add(
    Type: XlFormatConditionType,
    Operator: XlFormatConditionOperator,
    Formula1: java.lang.String,
    Formula2: java.lang.String
  ): FormatCondition = js.native
  def AddAboveAverage(): AboveAverage = js.native
  def AddColorScale(ColorScaleType: scala.Double): ColorScale = js.native
  def AddDatabar(): Databar = js.native
  def AddIconSetCondition(): IconSetCondition = js.native
  def AddTop10(): Top10 = js.native
  def AddUniqueValues(): UniqueValues = js.native
  def Delete(): scala.Unit = js.native
  def Item(Index: java.lang.String): FormatCondition = js.native
  def Item(Index: scala.Double): FormatCondition = js.native
  def _Default(Index: js.Any): js.Any = js.native
}

