package typings.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Statistics of the session connection.
  *
  * If {@link getSessionStats} is called successfully, this interface provides the statistics.
  */
@js.native
trait SessionStats extends js.Object {
  
  /** Call duration in seconds, represented by an aggregate value. */
  val Duration: js.UndefOr[String] = js.native
  
  /** Total received bitrate of the stream, in Kbps, represented by an instantaneous value. */
  val RecvBitrate: js.UndefOr[String] = js.native
  
  /** Total number of bytes received, represented by an aggregate value. */
  val RecvBytes: js.UndefOr[String] = js.native
  
  /** Total sent bitrate of the stream, in Kbps, represented by an instantaneous value. */
  val SendBitrate: js.UndefOr[String] = js.native
  
  /** Total number of bytes sent, represented by an aggregate value. */
  val SendBytes: js.UndefOr[String] = js.native
  
  /**
    * Number of users in the channel.
    *
    * - rtc mode: The number of all users in the channel.
    * - live mode
    *  - If the local user is an audience: The number of hosts in the channel + 1.
    *  - If the user is a host: The number of hosts in the channel.
    */
  val UserCount: js.UndefOr[String] = js.native
}
object SessionStats {
  
  @scala.inline
  def apply(): SessionStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionStats]
  }
  
  @scala.inline
  implicit class SessionStatsOps[Self <: SessionStats] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: String): Self = this.set("Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("Duration", js.undefined)
    
    @scala.inline
    def setRecvBitrate(value: String): Self = this.set("RecvBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecvBitrate: Self = this.set("RecvBitrate", js.undefined)
    
    @scala.inline
    def setRecvBytes(value: String): Self = this.set("RecvBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecvBytes: Self = this.set("RecvBytes", js.undefined)
    
    @scala.inline
    def setSendBitrate(value: String): Self = this.set("SendBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendBitrate: Self = this.set("SendBitrate", js.undefined)
    
    @scala.inline
    def setSendBytes(value: String): Self = this.set("SendBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendBytes: Self = this.set("SendBytes", js.undefined)
    
    @scala.inline
    def setUserCount(value: String): Self = this.set("UserCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserCount: Self = this.set("UserCount", js.undefined)
  }
}
