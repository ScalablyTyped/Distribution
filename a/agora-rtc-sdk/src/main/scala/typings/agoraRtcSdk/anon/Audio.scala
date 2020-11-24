package typings.agoraRtcSdk.anon

import typings.agoraRtcSdk.agoraRtcSdkStrings.H264
import typings.agoraRtcSdk.agoraRtcSdkStrings.OPUS
import typings.agoraRtcSdk.agoraRtcSdkStrings.VP8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Audio extends js.Object {
  
  var audio: js.Array[OPUS] = js.native
  
  var video: js.Array[VP8 | H264] = js.native
}
object Audio {
  
  @scala.inline
  def apply(audio: js.Array[OPUS], video: js.Array[VP8 | H264]): Audio = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audio]
  }
  
  @scala.inline
  implicit class AudioOps[Self <: Audio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAudioVarargs(value: OPUS*): Self = this.set("audio", js.Array(value :_*))
    
    @scala.inline
    def setAudio(value: js.Array[OPUS]): Self = this.set("audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoVarargs(value: (VP8 | H264)*): Self = this.set("video", js.Array(value :_*))
    
    @scala.inline
    def setVideo(value: js.Array[VP8 | H264]): Self = this.set("video", value.asInstanceOf[js.Any])
  }
}
