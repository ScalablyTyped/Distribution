package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconCriterion extends js.Object {
  
  @JSName("Excel.IconCriterion_typekey")
  var ExcelDotIconCriterion_typekey: IconCriterion = js.native
  
  var Icon: XlIcon = js.native
  
  val Index: Double = js.native
  
  var Operator: Double = js.native
  
  var Type: XlConditionValueTypes = js.native
  
  var Value: Double | String = js.native
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
  
  @scala.inline
  implicit class IconCriterionOps[Self <: IconCriterion] (val x: Self) extends AnyVal {
    
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
    def setExcelDotIconCriterion_typekey(value: IconCriterion): Self = this.set("Excel.IconCriterion_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: XlIcon): Self = this.set("Icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: Double): Self = this.set("Operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: XlConditionValueTypes): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double | String): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
