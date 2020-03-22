package typings.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Error information of the media stream relay.
  *
  * When errors occur in calling {@link startChannelMediaRelay}, {@link updateChannelMediaRelay}, or {@link stopChannelMediaRelay}, the callback functions of these methods provide error details in this class.
  *
  * In this class, `code` is the error code and `message` is the error message. See the following table for details.
  *
  * | `code`   | `message`                       | Description                                                  |
  * | -------- | ------------------------------- | ------------------------------------------------------------ |
  * | 0        | RELAY_OK                        | No error.                                                    |
  * | 1        | SERVER_ERROR_RESPONSE           | An error occurs in the server response.                      |
  * | 2        | SERVER_NO_RESPONSE              | No server response.                                          |
  * | 3        | NO_RESOURCE_AVAILABLE           | The SDK fails to access the service, probably due to limited resources of the server.             |
  * | 4        | FAILED_JOIN_SRC                 | Fails to send the relay request.                 |
  * | 5        | FAILED_JOIN_DEST                | Fails to accept the relay request.              |
  * | 6        | FAILED_PACKET_RECEIVED_FROM_SRC | The server fails to receive the media stream.  |
  * | 7        | FAILED_PACKET_SENT_TO_DEST      | The server fails to send the media stream.              |
  * | 8        | SERVER_CONNECTION_LOST          | The SDK disconnects from the server and fails to reconnect to the server due to a poor network connection. In this case, the SDK resets the media stream relay state. You can try {@link startChannelMediaRelay} to restart the media stream relay. |
  * | 9        | INTERNAL_ERROR                  | An internal error occurs in the server.                              |
  * | 10       | SRC_TOKEN_EXPIRED               | The token of the source channel has expired.                         |
  * | 11       | DEST_TOKEN_EXPIRED              | The token of the destination channel has expired.               |
  * | 12       | RELAY_ALREADY_START             | The relay has already started. Possibly caused by calling {@link startChannelMediaRelay} repeatedly, or calling {@link startChannelMediaRelay} before {@link stopChannelMediaRelay} succeeds. |
  * | 13       | RELAY_NOT_START                 | The relay has not started. Possibly caused by calling {@link updateChannelMediaRelay} before {@link startChannelMediaRelay} succeeds. |
  */
@JSImport("agora-rtc-sdk", "ChannelMediaError")
@js.native
class ChannelMediaError () extends js.Object {
  /**
    * The error code.
    */
  var code: Double = js.native
  /**
    * Additional information.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * The error message.
    */
  var message: String = js.native
}

