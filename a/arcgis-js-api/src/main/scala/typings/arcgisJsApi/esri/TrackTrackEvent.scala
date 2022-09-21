package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackTrackEvent extends StObject {
  
  var position: Any
}
object TrackTrackEvent {
  
  inline def apply(position: Any): TrackTrackEvent = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackTrackEvent]
  }
  
  extension [Self <: TrackTrackEvent](x: Self) {
    
    inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
