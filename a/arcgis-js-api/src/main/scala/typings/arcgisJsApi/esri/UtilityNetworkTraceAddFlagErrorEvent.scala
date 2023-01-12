package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`starting-point`
import typings.arcgisJsApi.arcgisJsApiStrings.barrier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtilityNetworkTraceAddFlagErrorEvent extends StObject {
  
  var symbol: SimpleMarkerSymbol | PictureMarkerSymbol
  
  var `type`: `starting-point` | barrier
}
object UtilityNetworkTraceAddFlagErrorEvent {
  
  inline def apply(symbol: SimpleMarkerSymbol | PictureMarkerSymbol, `type`: `starting-point` | barrier): UtilityNetworkTraceAddFlagErrorEvent = {
    val __obj = js.Dynamic.literal(symbol = symbol.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtilityNetworkTraceAddFlagErrorEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UtilityNetworkTraceAddFlagErrorEvent] (val x: Self) extends AnyVal {
    
    inline def setSymbol(value: SimpleMarkerSymbol | PictureMarkerSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setType(value: `starting-point` | barrier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
