package typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Statistics of the session connection. */
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
    if (Duration != null) __obj.updateDynamic("Duration")(Duration)
    if (RecvBitrate != null) __obj.updateDynamic("RecvBitrate")(RecvBitrate)
    if (RecvBytes != null) __obj.updateDynamic("RecvBytes")(RecvBytes)
    if (SendBitrate != null) __obj.updateDynamic("SendBitrate")(SendBitrate)
    if (SendBytes != null) __obj.updateDynamic("SendBytes")(SendBytes)
    if (UserCount != null) __obj.updateDynamic("UserCount")(UserCount)
    __obj.asInstanceOf[SessionStats]
  }
}

