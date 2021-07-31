package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SoftphoneErrorTypes extends StObject
@JSGlobal("connect.SoftphoneErrorTypes")
@js.native
object SoftphoneErrorTypes extends StObject {
  
  @js.native
  sealed trait ICE_COLLECTION_TIMEOUT
    extends StObject
       with SoftphoneErrorTypes
  
  @js.native
  sealed trait MICROPHONE_NOT_SHARED
    extends StObject
       with SoftphoneErrorTypes
  
  @js.native
  sealed trait OTHER
    extends StObject
       with SoftphoneErrorTypes
  
  @js.native
  sealed trait REALTIME_COMMUNICATION_ERROR
    extends StObject
       with SoftphoneErrorTypes
  
  @js.native
  sealed trait SIGNALLING_CONNECTION_FAILURE
    extends StObject
       with SoftphoneErrorTypes
  
  @js.native
  sealed trait SIGNALLING_HANDSHAKE_FAILURE
    extends StObject
       with SoftphoneErrorTypes
  
  @js.native
  sealed trait UNSUPPORTED_BROWSER
    extends StObject
       with SoftphoneErrorTypes
  
  @js.native
  sealed trait USER_BUSY_ERROR
    extends StObject
       with SoftphoneErrorTypes
  
  @js.native
  sealed trait WEBRTC_ERROR
    extends StObject
       with SoftphoneErrorTypes
}
