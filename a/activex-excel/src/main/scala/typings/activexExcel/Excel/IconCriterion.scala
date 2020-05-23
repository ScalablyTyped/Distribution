package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconCriterion extends js.Object {
  @JSName("Excel.IconCriterion_typekey")
  var ExcelDotIconCriterion_typekey: IconCriterion
  var Icon: XlIcon
  val Index: Double
  var Operator: Double
  var Type: XlConditionValueTypes
  var Value: Double | String
}

object IconCriterion {
  @scala.inline
  def apply(
    ExcelDotIconCriterion_typekey: IconCriterion,
    Icon: XlIcon,
    Index: Double,
    Operator: Double,
    Type: XlConditionValueTypes,
    Value: Double | String
  ): IconCriterion = {
    val __obj = js.Dynamic.literal(Icon = Icon.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.IconCriterion_typekey")(ExcelDotIconCriterion_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconCriterion]
  }
}

