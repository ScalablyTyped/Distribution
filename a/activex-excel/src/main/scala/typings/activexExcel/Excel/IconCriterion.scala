package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconCriterion extends StObject {
  
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
  implicit class IconCriterionMutableBuilder[Self <: IconCriterion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcelDotIconCriterion_typekey(value: IconCriterion): Self = StObject.set(x, "Excel.IconCriterion_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: XlIcon): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: Double): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: XlConditionValueTypes): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double | String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
