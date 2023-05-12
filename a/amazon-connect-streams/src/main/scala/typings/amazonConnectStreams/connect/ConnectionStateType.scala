package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectionStateType extends StObject
/** An enumeration listing the different states that a connection can have. */
@JSGlobal("connect.ConnectionStateType")
@js.native
object ConnectionStateType extends StObject {
  
  /** The connection is in barge mode */
  @js.native
  sealed trait BARGE
    extends StObject
       with ConnectionStateType
  
  /** The connection is connected to the contact. */
  @js.native
  sealed trait CONNECTED
    extends StObject
       with ConnectionStateType
  
  /** The connection is being initialized. */
  @js.native
  sealed trait CONNECTING
    extends StObject
       with ConnectionStateType
  
  /** The connection is no longer connected to the contact. */
  @js.native
  sealed trait DISCONNECTED
    extends StObject
       with ConnectionStateType
  
  /** The connection is connected but on hold. */
  @js.native
  sealed trait HOLD
    extends StObject
       with ConnectionStateType
  
  /** The connection has not yet been initialized. */
  @js.native
  sealed trait INIT
    extends StObject
       with ConnectionStateType
  
  /** The connection is in silent monitor mode */
  @js.native
  sealed trait SILENT_MONITOR
    extends StObject
       with ConnectionStateType
}
