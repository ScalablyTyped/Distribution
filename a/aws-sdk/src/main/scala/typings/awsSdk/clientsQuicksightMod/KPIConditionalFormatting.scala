package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KPIConditionalFormatting extends StObject {
  
  /**
    * The conditional formatting options of a KPI visual.
    */
  var ConditionalFormattingOptions: js.UndefOr[KPIConditionalFormattingOptionList] = js.undefined
}
object KPIConditionalFormatting {
  
  inline def apply(): KPIConditionalFormatting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KPIConditionalFormatting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KPIConditionalFormatting] (val x: Self) extends AnyVal {
    
    inline def setConditionalFormattingOptions(value: KPIConditionalFormattingOptionList): Self = StObject.set(x, "ConditionalFormattingOptions", value.asInstanceOf[js.Any])
    
    inline def setConditionalFormattingOptionsUndefined: Self = StObject.set(x, "ConditionalFormattingOptions", js.undefined)
    
    inline def setConditionalFormattingOptionsVarargs(value: KPIConditionalFormattingOption*): Self = StObject.set(x, "ConditionalFormattingOptions", js.Array(value*))
  }
}
