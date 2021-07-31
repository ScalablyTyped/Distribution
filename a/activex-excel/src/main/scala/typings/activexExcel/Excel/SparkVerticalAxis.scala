package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparkVerticalAxis extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  var CustomMaxScaleValue: js.Any
  
  var CustomMinScaleValue: js.Any
  
  @JSName("Excel.SparkVerticalAxis_typekey")
  var ExcelDotSparkVerticalAxis_typekey: SparkVerticalAxis
  
  var MaxScaleType: XlSparkScale
  
  var MinScaleType: XlSparkScale
  
  val Parent: js.Any
}
object SparkVerticalAxis {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    CustomMaxScaleValue: js.Any,
    CustomMinScaleValue: js.Any,
    ExcelDotSparkVerticalAxis_typekey: SparkVerticalAxis,
    MaxScaleType: XlSparkScale,
    MinScaleType: XlSparkScale,
    Parent: js.Any
  ): SparkVerticalAxis = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], CustomMaxScaleValue = CustomMaxScaleValue.asInstanceOf[js.Any], CustomMinScaleValue = CustomMinScaleValue.asInstanceOf[js.Any], MaxScaleType = MaxScaleType.asInstanceOf[js.Any], MinScaleType = MinScaleType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SparkVerticalAxis_typekey")(ExcelDotSparkVerticalAxis_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkVerticalAxis]
  }
  
  @scala.inline
  implicit class SparkVerticalAxisMutableBuilder[Self <: SparkVerticalAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMaxScaleValue(value: js.Any): Self = StObject.set(x, "CustomMaxScaleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMinScaleValue(value: js.Any): Self = StObject.set(x, "CustomMinScaleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotSparkVerticalAxis_typekey(value: SparkVerticalAxis): Self = StObject.set(x, "Excel.SparkVerticalAxis_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxScaleType(value: XlSparkScale): Self = StObject.set(x, "MaxScaleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinScaleType(value: XlSparkScale): Self = StObject.set(x, "MinScaleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
