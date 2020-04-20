package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentConfiguration extends js.Object {
  /**
    * Indicates the phone number that should be dialed to connect the agent to their inbound or outbound calls when softphone is not enabled.
    */
  var extension: String
  /**
    * The agent's user friendly display name.
    */
  var name: String
  /**
    * Describes the agent's current routing profile and list of queues therein. See agent.getRoutingProfile() for more info.
    */
  var routingProfile: AgentRoutingProfile
  /**
    * Indicates whether the agent's phone calls should route to the agent's browser-based softphone or the telephone number configured as the agent's extension.
    */
  var softphoneEnabled: Boolean
  /**
    * The username for the agent as entered in their Amazon Connect user account.
    */
  var username: String
}

object AgentConfiguration {
  @scala.inline
  def apply(
    extension: String,
    name: String,
    routingProfile: AgentRoutingProfile,
    softphoneEnabled: Boolean,
    username: String
  ): AgentConfiguration = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], routingProfile = routingProfile.asInstanceOf[js.Any], softphoneEnabled = softphoneEnabled.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentConfiguration]
  }
}

