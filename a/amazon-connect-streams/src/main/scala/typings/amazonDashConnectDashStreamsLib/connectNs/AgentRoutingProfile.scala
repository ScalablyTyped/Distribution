package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentRoutingProfile extends js.Object {
  /**
    * The default queue which should be associated with outbound contacts.
    */
  var defaultOutboundQueue: java.lang.String
  /**
    * The name of the routing profile.
    */
  var name: java.lang.String
  /**
    * The queues contained in the routing profile.
    */
  var queues: java.lang.String
}

object AgentRoutingProfile {
  @scala.inline
  def apply(defaultOutboundQueue: java.lang.String, name: java.lang.String, queues: java.lang.String): AgentRoutingProfile = {
    val __obj = js.Dynamic.literal(defaultOutboundQueue = defaultOutboundQueue, name = name, queues = queues)
  
    __obj.asInstanceOf[AgentRoutingProfile]
  }
}

