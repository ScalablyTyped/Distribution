package typings.activexExcel.Excel

import typings.activexExcel.activexExcelStrings.Bold
import typings.activexExcel.activexExcelStrings.Italic
import typings.activexExcel.activexExcelStrings.Regular
import typings.activexExcel.activexExcelStrings.`Bold Italic`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Font extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  var Background: XlBackground = js.native
  
  var Bold: Boolean = js.native
  
  var Color: XlRgbColor | Double = js.native
  
  var ColorIndex: Double | XlColorIndex = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.Font_typekey")
  var ExcelDotFont_typekey: Font = js.native
  
  var FontStyle: Regular | Italic | Bold | (`Bold Italic`) = js.native
  
  var Italic: Boolean = js.native
  
  var Name: String = js.native
  
  var OutlineFont: js.Any = js.native
  
  val Parent: js.Any = js.native
  
  var Shadow: js.Any = js.native
  
  var Size: Double = js.native
  
  var Strikethrough: Boolean = js.native
  
  var Subscript: Boolean = js.native
  
  var Superscript: Boolean = js.native
  
  var ThemeColor: XlThemeColor = js.native
  
  var ThemeFont: XlThemeFont = js.native
  
  var TintAndShade: Double = js.native
  
  var Underline: XlUnderlineStyle = js.native
}
object Font {
  
  @scala.inline
  def apply(
    Application: Application,
    Background: XlBackground,
    Bold: Boolean,
    Color: XlRgbColor | Double,
    ColorIndex: Double | XlColorIndex,
    Creator: XlCreator,
    ExcelDotFont_typekey: Font,
    FontStyle: Regular | Italic | Bold | (`Bold Italic`),
    Italic: Boolean,
    Name: String,
    OutlineFont: js.Any,
    Parent: js.Any,
    Shadow: js.Any,
    Size: Double,
    Strikethrough: Boolean,
    Subscript: Boolean,
    Superscript: Boolean,
    ThemeColor: XlThemeColor,
    ThemeFont: XlThemeFont,
    TintAndShade: Double,
    Underline: XlUnderlineStyle
  ): Font = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FontStyle = FontStyle.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OutlineFont = OutlineFont.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Strikethrough = Strikethrough.asInstanceOf[js.Any], Subscript = Subscript.asInstanceOf[js.Any], Superscript = Superscript.asInstanceOf[js.Any], ThemeColor = ThemeColor.asInstanceOf[js.Any], ThemeFont = ThemeFont.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Font_typekey")(ExcelDotFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  
  @scala.inline
  implicit class FontMutableBuilder[Self <: Font] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackground(value: XlBackground): Self = StObject.set(x, "Background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBold(value: Boolean): Self = StObject.set(x, "Bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: XlRgbColor | Double): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIndex(value: Double | XlColorIndex): Self = StObject.set(x, "ColorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotFont_typekey(value: Font): Self = StObject.set(x, "Excel.Font_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyle(value: Regular | Italic | Bold | (`Bold Italic`)): Self = StObject.set(x, "FontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalic(value: Boolean): Self = StObject.set(x, "Italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineFont(value: js.Any): Self = StObject.set(x, "OutlineFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadow(value: js.Any): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikethrough(value: Boolean): Self = StObject.set(x, "Strikethrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscript(value: Boolean): Self = StObject.set(x, "Subscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperscript(value: Boolean): Self = StObject.set(x, "Superscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeColor(value: XlThemeColor): Self = StObject.set(x, "ThemeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeFont(value: XlThemeFont): Self = StObject.set(x, "ThemeFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintAndShade(value: Double): Self = StObject.set(x, "TintAndShade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderline(value: XlUnderlineStyle): Self = StObject.set(x, "Underline", value.asInstanceOf[js.Any])
  }
}
