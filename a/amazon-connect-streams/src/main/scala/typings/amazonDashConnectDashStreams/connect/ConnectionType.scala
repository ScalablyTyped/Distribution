package typings.amazonDashConnectDashStreams.connect

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectionType extends js.Object

@JSGlobal("connect.ConnectionType")
@js.native
object ConnectionType extends js.Object {
  @js.native
  sealed trait AGENT extends ConnectionType
  
  @js.native
  sealed trait INBOUND extends ConnectionType
  
  @js.native
  sealed trait MONITORING extends ConnectionType
  
  @js.native
  sealed trait OUTBOUND extends ConnectionType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConnectionType with String] = js.native
  /* "agent" */ @js.native
  object AGENT extends TopLevel[AGENT with String]
  
  /* "inbound" */ @js.native
  object INBOUND extends TopLevel[INBOUND with String]
  
  /* "monitoring" */ @js.native
  object MONITORING extends TopLevel[MONITORING with String]
  
  /* "outbound" */ @js.native
  object OUTBOUND extends TopLevel[OUTBOUND with String]
  
}

