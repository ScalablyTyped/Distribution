package typings.amazonConnectStreams.global.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This enumeration lists the different types of endpoints. */
@JSGlobal("connect.EndpointType")
@js.native
object EndpointType extends js.Object {
  /* "agent" */ val AGENT: typings.amazonConnectStreams.connect.EndpointType.AGENT with String = js.native
  /* "phone_number" */ val PHONE_NUMBER: typings.amazonConnectStreams.connect.EndpointType.PHONE_NUMBER with String = js.native
  /* "queue" */ val QUEUE: typings.amazonConnectStreams.connect.EndpointType.QUEUE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.EndpointType with String] = js.native
}

