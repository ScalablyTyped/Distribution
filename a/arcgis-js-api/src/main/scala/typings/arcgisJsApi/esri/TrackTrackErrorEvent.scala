package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackTrackErrorEvent extends StObject {
  
  var error: Error = js.native
}
object TrackTrackErrorEvent {
  
  @scala.inline
  def apply(error: Error): TrackTrackErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackTrackErrorEvent]
  }
  
  @scala.inline
  implicit class TrackTrackErrorEventMutableBuilder[Self <: TrackTrackErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
