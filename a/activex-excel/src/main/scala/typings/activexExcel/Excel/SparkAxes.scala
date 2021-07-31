package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparkAxes extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  @JSName("Excel.SparkAxes_typekey")
  var ExcelDotSparkAxes_typekey: SparkAxes
  
  val Horizontal: SparkHorizontalAxis
  
  val Parent: js.Any
  
  val Vertical: SparkVerticalAxis
}
object SparkAxes {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotSparkAxes_typekey: SparkAxes,
    Horizontal: SparkHorizontalAxis,
    Parent: js.Any,
    Vertical: SparkVerticalAxis
  ): SparkAxes = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Horizontal = Horizontal.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Vertical = Vertical.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SparkAxes_typekey")(ExcelDotSparkAxes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkAxes]
  }
  
  @scala.inline
  implicit class SparkAxesMutableBuilder[Self <: SparkAxes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotSparkAxes_typekey(value: SparkAxes): Self = StObject.set(x, "Excel.SparkAxes_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontal(value: SparkHorizontalAxis): Self = StObject.set(x, "Horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertical(value: SparkVerticalAxis): Self = StObject.set(x, "Vertical", value.asInstanceOf[js.Any])
  }
}
