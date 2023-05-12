package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GaugeChartArcConditionalFormatting extends StObject {
  
  /**
    * The conditional formatting of the arc foreground color.
    */
  var ForegroundColor: js.UndefOr[ConditionalFormattingColor] = js.undefined
}
object GaugeChartArcConditionalFormatting {
  
  inline def apply(): GaugeChartArcConditionalFormatting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GaugeChartArcConditionalFormatting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GaugeChartArcConditionalFormatting] (val x: Self) extends AnyVal {
    
    inline def setForegroundColor(value: ConditionalFormattingColor): Self = StObject.set(x, "ForegroundColor", value.asInstanceOf[js.Any])
    
    inline def setForegroundColorUndefined: Self = StObject.set(x, "ForegroundColor", js.undefined)
  }
}
