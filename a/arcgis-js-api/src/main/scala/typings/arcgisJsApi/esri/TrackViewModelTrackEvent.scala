package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackViewModelTrackEvent extends StObject {
  
  var position: js.Any
}
object TrackViewModelTrackEvent {
  
  @scala.inline
  def apply(position: js.Any): TrackViewModelTrackEvent = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackViewModelTrackEvent]
  }
  
  @scala.inline
  implicit class TrackViewModelTrackEventMutableBuilder[Self <: TrackViewModelTrackEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
