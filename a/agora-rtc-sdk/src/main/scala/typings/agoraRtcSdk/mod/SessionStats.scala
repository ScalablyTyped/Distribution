package typings.agoraRtcSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Statistics of the session connection.
  *
  * If {@link getSessionStats} is called successfully, this interface provides the statistics.
  */
@js.native
trait SessionStats extends StObject {
  
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
  implicit class SessionStatsMutableBuilder[Self <: SessionStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    @scala.inline
    def setRecvBitrate(value: String): Self = StObject.set(x, "RecvBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecvBitrateUndefined: Self = StObject.set(x, "RecvBitrate", js.undefined)
    
    @scala.inline
    def setRecvBytes(value: String): Self = StObject.set(x, "RecvBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecvBytesUndefined: Self = StObject.set(x, "RecvBytes", js.undefined)
    
    @scala.inline
    def setSendBitrate(value: String): Self = StObject.set(x, "SendBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendBitrateUndefined: Self = StObject.set(x, "SendBitrate", js.undefined)
    
    @scala.inline
    def setSendBytes(value: String): Self = StObject.set(x, "SendBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendBytesUndefined: Self = StObject.set(x, "SendBytes", js.undefined)
    
    @scala.inline
    def setUserCount(value: String): Self = StObject.set(x, "UserCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserCountUndefined: Self = StObject.set(x, "UserCount", js.undefined)
  }
}
