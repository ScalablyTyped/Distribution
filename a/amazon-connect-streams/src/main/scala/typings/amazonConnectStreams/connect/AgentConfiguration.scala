package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentConfiguration extends js.Object {
  /** See `agent.getAgentStates()` for more info. */
  val agentStates: js.Array[AgentStateDefinition]
  /** See `agent.getDialableCountries()` for more info. */
  val dialableCountries: js.Array[String]
  /** See `agent.getExtension()` for more info. */
  var extension: String
  /** See `agent.getName()` for more info. */
  val name: String
  /** See `agent.getPermissions()` for more info. */
  val permissions: js.Array[String]
  /** See `agent.getRoutingProfile()` for more info. */
  val routingProfile: AgentRoutingProfile
  /** Indicates whether auto accept soft phone calls is enabled. */
  val softphoneAutoAccept: Boolean
  /** See `agent.isSoftphoneEnabled()` for more info. */
  var softphoneEnabled: Boolean
  /** The username for the agent as entered in their Amazon Connect user account. */
  val username: String
}

object AgentConfiguration {
  @scala.inline
  def apply(
    agentStates: js.Array[AgentStateDefinition],
    dialableCountries: js.Array[String],
    extension: String,
    name: String,
    permissions: js.Array[String],
    routingProfile: AgentRoutingProfile,
    softphoneAutoAccept: Boolean,
    softphoneEnabled: Boolean,
    username: String
  ): AgentConfiguration = {
    val __obj = js.Dynamic.literal(agentStates = agentStates.asInstanceOf[js.Any], dialableCountries = dialableCountries.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], routingProfile = routingProfile.asInstanceOf[js.Any], softphoneAutoAccept = softphoneAutoAccept.asInstanceOf[js.Any], softphoneEnabled = softphoneEnabled.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentConfiguration]
  }
}

