package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectionType extends StObject
/** Lists the different types of connections. */
@JSGlobal("connect.ConnectionType")
@js.native
object ConnectionType extends StObject {
  
  /** The agent connection. */
  @js.native
  sealed trait AGENT extends ConnectionType
  
  /** An inbound connection, usually representing an inbound call. */
  @js.native
  sealed trait INBOUND extends ConnectionType
  
  /** A special connection type representing a manager listen-in session. */
  @js.native
  sealed trait MONITORING extends ConnectionType
  
  /** An outbound connection, representing either an outbound call or additional connection added to the contact. */
  @js.native
  sealed trait OUTBOUND extends ConnectionType
}
