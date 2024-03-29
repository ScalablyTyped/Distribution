package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackTrackErrorEvent extends StObject {
  
  var error: Error
}
object TrackTrackErrorEvent {
  
  inline def apply(error: Error): TrackTrackErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackTrackErrorEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrackTrackErrorEvent] (val x: Self) extends AnyVal {
    
    inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
