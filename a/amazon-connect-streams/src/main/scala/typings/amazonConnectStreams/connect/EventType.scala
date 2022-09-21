package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventType extends StObject
@JSGlobal("connect.EventType")
@js.native
object EventType extends StObject {
  
  @js.native
  sealed trait ACCESS_DENIED
    extends StObject
       with EventType
  
  @js.native
  sealed trait ACKNOWLEDGE
    extends StObject
       with EventType
  
  @js.native
  sealed trait ACK_TIMEOUT
    extends StObject
       with EventType
  
  @js.native
  sealed trait API_METRIC
    extends StObject
       with EventType
  
  @js.native
  sealed trait API_REQUEST
    extends StObject
       with EventType
  
  @js.native
  sealed trait API_RESPONSE
    extends StObject
       with EventType
  
  @js.native
  sealed trait AUTHORIZE_RETRIES_EXHAUSTED
    extends StObject
       with EventType
  
  @js.native
  sealed trait AUTHORIZE_SUCCESS
    extends StObject
       with EventType
  
  @js.native
  sealed trait AUTH_FAIL
    extends StObject
       with EventType
  
  @js.native
  sealed trait BROADCAST
    extends StObject
       with EventType
  
  @js.native
  sealed trait CLICK_STREAM_DATA
    extends StObject
       with EventType
  
  @js.native
  sealed trait CLIENT_METRIC
    extends StObject
       with EventType
  
  @js.native
  sealed trait CLIENT_SIDE_LOGS
    extends StObject
       with EventType
  
  @js.native
  sealed trait CLOSE
    extends StObject
       with EventType
  
  @js.native
  sealed trait CONFIGURE
    extends StObject
       with EventType
  
  @js.native
  sealed trait CTI_AUTHORIZE_RETRIES_EXHAUSTED
    extends StObject
       with EventType
  
  @js.native
  sealed trait IFRAME_RETRIES_EXHAUSTED
    extends StObject
       with EventType
  
  @js.native
  sealed trait IFRAME_STYLE
    extends StObject
       with EventType
  
  @js.native
  sealed trait INIT
    extends StObject
       with EventType
  
  @js.native
  sealed trait LOG
    extends StObject
       with EventType
  
  @js.native
  sealed trait MASTER_REQUEST
    extends StObject
       with EventType
  
  @js.native
  sealed trait MASTER_RESPONSE
    extends StObject
       with EventType
  
  @js.native
  sealed trait MEDIA_DEVICE_REQUEST
    extends StObject
       with EventType
  
  @js.native
  sealed trait MEDIA_DEVICE_RESPONSE
    extends StObject
       with EventType
  
  @js.native
  sealed trait MUTE
    extends StObject
       with EventType
  
  @js.native
  sealed trait OUTER_CONTEXT_INFO
    extends StObject
       with EventType
  
  @js.native
  sealed trait RELOAD_AGENT_CONFIGURATION
    extends StObject
       with EventType
  
  @js.native
  sealed trait SEND_LOGS
    extends StObject
       with EventType
  
  @js.native
  sealed trait SERVER_BOUND_INTERNAL_LOG
    extends StObject
       with EventType
  
  @js.native
  sealed trait SOFTPHONE_REPORT
    extends StObject
       with EventType
  
  @js.native
  sealed trait SOFTPHONE_STATS
    extends StObject
       with EventType
  
  @js.native
  sealed trait SYNCHRONIZE
    extends StObject
       with EventType
  
  @js.native
  sealed trait TAB_ID
    extends StObject
       with EventType
  
  @js.native
  sealed trait TERMINATE
    extends StObject
       with EventType
  
  @js.native
  sealed trait TERMINATED
    extends StObject
       with EventType
  
  @js.native
  sealed trait UPDATE_CONNECTED_CCPS
    extends StObject
       with EventType
}
