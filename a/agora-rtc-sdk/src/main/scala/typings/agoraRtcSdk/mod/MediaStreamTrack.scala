package typings.agoraRtcSdk.mod

import typings.agoraRtcSdk.agoraRtcSdkStrings.audio
import typings.agoraRtcSdk.agoraRtcSdkStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Media Stream Track
  *
  * This interface represents a single media track within a stream, for example an audio track or a video track.
  *
  * See [MediaStreamTrack](https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrack) for details.
  *
  */
trait MediaStreamTrack extends StObject {
  
  var kind: audio | video
}
object MediaStreamTrack {
  
  @scala.inline
  def apply(kind: audio | video): MediaStreamTrack = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamTrack]
  }
  
  @scala.inline
  implicit class MediaStreamTrackMutableBuilder[Self <: MediaStreamTrack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: audio | video): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
