package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorScaleCriterion extends StObject {
  
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
  implicit class ColorScaleCriterionMutableBuilder[Self <: ColorScaleCriterion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcelDotColorScaleCriterion_typekey(value: ColorScaleCriterion): Self = StObject.set(x, "Excel.ColorScaleCriterion_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatColor(value: FormatColor): Self = StObject.set(x, "FormatColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: XlConditionValueTypes): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
