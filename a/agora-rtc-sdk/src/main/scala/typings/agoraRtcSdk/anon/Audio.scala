package typings.agoraRtcSdk.anon

import typings.agoraRtcSdk.agoraRtcSdkStrings.H264
import typings.agoraRtcSdk.agoraRtcSdkStrings.OPUS
import typings.agoraRtcSdk.agoraRtcSdkStrings.VP8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Audio extends StObject {
  
  var audio: js.Array[OPUS]
  
  var video: js.Array[VP8 | H264]
}
object Audio {
  
  inline def apply(audio: js.Array[OPUS], video: js.Array[VP8 | H264]): Audio = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audio]
  }
  
  extension [Self <: Audio](x: Self) {
    
    inline def setAudio(value: js.Array[OPUS]): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioVarargs(value: OPUS*): Self = StObject.set(x, "audio", js.Array(value :_*))
    
    inline def setVideo(value: js.Array[VP8 | H264]): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoVarargs(value: (VP8 | H264)*): Self = StObject.set(x, "video", js.Array(value :_*))
  }
}
