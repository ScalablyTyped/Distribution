package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewFont extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  var Bold: Boolean = js.native
  
  val Class: OlObjectClass = js.native
  
  var Color: OlColor = js.native
  
  var ExtendedColor: OlCategoryColor = js.native
  
  var Italic: Boolean = js.native
  
  var Name: String = js.native
  
  @JSName("Outlook.ViewFont_typekey")
  var OutlookDotViewFont_typekey: ViewFont = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
  
  var Size: Double = js.native
  
  var Strikethrough: Boolean = js.native
  
  var Underline: Boolean = js.native
}
object ViewFont {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ViewFontMutableBuilder[Self <: ViewFont] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBold(value: Boolean): Self = StObject.set(x, "Bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: OlColor): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedColor(value: OlCategoryColor): Self = StObject.set(x, "ExtendedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalic(value: Boolean): Self = StObject.set(x, "Italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotViewFont_typekey(value: ViewFont): Self = StObject.set(x, "Outlook.ViewFont_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikethrough(value: Boolean): Self = StObject.set(x, "Strikethrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderline(value: Boolean): Self = StObject.set(x, "Underline", value.asInstanceOf[js.Any])
  }
}
