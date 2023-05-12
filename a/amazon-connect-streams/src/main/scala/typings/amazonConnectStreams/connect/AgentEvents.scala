package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AgentEvents extends StObject
@JSGlobal("connect.AgentEvents")
@js.native
object AgentEvents extends StObject {
  
  @js.native
  sealed trait ACW
    extends StObject
       with AgentEvents
  
  @js.native
  sealed trait CONTACT_PENDING
    extends StObject
       with AgentEvents
  
  @js.native
  sealed trait ENQUEUED_NEXT_STATE
    extends StObject
       with AgentEvents
  
  @js.native
  sealed trait ERROR
    extends StObject
       with AgentEvents
  
  @js.native
  sealed trait INIT
    extends StObject
       with AgentEvents
  
  @js.native
  sealed trait LOCAL_MEDIA_STREAM_CREATED
    extends StObject
       with AgentEvents
  
  @js.native
  sealed trait MUTE_TOGGLE
    extends StObject
       with AgentEvents
  
  @js.native
  sealed trait NOT_ROUTABLE
    extends StObject
       with AgentEvents
  
  @js.native
  sealed trait OFFLINE
    extends StObject
       with AgentEvents
  
  @js.native
  sealed trait PENDING
    extends StObject
       with AgentEvents
  
  @js.native
  sealed trait REFRESH
    extends StObject
       with AgentEvents
  
  @js.native
  sealed trait ROUTABLE
    extends StObject
       with AgentEvents
  
  @js.native
  sealed trait SOFTPHONE_ERROR
    extends StObject
       with AgentEvents
  
  @js.native
  sealed trait STATE_CHANGE
    extends StObject
       with AgentEvents
  
  @js.native
  sealed trait UPDATE
    extends StObject
       with AgentEvents
  
  @js.native
  sealed trait WEBSOCKET_CONNECTION_GAINED
    extends StObject
       with AgentEvents
  
  @js.native
  sealed trait WEBSOCKET_CONNECTION_LOST
    extends StObject
       with AgentEvents
}
