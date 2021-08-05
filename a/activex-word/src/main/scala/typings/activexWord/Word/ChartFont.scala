package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartFont extends StObject {
  
  val Application: js.Any
  
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
  
  var Shadow: js.Any
  
  var Size: js.Any
  
  var StrikeThrough: js.Any
  
  var Subscript: js.Any
  
  var Superscript: js.Any
  
  var Underline: js.Any
  
  /* private */ @JSName("Word.ChartFont_typekey")
  var WordDotChartFont_typekey: ChartFont
}
object ChartFont {
  
  inline def apply(
    Application: js.Any,
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
    Shadow: js.Any,
    Size: js.Any,
    StrikeThrough: js.Any,
    Subscript: js.Any,
    Superscript: js.Any,
    Underline: js.Any,
    WordDotChartFont_typekey: ChartFont
  ): ChartFont = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FontStyle = FontStyle.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OutlineFont = OutlineFont.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], StrikeThrough = StrikeThrough.asInstanceOf[js.Any], Subscript = Subscript.asInstanceOf[js.Any], Superscript = Superscript.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ChartFont_typekey")(WordDotChartFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartFont]
  }
  
  extension [Self <: ChartFont](x: Self) {
    
    inline def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBackground(value: js.Any): Self = StObject.set(x, "Background", value.asInstanceOf[js.Any])
    
    inline def setBold(value: js.Any): Self = StObject.set(x, "Bold", value.asInstanceOf[js.Any])
    
    inline def setColor(value: js.Any): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorIndex(value: js.Any): Self = StObject.set(x, "ColorIndex", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFontStyle(value: js.Any): Self = StObject.set(x, "FontStyle", value.asInstanceOf[js.Any])
    
    inline def setItalic(value: js.Any): Self = StObject.set(x, "Italic", value.asInstanceOf[js.Any])
    
    inline def setName(value: js.Any): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutlineFont(value: js.Any): Self = StObject.set(x, "OutlineFont", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setShadow(value: js.Any): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
    
    inline def setSize(value: js.Any): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setStrikeThrough(value: js.Any): Self = StObject.set(x, "StrikeThrough", value.asInstanceOf[js.Any])
    
    inline def setSubscript(value: js.Any): Self = StObject.set(x, "Subscript", value.asInstanceOf[js.Any])
    
    inline def setSuperscript(value: js.Any): Self = StObject.set(x, "Superscript", value.asInstanceOf[js.Any])
    
    inline def setUnderline(value: js.Any): Self = StObject.set(x, "Underline", value.asInstanceOf[js.Any])
    
    inline def setWordDotChartFont_typekey(value: ChartFont): Self = StObject.set(x, "Word.ChartFont_typekey", value.asInstanceOf[js.Any])
  }
}
