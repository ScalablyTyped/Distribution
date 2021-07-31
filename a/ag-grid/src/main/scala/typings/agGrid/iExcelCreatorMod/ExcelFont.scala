package typings.agGrid.iExcelCreatorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcelFont extends StObject {
  
  var bold: Boolean
  
  var charSet: Double
  
  var color: String
  
  var family: String
  
  var fontName: String
  
  var italic: Boolean
  
  var outline: Boolean
  
  var shadow: Boolean
  
  var size: Double
  
  var strikeThrough: Boolean
  
  var underline: String
  
  var verticalAlign: String
}
object ExcelFont {
  
  @scala.inline
  def apply(
    bold: Boolean,
    charSet: Double,
    color: String,
    family: String,
    fontName: String,
    italic: Boolean,
    outline: Boolean,
    shadow: Boolean,
    size: Double,
    strikeThrough: Boolean,
    underline: String,
    verticalAlign: String
  ): ExcelFont = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], charSet = charSet.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], fontName = fontName.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], shadow = shadow.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strikeThrough = strikeThrough.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any], verticalAlign = verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelFont]
  }
  
  @scala.inline
  implicit class ExcelFontMutableBuilder[Self <: ExcelFont] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharSet(value: Double): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutline(value: Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikeThrough(value: Boolean): Self = StObject.set(x, "strikeThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderline(value: String): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlign(value: String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
  }
}
