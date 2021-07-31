package typings.agoraRtcSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Video extends StObject {
  
  /**
    * Marks whether to receive the audio data.
    *  - `true`: (Default) Receives the audio data.
    *  - `false`: Not receives the audio data.
    */
  var audio: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Marks whether to receive the video data.
    *  - `true`: (Default) Receives the video data.
    *  - `false`: Not receives the video data.
    */
  var video: js.UndefOr[Boolean] = js.undefined
}
object Video {
  
  @scala.inline
  def apply(): Video = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Video]
  }
  
  @scala.inline
  implicit class VideoMutableBuilder[Self <: Video] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    @scala.inline
    def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
