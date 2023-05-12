package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GaugeChartConditionalFormatting extends StObject {
  
  /**
    * Conditional formatting options of a GaugeChartVisual.
    */
  var ConditionalFormattingOptions: js.UndefOr[GaugeChartConditionalFormattingOptionList] = js.undefined
}
object GaugeChartConditionalFormatting {
  
  inline def apply(): GaugeChartConditionalFormatting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GaugeChartConditionalFormatting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GaugeChartConditionalFormatting] (val x: Self) extends AnyVal {
    
    inline def setConditionalFormattingOptions(value: GaugeChartConditionalFormattingOptionList): Self = StObject.set(x, "ConditionalFormattingOptions", value.asInstanceOf[js.Any])
    
    inline def setConditionalFormattingOptionsUndefined: Self = StObject.set(x, "ConditionalFormattingOptions", js.undefined)
    
    inline def setConditionalFormattingOptionsVarargs(value: GaugeChartConditionalFormattingOption*): Self = StObject.set(x, "ConditionalFormattingOptions", js.Array(value*))
  }
}
