package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparkHorizontalAxis extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Axis: SparkColor
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.SparkHorizontalAxis_typekey")
  var ExcelDotSparkHorizontalAxis_typekey: SparkHorizontalAxis
  
  val IsDateAxis: Boolean
  
  val Parent: Any
  
  var RightToLeftPlotOrder: Boolean
}
object SparkHorizontalAxis {
  
  inline def apply(
    Application: Application,
    Axis: SparkColor,
    Creator: XlCreator,
    ExcelDotSparkHorizontalAxis_typekey: SparkHorizontalAxis,
    IsDateAxis: Boolean,
    Parent: Any,
    RightToLeftPlotOrder: Boolean
  ): SparkHorizontalAxis = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Axis = Axis.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], IsDateAxis = IsDateAxis.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RightToLeftPlotOrder = RightToLeftPlotOrder.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SparkHorizontalAxis_typekey")(ExcelDotSparkHorizontalAxis_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkHorizontalAxis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SparkHorizontalAxis] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAxis(value: SparkColor): Self = StObject.set(x, "Axis", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotSparkHorizontalAxis_typekey(value: SparkHorizontalAxis): Self = StObject.set(x, "Excel.SparkHorizontalAxis_typekey", value.asInstanceOf[js.Any])
    
    inline def setIsDateAxis(value: Boolean): Self = StObject.set(x, "IsDateAxis", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRightToLeftPlotOrder(value: Boolean): Self = StObject.set(x, "RightToLeftPlotOrder", value.asInstanceOf[js.Any])
  }
}
