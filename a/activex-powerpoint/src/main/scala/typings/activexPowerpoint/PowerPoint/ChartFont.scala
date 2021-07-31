package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartFont extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var Background: js.Any
  
  var Bold: js.Any
  
  var Color: js.Any
  
  var ColorIndex: js.Any
  
  val Creator: Double
  
  var FontStyle: js.Any
  
  var Italic: js.Any
  
  var Name: js.Any
  
  var OutlineFont: js.Any
  
  val Parent: js.Any
  
  @JSName("PowerPoint.ChartFont_typekey")
  var PowerPointDotChartFont_typekey: ChartFont
  
  var Shadow: js.Any
  
  var Size: js.Any
  
  var Strikethrough: js.Any
  
  var Subscript: js.Any
  
  var Superscript: js.Any
  
  var Underline: js.Any
}
object ChartFont {
  
  @scala.inline
  def apply(
    Application: Application,
    Background: js.Any,
    Bold: js.Any,
    Color: js.Any,
    ColorIndex: js.Any,
    Creator: Double,
    FontStyle: js.Any,
    Italic: js.Any,
    Name: js.Any,
    OutlineFont: js.Any,
    Parent: js.Any,
    PowerPointDotChartFont_typekey: ChartFont,
    Shadow: js.Any,
    Size: js.Any,
    Strikethrough: js.Any,
    Subscript: js.Any,
    Superscript: js.Any,
    Underline: js.Any
  ): ChartFont = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FontStyle = FontStyle.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OutlineFont = OutlineFont.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Strikethrough = Strikethrough.asInstanceOf[js.Any], Subscript = Subscript.asInstanceOf[js.Any], Superscript = Superscript.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ChartFont_typekey")(PowerPointDotChartFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartFont]
  }
  
  @scala.inline
  implicit class ChartFontMutableBuilder[Self <: ChartFont] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackground(value: js.Any): Self = StObject.set(x, "Background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBold(value: js.Any): Self = StObject.set(x, "Bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: js.Any): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIndex(value: js.Any): Self = StObject.set(x, "ColorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyle(value: js.Any): Self = StObject.set(x, "FontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalic(value: js.Any): Self = StObject.set(x, "Italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: js.Any): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineFont(value: js.Any): Self = StObject.set(x, "OutlineFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotChartFont_typekey(value: ChartFont): Self = StObject.set(x, "PowerPoint.ChartFont_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadow(value: js.Any): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: js.Any): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikethrough(value: js.Any): Self = StObject.set(x, "Strikethrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscript(value: js.Any): Self = StObject.set(x, "Subscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperscript(value: js.Any): Self = StObject.set(x, "Superscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderline(value: js.Any): Self = StObject.set(x, "Underline", value.asInstanceOf[js.Any])
  }
}
