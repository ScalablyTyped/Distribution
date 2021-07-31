package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tab extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  var Color: XlRgbColor | Double
  
  var ColorIndex: XlColorIndex
  
  val Creator: XlCreator
  
  @JSName("Excel.Tab_typekey")
  var ExcelDotTab_typekey: Tab
  
  val Parent: js.Any
  
  var ThemeColor: XlThemeColor
  
  var TintAndShade: Double
}
object Tab {
  
  @scala.inline
  def apply(
    Application: Application,
    Color: XlRgbColor | Double,
    ColorIndex: XlColorIndex,
    Creator: XlCreator,
    ExcelDotTab_typekey: Tab,
    Parent: js.Any,
    ThemeColor: XlThemeColor,
    TintAndShade: Double
  ): Tab = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ThemeColor = ThemeColor.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Tab_typekey")(ExcelDotTab_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
  
  @scala.inline
  implicit class TabMutableBuilder[Self <: Tab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: XlRgbColor | Double): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIndex(value: XlColorIndex): Self = StObject.set(x, "ColorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotTab_typekey(value: Tab): Self = StObject.set(x, "Excel.Tab_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeColor(value: XlThemeColor): Self = StObject.set(x, "ThemeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintAndShade(value: Double): Self = StObject.set(x, "TintAndShade", value.asInstanceOf[js.Any])
  }
}
