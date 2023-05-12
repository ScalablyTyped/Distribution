package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KPIPrimaryValueConditionalFormatting extends StObject {
  
  /**
    * The conditional formatting of the primary value's icon.
    */
  var Icon: js.UndefOr[ConditionalFormattingIcon] = js.undefined
  
  /**
    * The conditional formatting of the primary value's text color.
    */
  var TextColor: js.UndefOr[ConditionalFormattingColor] = js.undefined
}
object KPIPrimaryValueConditionalFormatting {
  
  inline def apply(): KPIPrimaryValueConditionalFormatting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KPIPrimaryValueConditionalFormatting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KPIPrimaryValueConditionalFormatting] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: ConditionalFormattingIcon): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
    
    inline def setTextColor(value: ConditionalFormattingColor): Self = StObject.set(x, "TextColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "TextColor", js.undefined)
  }
}
