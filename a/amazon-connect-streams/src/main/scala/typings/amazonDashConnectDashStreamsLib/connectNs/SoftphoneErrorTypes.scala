package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SoftphoneErrorTypes extends js.Object

@JSGlobal("connect.SoftphoneErrorTypes")
@js.native
object SoftphoneErrorTypes extends js.Object {
  @js.native
  sealed trait ICE_COLLECTION_TIMEOUT
    extends amazonDashConnectDashStreamsLib.connectNs.SoftphoneErrorTypes
  
  @js.native
  sealed trait MICROPHONE_NOT_SHARED
    extends amazonDashConnectDashStreamsLib.connectNs.SoftphoneErrorTypes
  
  @js.native
  sealed trait OTHER
    extends amazonDashConnectDashStreamsLib.connectNs.SoftphoneErrorTypes
  
  @js.native
  sealed trait REALTIME_COMMUNICATION_ERROR
    extends amazonDashConnectDashStreamsLib.connectNs.SoftphoneErrorTypes
  
  @js.native
  sealed trait SIGNALLING_CONNECTION_FAILURE
    extends amazonDashConnectDashStreamsLib.connectNs.SoftphoneErrorTypes
  
  @js.native
  sealed trait SIGNALLING_HANDSHAKE_FAILURE
    extends amazonDashConnectDashStreamsLib.connectNs.SoftphoneErrorTypes
  
  @js.native
  sealed trait UNSUPPORTED_BROWSER
    extends amazonDashConnectDashStreamsLib.connectNs.SoftphoneErrorTypes
  
  @js.native
  sealed trait USER_BUSY_ERROR
    extends amazonDashConnectDashStreamsLib.connectNs.SoftphoneErrorTypes
  
  @js.native
  sealed trait WEBRTC_ERROR
    extends amazonDashConnectDashStreamsLib.connectNs.SoftphoneErrorTypes
  
  /* "ice_collection_timeout" */ val ICE_COLLECTION_TIMEOUT: ICE_COLLECTION_TIMEOUT with java.lang.String = js.native
  /* "microphone_not_shared" */ val MICROPHONE_NOT_SHARED: MICROPHONE_NOT_SHARED with java.lang.String = js.native
  /* "other" */ val OTHER: OTHER with java.lang.String = js.native
  /* "realtime_communication_error" */ val REALTIME_COMMUNICATION_ERROR: REALTIME_COMMUNICATION_ERROR with java.lang.String = js.native
  /* "signalling_connection_failure" */ val SIGNALLING_CONNECTION_FAILURE: SIGNALLING_CONNECTION_FAILURE with java.lang.String = js.native
  /* "signalling_handshake_failure" */ val SIGNALLING_HANDSHAKE_FAILURE: SIGNALLING_HANDSHAKE_FAILURE with java.lang.String = js.native
  /* "unsupported_browser" */ val UNSUPPORTED_BROWSER: UNSUPPORTED_BROWSER with java.lang.String = js.native
  /* "user_busy_error" */ val USER_BUSY_ERROR: USER_BUSY_ERROR with java.lang.String = js.native
  /* "webrtc_error" */ val WEBRTC_ERROR: WEBRTC_ERROR with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    amazonDashConnectDashStreamsLib.connectNs.SoftphoneErrorTypes with java.lang.String
  ] = js.native
}

