package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackTrackErrorEvent extends js.Object {
  var error: Error
}

object TrackTrackErrorEvent {
  @scala.inline
  def apply(error: Error): TrackTrackErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TrackTrackErrorEvent]
  }
}

