package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasemapToggleToggleEvent extends StObject {
  
  var current: Basemap
  
  var previous: Basemap
}
object BasemapToggleToggleEvent {
  
  inline def apply(current: Basemap, previous: Basemap): BasemapToggleToggleEvent = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasemapToggleToggleEvent]
  }
  
  extension [Self <: BasemapToggleToggleEvent](x: Self) {
    
    inline def setCurrent(value: Basemap): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setPrevious(value: Basemap): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
  }
}
