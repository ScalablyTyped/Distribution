package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBrokerResponse extends StObject {
  
  /**
    * A list of actions required for a broker.
    */
  var ActionsRequired: js.UndefOr[listOfActionRequired] = js.undefined
  
  /**
    * The authentication strategy used to secure the broker. The default is SIMPLE.
    */
  var AuthenticationStrategy: js.UndefOr[typings.awsSdk.clientsMqMod.AuthenticationStrategy] = js.undefined
  
  /**
    * Enables automatic upgrades to new minor versions for brokers, as new versions are released and supported by Amazon MQ. Automatic upgrades occur during the scheduled maintenance window of the broker or after a manual broker reboot.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[boolean] = js.undefined
  
  /**
    * The broker's Amazon Resource Name (ARN).
    */
  var BrokerArn: js.UndefOr[string] = js.undefined
  
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[string] = js.undefined
  
  /**
    * A list of information about allocated brokers.
    */
  var BrokerInstances: js.UndefOr[listOfBrokerInstance] = js.undefined
  
  /**
    * The broker's name. This value must be unique in your AWS account, 1-50 characters long, must contain only letters, numbers, dashes, and underscores, and must not contain white spaces, brackets, wildcard characters, or special characters.
    */
  var BrokerName: js.UndefOr[string] = js.undefined
  
  /**
    * The broker's status.
    */
  var BrokerState: js.UndefOr[typings.awsSdk.clientsMqMod.BrokerState] = js.undefined
  
  /**
    * The list of all revisions for the specified configuration.
    */
  var Configurations: js.UndefOr[typings.awsSdk.clientsMqMod.Configurations] = js.undefined
  
  /**
    * The time when the broker was created.
    */
  var Created: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The broker's deployment mode.
    */
  var DeploymentMode: js.UndefOr[typings.awsSdk.clientsMqMod.DeploymentMode] = js.undefined
  
  /**
    * Encryption options for the broker. Does not apply to RabbitMQ brokers.
    */
  var EncryptionOptions: js.UndefOr[typings.awsSdk.clientsMqMod.EncryptionOptions] = js.undefined
  
  /**
    * The type of broker engine. Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
    */
  var EngineType: js.UndefOr[typings.awsSdk.clientsMqMod.EngineType] = js.undefined
  
  /**
    * The broker engine's version. For a list of supported engine versions, see Supported engines.
    */
  var EngineVersion: js.UndefOr[string] = js.undefined
  
  /**
    * The broker's instance type.
    */
  var HostInstanceType: js.UndefOr[string] = js.undefined
  
  /**
    * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
    */
  var LdapServerMetadata: js.UndefOr[LdapServerMetadataOutput] = js.undefined
  
  /**
    * The list of information about logs currently enabled and pending to be deployed for the specified broker.
    */
  var Logs: js.UndefOr[LogsSummary] = js.undefined
  
  /**
    * The parameters that determine the WeeklyStartTime.
    */
  var MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime] = js.undefined
  
  /**
    * The authentication strategy that will be applied when the broker is rebooted. The default is SIMPLE.
    */
  var PendingAuthenticationStrategy: js.UndefOr[AuthenticationStrategy] = js.undefined
  
  /**
    * The broker engine version to upgrade to. For a list of supported engine versions, see Supported engines.
    */
  var PendingEngineVersion: js.UndefOr[string] = js.undefined
  
  /**
    * The broker's host instance type to upgrade to. For a list of supported instance types, see Broker instance types.
    */
  var PendingHostInstanceType: js.UndefOr[string] = js.undefined
  
  /**
    * The metadata of the LDAP server that will be used to authenticate and authorize connections to the broker after it is rebooted.
    */
  var PendingLdapServerMetadata: js.UndefOr[LdapServerMetadataOutput] = js.undefined
  
  /**
    * The list of pending security groups to authorize connections to brokers.
    */
  var PendingSecurityGroups: js.UndefOr[listOfString] = js.undefined
  
  /**
    * Enables connections from applications outside of the VPC that hosts the broker's subnets.
    */
  var PubliclyAccessible: js.UndefOr[boolean] = js.undefined
  
  /**
    * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
    */
  var SecurityGroups: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The broker's storage type.
    */
  var StorageType: js.UndefOr[BrokerStorageType] = js.undefined
  
  /**
    * The list of groups that define which subnets and IP ranges the broker can use from different Availability Zones.
    */
  var SubnetIds: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The list of all tags associated with this broker.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
  
  /**
    * The list of all broker usernames for the specified broker.
    */
  var Users: js.UndefOr[listOfUserSummary] = js.undefined
}
object DescribeBrokerResponse {
  
