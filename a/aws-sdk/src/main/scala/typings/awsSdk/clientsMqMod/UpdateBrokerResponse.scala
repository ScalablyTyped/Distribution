package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBrokerResponse extends StObject {
  
  /**
    * Optional. The authentication strategy used to secure the broker. The default is SIMPLE.
    */
  var AuthenticationStrategy: js.UndefOr[typings.awsSdk.clientsMqMod.AuthenticationStrategy] = js.undefined
  
  /**
    * The new boolean value that specifies whether broker engines automatically upgrade to new minor versions as new versions are released and supported by Amazon MQ.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[boolean] = js.undefined
  
  /**
    * Required. The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the updated configuration.
    */
  var Configuration: js.UndefOr[ConfigurationId] = js.undefined
  
  /**
    * The broker engine version to upgrade to. For a list of supported engine versions, see Supported engines.
    */
  var EngineVersion: js.UndefOr[string] = js.undefined
  
  /**
    * The broker's host instance type to upgrade to. For a list of supported instance types, see Broker instance types.
    */
  var HostInstanceType: js.UndefOr[string] = js.undefined
  
  /**
    * Optional. The metadata of the LDAP server used to authenticate and authorize connections to the broker. Does not apply to RabbitMQ brokers.
    */
  var LdapServerMetadata: js.UndefOr[LdapServerMetadataOutput] = js.undefined
  
  /**
    * The list of information about logs to be enabled for the specified broker.
    */
  var Logs: js.UndefOr[typings.awsSdk.clientsMqMod.Logs] = js.undefined
  
  /**
    * The parameters that determine the WeeklyStartTime.
    */
  var MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime] = js.undefined
  
  /**
    * The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
    */
  var SecurityGroups: js.UndefOr[listOfString] = js.undefined
}
object UpdateBrokerResponse {
  
  inline def apply(): UpdateBrokerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBrokerResponse]
  }
  
  extension [Self <: UpdateBrokerResponse](x: Self) {
    
    inline def setAuthenticationStrategy(value: AuthenticationStrategy): Self = StObject.set(x, "AuthenticationStrategy", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationStrategyUndefined: Self = StObject.set(x, "AuthenticationStrategy", js.undefined)
    
    inline def setAutoMinorVersionUpgrade(value: boolean): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    inline def setBrokerId(value: string): Self = StObject.set(x, "BrokerId", value.asInstanceOf[js.Any])
    
    inline def setBrokerIdUndefined: Self = StObject.set(x, "BrokerId", js.undefined)
    
    inline def setConfiguration(value: ConfigurationId): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setEngineVersion(value: string): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setHostInstanceType(value: string): Self = StObject.set(x, "HostInstanceType", value.asInstanceOf[js.Any])
    
    inline def setHostInstanceTypeUndefined: Self = StObject.set(x, "HostInstanceType", js.undefined)
    
    inline def setLdapServerMetadata(value: LdapServerMetadataOutput): Self = StObject.set(x, "LdapServerMetadata", value.asInstanceOf[js.Any])
    
    inline def setLdapServerMetadataUndefined: Self = StObject.set(x, "LdapServerMetadata", js.undefined)
    
    inline def setLogs(value: Logs): Self = StObject.set(x, "Logs", value.asInstanceOf[js.Any])
    
    inline def setLogsUndefined: Self = StObject.set(x, "Logs", js.undefined)
    
    inline def setMaintenanceWindowStartTime(value: WeeklyStartTime): Self = StObject.set(x, "MaintenanceWindowStartTime", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceWindowStartTimeUndefined: Self = StObject.set(x, "MaintenanceWindowStartTime", js.undefined)
    
    inline def setSecurityGroups(value: listOfString): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: string*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
  }
}
