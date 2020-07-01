package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EndpointType extends js.Object

/** This enumeration lists the different types of endpoints. */
@JSGlobal("connect.EndpointType")
@js.native
object EndpointType extends js.Object {
  /** An endpoint pointing to an agent in the same instance. */
  @js.native
  sealed trait AGENT extends EndpointType
  
  /** An endpoint pointing to a phone number. */
  @js.native
  sealed trait PHONE_NUMBER extends EndpointType
  
  /** An endpoint pointing to a queue call flow in the same instance. */
  @js.native
  sealed trait QUEUE extends EndpointType
  
}

