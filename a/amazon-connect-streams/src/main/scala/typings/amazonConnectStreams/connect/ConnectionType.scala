package typings.amazonConnectStreams.connect

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
  
}

