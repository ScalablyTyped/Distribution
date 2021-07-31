package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartColorFormat extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  @JSName("Excel.ChartColorFormat_typekey")
  var ExcelDotChartColorFormat_typekey: ChartColorFormat
  
  val Parent: js.Any
  
  val RGB: Double
  
  var SchemeColor: Double
  
  val Type: Double
  
  val _Default: Double
}
object ChartColorFormat {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotChartColorFormat_typekey: ChartColorFormat,
    Parent: js.Any,
    RGB: Double,
    SchemeColor: Double,
    Type: Double,
    _Default: Double
  ): ChartColorFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any], SchemeColor = SchemeColor.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ChartColorFormat_typekey")(ExcelDotChartColorFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartColorFormat]
  }
  
  @scala.inline
  implicit class ChartColorFormatMutableBuilder[Self <: ChartColorFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotChartColorFormat_typekey(value: ChartColorFormat): Self = StObject.set(x, "Excel.ChartColorFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRGB(value: Double): Self = StObject.set(x, "RGB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeColor(value: Double): Self = StObject.set(x, "SchemeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_Default(value: Double): Self = StObject.set(x, "_Default", value.asInstanceOf[js.Any])
  }
}
