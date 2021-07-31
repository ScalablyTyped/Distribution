package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackTrackEvent extends StObject {
  
  var position: js.Any
}
object TrackTrackEvent {
  
  @scala.inline
  def apply(position: js.Any): TrackTrackEvent = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackTrackEvent]
  }
  
  @scala.inline
  implicit class TrackTrackEventMutableBuilder[Self <: TrackTrackEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
