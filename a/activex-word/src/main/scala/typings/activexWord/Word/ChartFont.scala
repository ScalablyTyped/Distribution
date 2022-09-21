package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartFont extends StObject {
  
  val Application: Any
  
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
  
  var Shadow: Any
  
  var Size: Any
  
  var StrikeThrough: Any
  
  var Subscript: Any
  
  var Superscript: Any
  
  var Underline: Any
  
  /* private */ @JSName("Word.ChartFont_typekey")
  var WordDotChartFont_typekey: ChartFont
}
object ChartFont {
  
  inline def apply(
    Application: Any,
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
    Shadow: Any,
    Size: Any,
    StrikeThrough: Any,
    Subscript: Any,
    Superscript: Any,
    Underline: Any,
    WordDotChartFont_typekey: ChartFont
  ): ChartFont = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FontStyle = FontStyle.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OutlineFont = OutlineFont.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], StrikeThrough = StrikeThrough.asInstanceOf[js.Any], Subscript = Subscript.asInstanceOf[js.Any], Superscript = Superscript.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ChartFont_typekey")(WordDotChartFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartFont]
  }
  
  extension [Self <: ChartFont](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
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
    
    inline def setShadow(value: Any): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Any): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setStrikeThrough(value: Any): Self = StObject.set(x, "StrikeThrough", value.asInstanceOf[js.Any])
    
    inline def setSubscript(value: Any): Self = StObject.set(x, "Subscript", value.asInstanceOf[js.Any])
    
    inline def setSuperscript(value: Any): Self = StObject.set(x, "Superscript", value.asInstanceOf[js.Any])
    
    inline def setUnderline(value: Any): Self = StObject.set(x, "Underline", value.asInstanceOf[js.Any])
    
    inline def setWordDotChartFont_typekey(value: ChartFont): Self = StObject.set(x, "Word.ChartFont_typekey", value.asInstanceOf[js.Any])
  }
}
