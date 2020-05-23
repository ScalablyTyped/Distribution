package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EndpointType extends js.Object

@JSGlobal("connect.EndpointType")
@js.native
object EndpointType extends js.Object {
  @js.native
  sealed trait AGENT extends EndpointType
  
  @js.native
  sealed trait PHONE_NUMBER extends EndpointType
  
  @js.native
  sealed trait QUEUE extends EndpointType
  
}

