package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentConfiguration extends js.Object {
  /** See `agent.getAgentStates()` for more info. */
  val agentStates: js.Array[AgentStateDefinition] = js.native
  /** See `agent.getDialableCountries()` for more info. */
  val dialableCountries: js.Array[String] = js.native
  /** See `agent.getExtension()` for more info. */
  var extension: String = js.native
  /** See `agent.getName()` for more info. */
  val name: String = js.native
  /** See `agent.getPermissions()` for more info. */
  val permissions: js.Array[String] = js.native
  /** See `agent.getRoutingProfile()` for more info. */
  val routingProfile: AgentRoutingProfile = js.native
  /** Indicates whether auto accept soft phone calls is enabled. */
  val softphoneAutoAccept: Boolean = js.native
  /** See `agent.isSoftphoneEnabled()` for more info. */
  var softphoneEnabled: Boolean = js.native
  /** The username for the agent as entered in their Amazon Connect user account. */
  val username: String = js.native
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
  @scala.inline
  implicit class AgentConfigurationOps[Self <: AgentConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAgentStatesVarargs(value: AgentStateDefinition*): Self = this.set("agentStates", js.Array(value :_*))
    @scala.inline
    def setAgentStates(value: js.Array[AgentStateDefinition]): Self = this.set("agentStates", value.asInstanceOf[js.Any])
    @scala.inline
    def setDialableCountriesVarargs(value: String*): Self = this.set("dialableCountries", js.Array(value :_*))
    @scala.inline
    def setDialableCountries(value: js.Array[String]): Self = this.set("dialableCountries", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = this.set("permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoutingProfile(value: AgentRoutingProfile): Self = this.set("routingProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def setSoftphoneAutoAccept(value: Boolean): Self = this.set("softphoneAutoAccept", value.asInstanceOf[js.Any])
    @scala.inline
    def setSoftphoneEnabled(value: Boolean): Self = this.set("softphoneEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
  
}

