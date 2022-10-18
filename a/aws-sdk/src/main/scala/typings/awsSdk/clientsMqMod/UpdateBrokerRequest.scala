package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBrokerRequest extends StObject {
  
  /**
    * Optional. The authentication strategy used to secure the broker. The default is SIMPLE.
    */
  var AuthenticationStrategy: js.UndefOr[typings.awsSdk.clientsMqMod.AuthenticationStrategy] = js.undefined
  
  /**
    * Enables automatic upgrades to new minor versions for brokers, as new versions are released and supported by Amazon MQ. Automatic upgrades occur during the scheduled maintenance window of the broker or after a manual broker reboot.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[boolean] = js.undefined
  
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: string
  
  /**
    * A list of information about the configuration.
    */
  var Configuration: js.UndefOr[ConfigurationId] = js.undefined
  
  /**
    * The broker engine version. For a list of supported engine versions, see Supported engines.
    */
  var EngineVersion: js.UndefOr[string] = js.undefined
  
  /**
    * The broker's host instance type to upgrade to. For a list of supported instance types, see Broker instance types.
    */
  var HostInstanceType: js.UndefOr[string] = js.undefined
  
  /**
    * Optional. The metadata of the LDAP server used to authenticate and authorize connections to the broker. Does not apply to RabbitMQ brokers.
    */
  var LdapServerMetadata: js.UndefOr[LdapServerMetadataInput] = js.undefined
  
  /**
    * Enables Amazon CloudWatch logging for brokers.
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
object UpdateBrokerRequest {
  
  inline def apply(BrokerId: string): UpdateBrokerRequest = {
    val __obj = js.Dynamic.literal(BrokerId = BrokerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBrokerRequest]
  }
  
  extension [Self <: UpdateBrokerRequest](x: Self) {
    
    inline def setAuthenticationStrategy(value: AuthenticationStrategy): Self = StObject.set(x, "AuthenticationStrategy", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationStrategyUndefined: Self = StObject.set(x, "AuthenticationStrategy", js.undefined)
    
    inline def setAutoMinorVersionUpgrade(value: boolean): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    inline def setBrokerId(value: string): Self = StObject.set(x, "BrokerId", value.asInstanceOf[js.Any])
    
    inline def setConfiguration(value: ConfigurationId): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setEngineVersion(value: string): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setHostInstanceType(value: string): Self = StObject.set(x, "HostInstanceType", value.asInstanceOf[js.Any])
    
    inline def setHostInstanceTypeUndefined: Self = StObject.set(x, "HostInstanceType", js.undefined)
    
    inline def setLdapServerMetadata(value: LdapServerMetadataInput): Self = StObject.set(x, "LdapServerMetadata", value.asInstanceOf[js.Any])
    
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
