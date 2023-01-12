package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentConfiguration extends StObject {
  
  val agentPreferences: js.UndefOr[AgentPreferences] = js.undefined
  
  /** See `agent.getAgentStates()` for more info. */
  val agentStates: js.Array[AgentStateDefinition]
  
  /** See `agent.getDialableCountries()` for more info. */
  val dialableCountries: js.Array[String]
  
  /** See `agent.getExtension()` for more info. */
  var `extension`: String
  
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
  
  inline def apply(
    agentStates: js.Array[AgentStateDefinition],
    dialableCountries: js.Array[String],
    `extension`: String,
    name: String,
    permissions: js.Array[String],
    routingProfile: AgentRoutingProfile,
    softphoneAutoAccept: Boolean,
    softphoneEnabled: Boolean,
    username: String
  ): AgentConfiguration = {
    val __obj = js.Dynamic.literal(agentStates = agentStates.asInstanceOf[js.Any], dialableCountries = dialableCountries.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], routingProfile = routingProfile.asInstanceOf[js.Any], softphoneAutoAccept = softphoneAutoAccept.asInstanceOf[js.Any], softphoneEnabled = softphoneEnabled.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgentConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAgentPreferences(value: AgentPreferences): Self = StObject.set(x, "agentPreferences", value.asInstanceOf[js.Any])
    
    inline def setAgentPreferencesUndefined: Self = StObject.set(x, "agentPreferences", js.undefined)
    
    inline def setAgentStates(value: js.Array[AgentStateDefinition]): Self = StObject.set(x, "agentStates", value.asInstanceOf[js.Any])
    
    inline def setAgentStatesVarargs(value: AgentStateDefinition*): Self = StObject.set(x, "agentStates", js.Array(value*))
    
    inline def setDialableCountries(value: js.Array[String]): Self = StObject.set(x, "dialableCountries", value.asInstanceOf[js.Any])
    
    inline def setDialableCountriesVarargs(value: String*): Self = StObject.set(x, "dialableCountries", js.Array(value*))
    
    inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setRoutingProfile(value: AgentRoutingProfile): Self = StObject.set(x, "routingProfile", value.asInstanceOf[js.Any])
    
    inline def setSoftphoneAutoAccept(value: Boolean): Self = StObject.set(x, "softphoneAutoAccept", value.asInstanceOf[js.Any])
    
    inline def setSoftphoneEnabled(value: Boolean): Self = StObject.set(x, "softphoneEnabled", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