  inline def apply(): DescribeBrokerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBrokerResponse]
  }
  
  extension [Self <: DescribeBrokerResponse](x: Self) {
    
    inline def setActionsRequired(value: listOfActionRequired): Self = StObject.set(x, "ActionsRequired", value.asInstanceOf[js.Any])
    
    inline def setActionsRequiredUndefined: Self = StObject.set(x, "ActionsRequired", js.undefined)
    
    inline def setActionsRequiredVarargs(value: ActionRequired*): Self = StObject.set(x, "ActionsRequired", js.Array(value*))
    
    inline def setAuthenticationStrategy(value: AuthenticationStrategy): Self = StObject.set(x, "AuthenticationStrategy", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationStrategyUndefined: Self = StObject.set(x, "AuthenticationStrategy", js.undefined)
    
    inline def setAutoMinorVersionUpgrade(value: boolean): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    inline def setBrokerArn(value: string): Self = StObject.set(x, "BrokerArn", value.asInstanceOf[js.Any])
    
    inline def setBrokerArnUndefined: Self = StObject.set(x, "BrokerArn", js.undefined)
    
    inline def setBrokerId(value: string): Self = StObject.set(x, "BrokerId", value.asInstanceOf[js.Any])
    
    inline def setBrokerIdUndefined: Self = StObject.set(x, "BrokerId", js.undefined)
    
    inline def setBrokerInstances(value: listOfBrokerInstance): Self = StObject.set(x, "BrokerInstances", value.asInstanceOf[js.Any])
    
    inline def setBrokerInstancesUndefined: Self = StObject.set(x, "BrokerInstances", js.undefined)
    
    inline def setBrokerInstancesVarargs(value: BrokerInstance*): Self = StObject.set(x, "BrokerInstances", js.Array(value*))
    
    inline def setBrokerName(value: string): Self = StObject.set(x, "BrokerName", value.asInstanceOf[js.Any])
    
    inline def setBrokerNameUndefined: Self = StObject.set(x, "BrokerName", js.undefined)
    
    inline def setBrokerState(value: BrokerState): Self = StObject.set(x, "BrokerState", value.asInstanceOf[js.Any])
    
    inline def setBrokerStateUndefined: Self = StObject.set(x, "BrokerState", js.undefined)
    
    inline def setConfigurations(value: Configurations): Self = StObject.set(x, "Configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsUndefined: Self = StObject.set(x, "Configurations", js.undefined)
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    inline def setDeploymentMode(value: DeploymentMode): Self = StObject.set(x, "DeploymentMode", value.asInstanceOf[js.Any])
    
    inline def setDeploymentModeUndefined: Self = StObject.set(x, "DeploymentMode", js.undefined)
    
    inline def setEncryptionOptions(value: EncryptionOptions): Self = StObject.set(x, "EncryptionOptions", value.asInstanceOf[js.Any])
    
    inline def setEncryptionOptionsUndefined: Self = StObject.set(x, "EncryptionOptions", js.undefined)
    
    inline def setEngineType(value: EngineType): Self = StObject.set(x, "EngineType", value.asInstanceOf[js.Any])
    
    inline def setEngineTypeUndefined: Self = StObject.set(x, "EngineType", js.undefined)
    
    inline def setEngineVersion(value: string): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setHostInstanceType(value: string): Self = StObject.set(x, "HostInstanceType", value.asInstanceOf[js.Any])
    
    inline def setHostInstanceTypeUndefined: Self = StObject.set(x, "HostInstanceType", js.undefined)
    
    inline def setLdapServerMetadata(value: LdapServerMetadataOutput): Self = StObject.set(x, "LdapServerMetadata", value.asInstanceOf[js.Any])
    
    inline def setLdapServerMetadataUndefined: Self = StObject.set(x, "LdapServerMetadata", js.undefined)
    
    inline def setLogs(value: LogsSummary): Self = StObject.set(x, "Logs", value.asInstanceOf[js.Any])
    
    inline def setLogsUndefined: Self = StObject.set(x, "Logs", js.undefined)
    
    inline def setMaintenanceWindowStartTime(value: WeeklyStartTime): Self = StObject.set(x, "MaintenanceWindowStartTime", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceWindowStartTimeUndefined: Self = StObject.set(x, "MaintenanceWindowStartTime", js.undefined)
    
    inline def setPendingAuthenticationStrategy(value: AuthenticationStrategy): Self = StObject.set(x, "PendingAuthenticationStrategy", value.asInstanceOf[js.Any])
    
    inline def setPendingAuthenticationStrategyUndefined: Self = StObject.set(x, "PendingAuthenticationStrategy", js.undefined)
    
    inline def setPendingEngineVersion(value: string): Self = StObject.set(x, "PendingEngineVersion", value.asInstanceOf[js.Any])
    
    inline def setPendingEngineVersionUndefined: Self = StObject.set(x, "PendingEngineVersion", js.undefined)
    
    inline def setPendingHostInstanceType(value: string): Self = StObject.set(x, "PendingHostInstanceType", value.asInstanceOf[js.Any])
    
    inline def setPendingHostInstanceTypeUndefined: Self = StObject.set(x, "PendingHostInstanceType", js.undefined)
    
    inline def setPendingLdapServerMetadata(value: LdapServerMetadataOutput): Self = StObject.set(x, "PendingLdapServerMetadata", value.asInstanceOf[js.Any])
    
    inline def setPendingLdapServerMetadataUndefined: Self = StObject.set(x, "PendingLdapServerMetadata", js.undefined)
    
    inline def setPendingSecurityGroups(value: listOfString): Self = StObject.set(x, "PendingSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setPendingSecurityGroupsUndefined: Self = StObject.set(x, "PendingSecurityGroups", js.undefined)
    
    inline def setPendingSecurityGroupsVarargs(value: string*): Self = StObject.set(x, "PendingSecurityGroups", js.Array(value*))
    
    inline def setPubliclyAccessible(value: boolean): Self = StObject.set(x, "PubliclyAccessible", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "PubliclyAccessible", js.undefined)
    
    inline def setSecurityGroups(value: listOfString): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: string*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setStorageType(value: BrokerStorageType): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    inline def setSubnetIds(value: listOfString): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: string*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setUsers(value: listOfUserSummary): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "Users", js.undefined)
    
    inline def setUsersVarargs(value: UserSummary*): Self = StObject.set(x, "Users", js.Array(value*))
  }
}
