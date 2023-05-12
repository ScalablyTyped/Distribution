package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaterfallChartOptions extends StObject {
  
  /**
    * This option determines the total bar label of a waterfall visual.
    */
  var TotalBarLabel: js.UndefOr[String] = js.undefined
}
object WaterfallChartOptions {
  
  inline def apply(): WaterfallChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterfallChartOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WaterfallChartOptions] (val x: Self) extends AnyVal {
    
    inline def setTotalBarLabel(value: String): Self = StObject.set(x, "TotalBarLabel", value.asInstanceOf[js.Any])
    
    inline def setTotalBarLabelUndefined: Self = StObject.set(x, "TotalBarLabel", js.undefined)
  }
}
