package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorScaleCriterion extends js.Object {
  @JSName("Excel.ColorScaleCriterion_typekey")
  var ExcelDotColorScaleCriterion_typekey: ColorScaleCriterion = js.native
  val FormatColor: typings.activexExcel.Excel.FormatColor = js.native
  val Index: Double = js.native
  var Type: XlConditionValueTypes = js.native
  var Value: js.Any = js.native
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
  @scala.inline
  implicit class ColorScaleCriterionOps[Self <: ColorScaleCriterion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExcelDotColorScaleCriterion_typekey(value: ColorScaleCriterion): Self = this.set("Excel.ColorScaleCriterion_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatColor(value: FormatColor): Self = this.set("FormatColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: XlConditionValueTypes): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

