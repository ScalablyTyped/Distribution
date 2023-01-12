package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparkVerticalAxis extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  var CustomMaxScaleValue: Any
  
  var CustomMinScaleValue: Any
  
  /* private */ @JSName("Excel.SparkVerticalAxis_typekey")
  var ExcelDotSparkVerticalAxis_typekey: SparkVerticalAxis
  
  var MaxScaleType: XlSparkScale
  
  var MinScaleType: XlSparkScale
  
  val Parent: Any
}
object SparkVerticalAxis {
  
  inline def apply(
    Application: Application,
    Creator: XlCreator,
    CustomMaxScaleValue: Any,
    CustomMinScaleValue: Any,
    ExcelDotSparkVerticalAxis_typekey: SparkVerticalAxis,
    MaxScaleType: XlSparkScale,
    MinScaleType: XlSparkScale,
    Parent: Any
  ): SparkVerticalAxis = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], CustomMaxScaleValue = CustomMaxScaleValue.asInstanceOf[js.Any], CustomMinScaleValue = CustomMinScaleValue.asInstanceOf[js.Any], MaxScaleType = MaxScaleType.asInstanceOf[js.Any], MinScaleType = MinScaleType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SparkVerticalAxis_typekey")(ExcelDotSparkVerticalAxis_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkVerticalAxis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SparkVerticalAxis] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setCustomMaxScaleValue(value: Any): Self = StObject.set(x, "CustomMaxScaleValue", value.asInstanceOf[js.Any])
    
    inline def setCustomMinScaleValue(value: Any): Self = StObject.set(x, "CustomMinScaleValue", value.asInstanceOf[js.Any])
    
    inline def setExcelDotSparkVerticalAxis_typekey(value: SparkVerticalAxis): Self = StObject.set(x, "Excel.SparkVerticalAxis_typekey", value.asInstanceOf[js.Any])
    
    inline def setMaxScaleType(value: XlSparkScale): Self = StObject.set(x, "MaxScaleType", value.asInstanceOf[js.Any])
    
    inline def setMinScaleType(value: XlSparkScale): Self = StObject.set(x, "MinScaleType", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
