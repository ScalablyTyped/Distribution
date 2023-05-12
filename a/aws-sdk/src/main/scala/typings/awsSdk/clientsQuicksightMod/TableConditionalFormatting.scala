package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableConditionalFormatting extends StObject {
  
  /**
    * Conditional formatting options for a PivotTableVisual.
    */
  var ConditionalFormattingOptions: js.UndefOr[TableConditionalFormattingOptionList] = js.undefined
}
object TableConditionalFormatting {
  
  inline def apply(): TableConditionalFormatting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableConditionalFormatting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableConditionalFormatting] (val x: Self) extends AnyVal {
    
    inline def setConditionalFormattingOptions(value: TableConditionalFormattingOptionList): Self = StObject.set(x, "ConditionalFormattingOptions", value.asInstanceOf[js.Any])
    
    inline def setConditionalFormattingOptionsUndefined: Self = StObject.set(x, "ConditionalFormattingOptions", js.undefined)
    
    inline def setConditionalFormattingOptionsVarargs(value: TableConditionalFormattingOption*): Self = StObject.set(x, "ConditionalFormattingOptions", js.Array(value*))
  }
}
