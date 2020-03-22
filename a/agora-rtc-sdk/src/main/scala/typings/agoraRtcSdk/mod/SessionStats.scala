package typings.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Statistics of the session connection.
  *
  * If {@link getSessionStats} is called successfully, this interface provides the statistics.
  */
trait SessionStats extends js.Object {
  /** Call duration in seconds, represented by an aggregate value. */
  val Duration: js.UndefOr[String] = js.undefined
  /** Total received bitrate of the stream, in Kbps, represented by an instantaneous value. */
  val RecvBitrate: js.UndefOr[String] = js.undefined
  /** Total number of bytes received, represented by an aggregate value. */
  val RecvBytes: js.UndefOr[String] = js.undefined
  /** Total sent bitrate of the stream, in Kbps, represented by an instantaneous value. */
  val SendBitrate: js.UndefOr[String] = js.undefined
  /** Total number of bytes sent, represented by an aggregate value. */
  val SendBytes: js.UndefOr[String] = js.undefined
  /**
    * Number of users in the channel.
    *
    * - rtc mode: The number of all users in the channel.
    * - live mode
    *  - If the local user is an audience: The number of hosts in the channel + 1.
    *  - If the user is a host: The number of hosts in the channel.
    */
  val UserCount: js.UndefOr[String] = js.undefined
}

object SessionStats {
  @scala.inline
  def apply(
    Duration: String = null,
    RecvBitrate: String = null,
    RecvBytes: String = null,
    SendBitrate: String = null,
    SendBytes: String = null,
    UserCount: String = null
  ): SessionStats = {
    val __obj = js.Dynamic.literal()
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (RecvBitrate != null) __obj.updateDynamic("RecvBitrate")(RecvBitrate.asInstanceOf[js.Any])
    if (RecvBytes != null) __obj.updateDynamic("RecvBytes")(RecvBytes.asInstanceOf[js.Any])
    if (SendBitrate != null) __obj.updateDynamic("SendBitrate")(SendBitrate.asInstanceOf[js.Any])
    if (SendBytes != null) __obj.updateDynamic("SendBytes")(SendBytes.asInstanceOf[js.Any])
    if (UserCount != null) __obj.updateDynamic("UserCount")(UserCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionStats]
  }
}

