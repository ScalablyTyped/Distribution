package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackViewModelTrackErrorEvent extends StObject {
  
  var error: Error
}
object TrackViewModelTrackErrorEvent {
  
  @scala.inline
  def apply(error: Error): TrackViewModelTrackErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackViewModelTrackErrorEvent]
  }
  
  @scala.inline
  implicit class TrackViewModelTrackErrorEventMutableBuilder[Self <: TrackViewModelTrackErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
