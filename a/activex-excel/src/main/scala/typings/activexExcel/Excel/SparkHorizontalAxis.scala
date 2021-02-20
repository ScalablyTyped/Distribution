package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparkHorizontalAxis extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Axis: SparkColor = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.SparkHorizontalAxis_typekey")
  var ExcelDotSparkHorizontalAxis_typekey: SparkHorizontalAxis = js.native
  
  val IsDateAxis: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  var RightToLeftPlotOrder: Boolean = js.native
}
object SparkHorizontalAxis {
  
  @scala.inline
  def apply(
    Application: Application,
    Axis: SparkColor,
    Creator: XlCreator,
    ExcelDotSparkHorizontalAxis_typekey: SparkHorizontalAxis,
    IsDateAxis: Boolean,
    Parent: js.Any,
    RightToLeftPlotOrder: Boolean
  ): SparkHorizontalAxis = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Axis = Axis.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], IsDateAxis = IsDateAxis.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RightToLeftPlotOrder = RightToLeftPlotOrder.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SparkHorizontalAxis_typekey")(ExcelDotSparkHorizontalAxis_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkHorizontalAxis]
  }
  
  @scala.inline
  implicit class SparkHorizontalAxisMutableBuilder[Self <: SparkHorizontalAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxis(value: SparkColor): Self = StObject.set(x, "Axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotSparkHorizontalAxis_typekey(value: SparkHorizontalAxis): Self = StObject.set(x, "Excel.SparkHorizontalAxis_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDateAxis(value: Boolean): Self = StObject.set(x, "IsDateAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightToLeftPlotOrder(value: Boolean): Self = StObject.set(x, "RightToLeftPlotOrder", value.asInstanceOf[js.Any])
  }
}
