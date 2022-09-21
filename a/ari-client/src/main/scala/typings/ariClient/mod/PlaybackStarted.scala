package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackStarted
  extends StObject
     with Event {
  
  /**
    * Playback control object.
    */
  var playback: Playback
}
object PlaybackStarted {
  
  inline def apply(application: String, playback: Playback, timestamp: js.Date, `type`: String): PlaybackStarted = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], playback = playback.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackStarted]
  }
  
  extension [Self <: PlaybackStarted](x: Self) {
    
    inline def setPlayback(value: Playback): Self = StObject.set(x, "playback", value.asInstanceOf[js.Any])
  }
}
