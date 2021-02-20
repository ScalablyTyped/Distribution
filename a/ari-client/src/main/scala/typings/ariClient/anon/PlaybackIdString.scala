package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaybackIdString extends StObject {
  
  var playbackId: String = js.native
}
object PlaybackIdString {
  
  @scala.inline
  def apply(playbackId: String): PlaybackIdString = {
    val __obj = js.Dynamic.literal(playbackId = playbackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackIdString]
  }
  
  @scala.inline
  implicit class PlaybackIdStringMutableBuilder[Self <: PlaybackIdString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaybackId(value: String): Self = StObject.set(x, "playbackId", value.asInstanceOf[js.Any])
  }
}
