package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorScaleCriterion extends js.Object {
  @JSName("Excel.ColorScaleCriterion_typekey")
  var ExcelDotColorScaleCriterion_typekey: ColorScaleCriterion
  val FormatColor: typings.activexExcel.Excel.FormatColor
  val Index: Double
  var Type: XlConditionValueTypes
  var Value: js.Any
}

object ColorScaleCriterion {
  @scala.inline
  def apply(
    ExcelDotColorScaleCriterion_typekey: ColorScaleCriterion,
    FormatColor: FormatColor,
    Index: Double,
    Type: XlConditionValueTypes,
    Value: js.Any
  ): ColorScaleCriterion = {
    val __obj = js.Dynamic.literal(FormatColor = FormatColor.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ColorScaleCriterion_typekey")(ExcelDotColorScaleCriterion_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorScaleCriterion]
  }
}

