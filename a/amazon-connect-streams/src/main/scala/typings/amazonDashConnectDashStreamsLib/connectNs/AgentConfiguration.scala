package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentConfiguration extends js.Object {
  /**
    * Indicates the phone number that should be dialed to connect the agent to their inbound or outbound calls when softphone is not enabled.
    */
  var extension: java.lang.String
  /**
    * The agent's user friendly display name.
    */
  var name: java.lang.String
  /**
    * Describes the agent's current routing profile and list of queues therein. See agent.getRoutingProfile() for more info.
    */
  var routingProfile: AgentRoutingProfile
  /**
    * Indicates whether the agent's phone calls should route to the agent's browser-based softphone or the telephone number configured as the agent's extension.
    */
  var softphoneEnabled: scala.Boolean
  /**
    * The username for the agent as entered in their Amazon Connect user account.
    */
  var username: java.lang.String
}

object AgentConfiguration {
  @scala.inline
  def apply(
    extension: java.lang.String,
    name: java.lang.String,
    routingProfile: AgentRoutingProfile,
    softphoneEnabled: scala.Boolean,
    username: java.lang.String
  ): AgentConfiguration = {
    val __obj = js.Dynamic.literal(extension = extension, name = name, routingProfile = routingProfile, softphoneEnabled = softphoneEnabled, username = username)
  
    __obj.asInstanceOf[AgentConfiguration]
  }
}

