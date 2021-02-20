package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentConfiguration extends StObject {
  
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
  implicit class AgentConfigurationMutableBuilder[Self <: AgentConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentStates(value: js.Array[AgentStateDefinition]): Self = StObject.set(x, "agentStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentStatesVarargs(value: AgentStateDefinition*): Self = StObject.set(x, "agentStates", js.Array(value :_*))
    
    @scala.inline
    def setDialableCountries(value: js.Array[String]): Self = StObject.set(x, "dialableCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialableCountriesVarargs(value: String*): Self = StObject.set(x, "dialableCountries", js.Array(value :_*))
    
    @scala.inline
    def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    @scala.inline
    def setRoutingProfile(value: AgentRoutingProfile): Self = StObject.set(x, "routingProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftphoneAutoAccept(value: Boolean): Self = StObject.set(x, "softphoneAutoAccept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftphoneEnabled(value: Boolean): Self = StObject.set(x, "softphoneEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
