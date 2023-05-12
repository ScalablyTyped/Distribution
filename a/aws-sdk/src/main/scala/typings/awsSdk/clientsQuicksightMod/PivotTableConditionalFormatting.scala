package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTableConditionalFormatting extends StObject {
  
  /**
    * Conditional formatting options for a PivotTableVisual.
    */
  var ConditionalFormattingOptions: js.UndefOr[PivotTableConditionalFormattingOptionList] = js.undefined
}
object PivotTableConditionalFormatting {
  
  inline def apply(): PivotTableConditionalFormatting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableConditionalFormatting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotTableConditionalFormatting] (val x: Self) extends AnyVal {
    
    inline def setConditionalFormattingOptions(value: PivotTableConditionalFormattingOptionList): Self = StObject.set(x, "ConditionalFormattingOptions", value.asInstanceOf[js.Any])
    
    inline def setConditionalFormattingOptionsUndefined: Self = StObject.set(x, "ConditionalFormattingOptions", js.undefined)
    
    inline def setConditionalFormattingOptionsVarargs(value: PivotTableConditionalFormattingOption*): Self = StObject.set(x, "ConditionalFormattingOptions", js.Array(value*))
  }
}
