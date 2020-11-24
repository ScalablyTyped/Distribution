package typings.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Error messages of stream playback
  *
  * When [[Stream.play]] fails to play the stream, this interface provides detailed error messages.
  *
  * In most cases, you can prompt the user to resume the playback ([[Stream.resume]]) by a user gesture except when the {@link status} is "aborted".
  */
@js.native
trait StreamPlayError extends js.Object {
  
  /**
    * The reason why the playback fails. Usually, this value is an event that triggers the playback failure. Possible values include the following:
    * - "stalled": The failure might be caused by the browser policy. See [stalled event](https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/stalled_event).
    * - "pause": The stream playback might be paused by the user. See [pause event](https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/pause_event).
    * - "suspend": The failure might be caused by the browser policy. See [suspend event](https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/suspend_event).
    * - "canplay": Some browsers automatically stop the playback when the playback window is not displayed on the screen. See [canplay event](https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/canplay_event).
    * - "error": The playback failure is usually caused by autoplay restriction.
    *
    * Due to the differences in browsers, `reason` may have different values for the same event.
    */
  val reason: String = js.native
  
  /**
    * The status of the player:
    * - "aborted": The player is removed before the stream is played successfully.
    * - "paused": The player is stopped.
    */
  val status: String = js.native
}
object StreamPlayError {
  
  @scala.inline
  def apply(reason: String, status: String): StreamPlayError = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamPlayError]
  }
  
  @scala.inline
  implicit class StreamPlayErrorOps[Self <: StreamPlayError] (val x: Self) extends AnyVal {
    
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
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
