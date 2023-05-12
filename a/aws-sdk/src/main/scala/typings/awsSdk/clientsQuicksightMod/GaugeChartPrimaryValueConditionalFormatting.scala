package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GaugeChartPrimaryValueConditionalFormatting extends StObject {
  
  /**
    * The conditional formatting of the primary value icon.
    */
  var Icon: js.UndefOr[ConditionalFormattingIcon] = js.undefined
  
  /**
    * The conditional formatting of the primary value text color.
    */
  var TextColor: js.UndefOr[ConditionalFormattingColor] = js.undefined
}
object GaugeChartPrimaryValueConditionalFormatting {
  
  inline def apply(): GaugeChartPrimaryValueConditionalFormatting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GaugeChartPrimaryValueConditionalFormatting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GaugeChartPrimaryValueConditionalFormatting] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: ConditionalFormattingIcon): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
    
    inline def setTextColor(value: ConditionalFormattingColor): Self = StObject.set(x, "TextColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "TextColor", js.undefined)
  }
}
