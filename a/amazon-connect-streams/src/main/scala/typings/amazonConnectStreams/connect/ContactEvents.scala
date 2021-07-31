package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactEvents extends StObject
@JSGlobal("connect.ContactEvents")
@js.native
object ContactEvents extends StObject {
  
  @js.native
  sealed trait ACCEPTED
    extends StObject
       with ContactEvents
  
  @js.native
  sealed trait ACW
    extends StObject
       with ContactEvents
  
  @js.native
  sealed trait CONNECTED
    extends StObject
       with ContactEvents
  
  @js.native
  sealed trait CONNECTING
    extends StObject
       with ContactEvents
  
  @js.native
  sealed trait DESTROYED
    extends StObject
       with ContactEvents
  
  @js.native
  sealed trait ENDED
    extends StObject
       with ContactEvents
  
  @js.native
  sealed trait ERROR
    extends StObject
       with ContactEvents
  
  @js.native
  sealed trait INCOMING
    extends StObject
       with ContactEvents
  
  @js.native
  sealed trait INIT
    extends StObject
       with ContactEvents
  
  @js.native
  sealed trait MISSED
    extends StObject
       with ContactEvents
  
  @js.native
  sealed trait PENDING
    extends StObject
       with ContactEvents
  
  @js.native
  sealed trait REFRESH
    extends StObject
       with ContactEvents
  
  @js.native
  sealed trait VIEW
    extends StObject
       with ContactEvents
}
