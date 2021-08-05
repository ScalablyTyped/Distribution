package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait History extends StObject {
  
  var history: js.UndefOr[Boolean] = js.undefined
  
  var markerLayers: js.UndefOr[Boolean] = js.undefined
}
object History {
  
  inline def apply(): History = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[History]
  }
  
  extension [Self <: History](x: Self) {
    
    inline def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setMarkerLayers(value: Boolean): Self = StObject.set(x, "markerLayers", value.asInstanceOf[js.Any])
    
    inline def setMarkerLayersUndefined: Self = StObject.set(x, "markerLayers", js.undefined)
  }
}
