package typings.amazonDashConnectDashStreams.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentRoutingProfile extends js.Object {
  /**
    * The default queue which should be associated with outbound contacts.
    */
  var defaultOutboundQueue: String
  /**
    * The name of the routing profile.
    */
  var name: String
  /**
    * The queues contained in the routing profile.
    */
  var queues: String
}

object AgentRoutingProfile {
  @scala.inline
  def apply(defaultOutboundQueue: String, name: String, queues: String): AgentRoutingProfile = {
    val __obj = js.Dynamic.literal(defaultOutboundQueue = defaultOutboundQueue, name = name, queues = queues)
  
    __obj.asInstanceOf[AgentRoutingProfile]
  }
}

