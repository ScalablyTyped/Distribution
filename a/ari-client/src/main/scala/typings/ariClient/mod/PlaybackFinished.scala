package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackFinished
  extends StObject
     with Event {
  
  /**
    * Playback control object.
    */
  var playback: Playback
}
object PlaybackFinished {
  
  inline def apply(application: String, playback: Playback, timestamp: Date, `type`: String): PlaybackFinished = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], playback = playback.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackFinished]
  }
  
  extension [Self <: PlaybackFinished](x: Self) {
    
    inline def setPlayback(value: Playback): Self = StObject.set(x, "playback", value.asInstanceOf[js.Any])
  }
}
