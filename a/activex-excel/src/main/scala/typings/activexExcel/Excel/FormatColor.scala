package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatColor extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  var Color: XlRgbColor | Double
  
  var ColorIndex: XlColorIndex
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.FormatColor_typekey")
  var ExcelDotFormatColor_typekey: FormatColor
  
  val Parent: js.Any
  
  var ThemeColor: XlThemeColor
  
  var TintAndShade: Double
}
object FormatColor {
  
  inline def apply(
    Application: Application,
    Color: XlRgbColor | Double,
    ColorIndex: XlColorIndex,
    Creator: XlCreator,
    ExcelDotFormatColor_typekey: FormatColor,
    Parent: js.Any,
    ThemeColor: XlThemeColor,
    TintAndShade: Double
  ): FormatColor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ThemeColor = ThemeColor.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.FormatColor_typekey")(ExcelDotFormatColor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatColor]
  }
  
  extension [Self <: FormatColor](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setColor(value: XlRgbColor | Double): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorIndex(value: XlColorIndex): Self = StObject.set(x, "ColorIndex", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotFormatColor_typekey(value: FormatColor): Self = StObject.set(x, "Excel.FormatColor_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setThemeColor(value: XlThemeColor): Self = StObject.set(x, "ThemeColor", value.asInstanceOf[js.Any])
    
    inline def setTintAndShade(value: Double): Self = StObject.set(x, "TintAndShade", value.asInstanceOf[js.Any])
  }
}
