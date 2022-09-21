package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Border extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  var Color: XlRgbColor | Double
  
  var ColorIndex: Double | XlColorIndex
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.Border_typekey")
  var ExcelDotBorder_typekey: Border
  
  var LineStyle: typings.activexExcel.Excel.LineStyle
  
  val Parent: Any
  
  var ThemeColor: XlThemeColor
  
  var TintAndShade: Double
  
  var Weight: XlBorderWeight
}
object Border {
  
  inline def apply(
    Application: Application,
    Color: XlRgbColor | Double,
    ColorIndex: Double | XlColorIndex,
    Creator: XlCreator,
    ExcelDotBorder_typekey: Border,
    LineStyle: LineStyle,
    Parent: Any,
    ThemeColor: XlThemeColor,
    TintAndShade: Double,
    Weight: XlBorderWeight
  ): Border = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ThemeColor = ThemeColor.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Border_typekey")(ExcelDotBorder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
  
  extension [Self <: Border](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setColor(value: XlRgbColor | Double): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorIndex(value: Double | XlColorIndex): Self = StObject.set(x, "ColorIndex", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotBorder_typekey(value: Border): Self = StObject.set(x, "Excel.Border_typekey", value.asInstanceOf[js.Any])
    
    inline def setLineStyle(value: LineStyle): Self = StObject.set(x, "LineStyle", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setThemeColor(value: XlThemeColor): Self = StObject.set(x, "ThemeColor", value.asInstanceOf[js.Any])
    
    inline def setTintAndShade(value: Double): Self = StObject.set(x, "TintAndShade", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: XlBorderWeight): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
  }
}
