package typings.agoraRtcSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  /**
    * The error code.
    *
    * - 0: No error.
    * - 1: An error occurs in the server response.
    * - 2: No server response.
    * - 3: The SDK fails to access the service, probably due to limited resources of the server.
    * - 4: Fails to send the relay request.
    * - 5: Fails to accept the relay request.
    * - 6: The server fails to receive the media stream.
    * - 7: The server fails to send the media stream.
    * - 8: The SDK disconnects from the server and fails to reconnect to the server due to a poor network connection. In this case, the SDK resets the relay state. You can try {@link startChannelMediaRelay} to restart the media stream relay.
    * - 9: An internal error occurs in the server.
    * - 10: The token of the source channel has expired.
    * - 11: The token of the destination channel has expired.
    * - 12: The relay has already started. Possibly caused by calling {@link startChannelMediaRelay} repeatedly, or calling {@link startChannelMediaRelay} before {@link stopChannelMediaRelay} succeeds.
    * - 13: The relay has not started. Possibly caused by calling {@link updateChannelMediaRelay} before {@link startChannelMediaRelay} succeeds.
    */
  var code: Double = js.native
  /**
    * The state code.
    *
    * - 0: The SDK is initializing.
    * - 1: The SDK tries to relay the media stream to the destination channel.
    * - 2: The SDK successfully relays the media stream to the destination channel.
    * - 3: An error occurs. See `code` for the error code. In case of an error, the SDK resets the media stream relay state, and you need to call {@link startChannelMediaRelay} to restart the relay.
    */
  var state: Double = js.native
}

object State {
  @scala.inline
  def apply(code: Double, state: Double): State = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: Double): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

