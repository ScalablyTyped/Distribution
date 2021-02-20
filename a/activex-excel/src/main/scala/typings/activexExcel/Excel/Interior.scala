package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Interior extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  var Color: XlRgbColor | Double = js.native
  
  var ColorIndex: Double | XlColorIndex = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.Interior_typekey")
  var ExcelDotInterior_typekey: Interior = js.native
  
  val Gradient: js.Any = js.native
  
  var InvertIfNegative: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  var Pattern: XlPattern = js.native
  
  var PatternColor: XlRgbColor | Double = js.native
  
  var PatternColorIndex: Double | XlColorIndex = js.native
  
  var PatternThemeColor: XlThemeColor = js.native
  
  var PatternTintAndShade: Double = js.native
  
  var ThemeColor: XlThemeColor = js.native
  
  var TintAndShade: Double = js.native
}
object Interior {
  
  @scala.inline
  def apply(
    Application: Application,
    Color: XlRgbColor | Double,
    ColorIndex: Double | XlColorIndex,
    Creator: XlCreator,
    ExcelDotInterior_typekey: Interior,
    Gradient: js.Any,
    InvertIfNegative: Boolean,
    Parent: js.Any,
    Pattern: XlPattern,
    PatternColor: XlRgbColor | Double,
    PatternColorIndex: Double | XlColorIndex,
    PatternThemeColor: XlThemeColor,
    PatternTintAndShade: Double,
    ThemeColor: XlThemeColor,
    TintAndShade: Double
  ): Interior = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Gradient = Gradient.asInstanceOf[js.Any], InvertIfNegative = InvertIfNegative.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PatternColor = PatternColor.asInstanceOf[js.Any], PatternColorIndex = PatternColorIndex.asInstanceOf[js.Any], PatternThemeColor = PatternThemeColor.asInstanceOf[js.Any], PatternTintAndShade = PatternTintAndShade.asInstanceOf[js.Any], ThemeColor = ThemeColor.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Interior_typekey")(ExcelDotInterior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interior]
  }
  
  @scala.inline
  implicit class InteriorMutableBuilder[Self <: Interior] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: XlRgbColor | Double): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIndex(value: Double | XlColorIndex): Self = StObject.set(x, "ColorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotInterior_typekey(value: Interior): Self = StObject.set(x, "Excel.Interior_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradient(value: js.Any): Self = StObject.set(x, "Gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertIfNegative(value: Boolean): Self = StObject.set(x, "InvertIfNegative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: XlPattern): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternColor(value: XlRgbColor | Double): Self = StObject.set(x, "PatternColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternColorIndex(value: Double | XlColorIndex): Self = StObject.set(x, "PatternColorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternThemeColor(value: XlThemeColor): Self = StObject.set(x, "PatternThemeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternTintAndShade(value: Double): Self = StObject.set(x, "PatternTintAndShade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeColor(value: XlThemeColor): Self = StObject.set(x, "ThemeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintAndShade(value: Double): Self = StObject.set(x, "TintAndShade", value.asInstanceOf[js.Any])
  }
}
