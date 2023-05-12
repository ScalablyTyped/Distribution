package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GaugeChartConditionalFormattingOption extends StObject {
  
  /**
    * The options that determine the presentation of the arc of a GaugeChartVisual.
    */
  var Arc: js.UndefOr[GaugeChartArcConditionalFormatting] = js.undefined
  
  /**
    * The conditional formatting for the primary value of a GaugeChartVisual.
    */
  var PrimaryValue: js.UndefOr[GaugeChartPrimaryValueConditionalFormatting] = js.undefined
}
object GaugeChartConditionalFormattingOption {
  
  inline def apply(): GaugeChartConditionalFormattingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GaugeChartConditionalFormattingOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GaugeChartConditionalFormattingOption] (val x: Self) extends AnyVal {
    
    inline def setArc(value: GaugeChartArcConditionalFormatting): Self = StObject.set(x, "Arc", value.asInstanceOf[js.Any])
    
    inline def setArcUndefined: Self = StObject.set(x, "Arc", js.undefined)
    
    inline def setPrimaryValue(value: GaugeChartPrimaryValueConditionalFormatting): Self = StObject.set(x, "PrimaryValue", value.asInstanceOf[js.Any])
    
    inline def setPrimaryValueUndefined: Self = StObject.set(x, "PrimaryValue", js.undefined)
  }
}
