package typings.amazonDashConnectDashStreams.connect

import org.scalablytyped.runtime.TopLevel
import typings.amazonDashConnectDashStreams.connect.EndpointType.AGENT
import typings.amazonDashConnectDashStreams.connect.EndpointType.PHONE_NUMBER
import typings.amazonDashConnectDashStreams.connect.EndpointType.QUEUE
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EndpointType with String] = js.native
  /* "agent" */ @js.native
  object AGENT extends TopLevel[AGENT with String]
  
  /* "phone_number" */ @js.native
  object PHONE_NUMBER extends TopLevel[PHONE_NUMBER with String]
  
  /* "queue" */ @js.native
  object QUEUE extends TopLevel[QUEUE with String]
  
}

