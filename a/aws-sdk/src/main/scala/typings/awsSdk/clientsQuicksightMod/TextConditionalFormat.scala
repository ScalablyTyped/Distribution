package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextConditionalFormat extends StObject {
  
  /**
    * The conditional formatting for the text background color.
    */
  var BackgroundColor: js.UndefOr[ConditionalFormattingColor] = js.undefined
  
  /**
    * The conditional formatting for the icon.
    */
  var Icon: js.UndefOr[ConditionalFormattingIcon] = js.undefined
  
  /**
    * The conditional formatting for the text color.
    */
  var TextColor: js.UndefOr[ConditionalFormattingColor] = js.undefined
}
object TextConditionalFormat {
  
  inline def apply(): TextConditionalFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextConditionalFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextConditionalFormat] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: ConditionalFormattingColor): Self = StObject.set(x, "BackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "BackgroundColor", js.undefined)
    
    inline def setIcon(value: ConditionalFormattingIcon): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
    
    inline def setTextColor(value: ConditionalFormattingColor): Self = StObject.set(x, "TextColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "TextColor", js.undefined)
  }
}
