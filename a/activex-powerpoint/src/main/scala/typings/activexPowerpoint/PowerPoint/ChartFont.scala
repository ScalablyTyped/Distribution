package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartFont extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var Background: Any
  
  var Bold: Any
  
  var Color: Any
  
  var ColorIndex: Any
  
  val Creator: Double
  
  var FontStyle: Any
  
  var Italic: Any
  
  var Name: Any
  
  var OutlineFont: Any
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.ChartFont_typekey")
  var PowerPointDotChartFont_typekey: ChartFont
  
  var Shadow: Any
  
  var Size: Any
  
  var Strikethrough: Any
  
  var Subscript: Any
  
  var Superscript: Any
  
  var Underline: Any
}
object ChartFont {
  
  inline def apply(
    Application: Application,
    Background: Any,
    Bold: Any,
    Color: Any,
    ColorIndex: Any,
    Creator: Double,
    FontStyle: Any,
    Italic: Any,
    Name: Any,
    OutlineFont: Any,
    Parent: Any,
    PowerPointDotChartFont_typekey: ChartFont,
    Shadow: Any,
    Size: Any,
    Strikethrough: Any,
    Subscript: Any,
    Superscript: Any,
    Underline: Any
  ): ChartFont = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FontStyle = FontStyle.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OutlineFont = OutlineFont.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Strikethrough = Strikethrough.asInstanceOf[js.Any], Subscript = Subscript.asInstanceOf[js.Any], Superscript = Superscript.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ChartFont_typekey")(PowerPointDotChartFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartFont]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartFont] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBackground(value: Any): Self = StObject.set(x, "Background", value.asInstanceOf[js.Any])
    
    inline def setBold(value: Any): Self = StObject.set(x, "Bold", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Any): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorIndex(value: Any): Self = StObject.set(x, "ColorIndex", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFontStyle(value: Any): Self = StObject.set(x, "FontStyle", value.asInstanceOf[js.Any])
    
    inline def setItalic(value: Any): Self = StObject.set(x, "Italic", value.asInstanceOf[js.Any])
    
    inline def setName(value: Any): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutlineFont(value: Any): Self = StObject.set(x, "OutlineFont", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotChartFont_typekey(value: ChartFont): Self = StObject.set(x, "PowerPoint.ChartFont_typekey", value.asInstanceOf[js.Any])
    
    inline def setShadow(value: Any): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Any): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setStrikethrough(value: Any): Self = StObject.set(x, "Strikethrough", value.asInstanceOf[js.Any])
    
    inline def setSubscript(value: Any): Self = StObject.set(x, "Subscript", value.asInstanceOf[js.Any])
    
    inline def setSuperscript(value: Any): Self = StObject.set(x, "Superscript", value.asInstanceOf[js.Any])
    
    inline def setUnderline(value: Any): Self = StObject.set(x, "Underline", value.asInstanceOf[js.Any])
  }
}
