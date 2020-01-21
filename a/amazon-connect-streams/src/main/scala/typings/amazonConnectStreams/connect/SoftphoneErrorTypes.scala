package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SoftphoneErrorTypes extends js.Object

@JSGlobal("connect.SoftphoneErrorTypes")
@js.native
object SoftphoneErrorTypes extends js.Object {
  @js.native
  sealed trait ICE_COLLECTION_TIMEOUT extends SoftphoneErrorTypes
  
  @js.native
  sealed trait MICROPHONE_NOT_SHARED extends SoftphoneErrorTypes
  
  @js.native
  sealed trait OTHER extends SoftphoneErrorTypes
  
  @js.native
  sealed trait REALTIME_COMMUNICATION_ERROR extends SoftphoneErrorTypes
  
  @js.native
  sealed trait SIGNALLING_CONNECTION_FAILURE extends SoftphoneErrorTypes
  
  @js.native
  sealed trait SIGNALLING_HANDSHAKE_FAILURE extends SoftphoneErrorTypes
  
  @js.native
  sealed trait UNSUPPORTED_BROWSER extends SoftphoneErrorTypes
  
  @js.native
  sealed trait USER_BUSY_ERROR extends SoftphoneErrorTypes
  
  @js.native
  sealed trait WEBRTC_ERROR extends SoftphoneErrorTypes
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SoftphoneErrorTypes with String] = js.native
  /* "ice_collection_timeout" */ @js.native
  object ICE_COLLECTION_TIMEOUT extends TopLevel[ICE_COLLECTION_TIMEOUT with String]
  
  /* "microphone_not_shared" */ @js.native
  object MICROPHONE_NOT_SHARED extends TopLevel[MICROPHONE_NOT_SHARED with String]
  
  /* "other" */ @js.native
  object OTHER extends TopLevel[OTHER with String]
  
  /* "realtime_communication_error" */ @js.native
  object REALTIME_COMMUNICATION_ERROR extends TopLevel[REALTIME_COMMUNICATION_ERROR with String]
  
  /* "signalling_connection_failure" */ @js.native
  object SIGNALLING_CONNECTION_FAILURE extends TopLevel[SIGNALLING_CONNECTION_FAILURE with String]
  
  /* "signalling_handshake_failure" */ @js.native
  object SIGNALLING_HANDSHAKE_FAILURE extends TopLevel[SIGNALLING_HANDSHAKE_FAILURE with String]
  
  /* "unsupported_browser" */ @js.native
  object UNSUPPORTED_BROWSER extends TopLevel[UNSUPPORTED_BROWSER with String]
  
  /* "user_busy_error" */ @js.native
  object USER_BUSY_ERROR extends TopLevel[USER_BUSY_ERROR with String]
  
  /* "webrtc_error" */ @js.native
  object WEBRTC_ERROR extends TopLevel[WEBRTC_ERROR with String]
  
}

