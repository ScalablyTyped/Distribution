package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SoftphoneErrorTypes extends StObject
@JSGlobal("connect.SoftphoneErrorTypes")
@js.native
object SoftphoneErrorTypes extends StObject {
  
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
}
