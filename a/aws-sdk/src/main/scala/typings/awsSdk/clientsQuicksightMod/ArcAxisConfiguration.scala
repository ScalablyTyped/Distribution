package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcAxisConfiguration extends StObject {
  
  /**
    * The arc axis range of a GaugeChartVisual.
    */
  var Range: js.UndefOr[ArcAxisDisplayRange] = js.undefined
  
  /**
    * The reserved range of the arc axis.
    */
  var ReserveRange: js.UndefOr[Integer] = js.undefined
}
object ArcAxisConfiguration {
  
  inline def apply(): ArcAxisConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcAxisConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArcAxisConfiguration] (val x: Self) extends AnyVal {
    
    inline def setRange(value: ArcAxisDisplayRange): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "Range", js.undefined)
    
    inline def setReserveRange(value: Integer): Self = StObject.set(x, "ReserveRange", value.asInstanceOf[js.Any])
    
    inline def setReserveRangeUndefined: Self = StObject.set(x, "ReserveRange", js.undefined)
  }
}
