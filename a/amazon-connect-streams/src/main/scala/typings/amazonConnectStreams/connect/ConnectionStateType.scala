package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectionStateType extends StObject
/** An enumeration listing the different states that a connection can have. */
@JSGlobal("connect.ConnectionStateType")
@js.native
object ConnectionStateType extends StObject {
  
  /** The connection is connected to the contact. */
  @js.native
  sealed trait CONNECTED extends ConnectionStateType
  
  /** The connection is being initialized. */
  @js.native
  sealed trait CONNECTING extends ConnectionStateType
  
  /** The connection is no longer connected to the contact. */
  @js.native
  sealed trait DISCONNECTED extends ConnectionStateType
  
  /** The connection is connected but on hold. */
  @js.native
  sealed trait HOLD extends ConnectionStateType
  
  /** The connection has not yet been initialized. */
  @js.native
  sealed trait INIT extends ConnectionStateType
}
