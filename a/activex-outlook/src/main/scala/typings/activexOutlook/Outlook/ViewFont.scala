package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewFont extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  var Bold: Boolean
  
  val Class: OlObjectClass
  
  var Color: OlColor
  
  var ExtendedColor: OlCategoryColor
  
  var Italic: Boolean
  
  var Name: String
  
  /* private */ @JSName("Outlook.ViewFont_typekey")
  var OutlookDotViewFont_typekey: ViewFont
  
  val Parent: js.Any
  
  val Session: NameSpace
  
  var Size: Double
  
  var Strikethrough: Boolean
  
  var Underline: Boolean
}
object ViewFont {
  
  inline def apply(
    Application: Application,
    Bold: Boolean,
    Class: OlObjectClass,
    Color: OlColor,
    ExtendedColor: OlCategoryColor,
    Italic: Boolean,
    Name: String,
    OutlookDotViewFont_typekey: ViewFont,
    Parent: js.Any,
    Session: NameSpace,
    Size: Double,
    Strikethrough: Boolean,
    Underline: Boolean
  ): ViewFont = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ExtendedColor = ExtendedColor.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Strikethrough = Strikethrough.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ViewFont_typekey")(OutlookDotViewFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewFont]
  }
  
  extension [Self <: ViewFont](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "Bold", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setColor(value: OlColor): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setExtendedColor(value: OlCategoryColor): Self = StObject.set(x, "ExtendedColor", value.asInstanceOf[js.Any])
    
    inline def setItalic(value: Boolean): Self = StObject.set(x, "Italic", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotViewFont_typekey(value: ViewFont): Self = StObject.set(x, "Outlook.ViewFont_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setStrikethrough(value: Boolean): Self = StObject.set(x, "Strikethrough", value.asInstanceOf[js.Any])
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "Underline", value.asInstanceOf[js.Any])
  }
}
