package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaybackFinished extends Event {
  
  /**
    * Playback control object.
    */
  var playback: Playback = js.native
}
object PlaybackFinished {
  
  @scala.inline
  def apply(application: String, playback: Playback, timestamp: Date, `type`: String): PlaybackFinished = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], playback = playback.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackFinished]
  }
  
  @scala.inline
  implicit class PlaybackFinishedMutableBuilder[Self <: PlaybackFinished] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlayback(value: Playback): Self = StObject.set(x, "playback", value.asInstanceOf[js.Any])
  }
}
