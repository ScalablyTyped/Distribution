package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableRowConditionalFormatting extends StObject {
  
  /**
    * The conditional formatting color (solid, gradient) of the background for a table row.
    */
  var BackgroundColor: js.UndefOr[ConditionalFormattingColor] = js.undefined
  
  /**
    * The conditional formatting color (solid, gradient) of the text for a table row.
    */
  var TextColor: js.UndefOr[ConditionalFormattingColor] = js.undefined
}
object TableRowConditionalFormatting {
  
  inline def apply(): TableRowConditionalFormatting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowConditionalFormatting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableRowConditionalFormatting] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: ConditionalFormattingColor): Self = StObject.set(x, "BackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "BackgroundColor", js.undefined)
    
    inline def setTextColor(value: ConditionalFormattingColor): Self = StObject.set(x, "TextColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "TextColor", js.undefined)
  }
}
