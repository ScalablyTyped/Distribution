package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBrokerRequest extends StObject {
  
  /**
    * Optional. The authentication strategy used to secure the broker. The default is SIMPLE.
    */
  var AuthenticationStrategy: js.UndefOr[typings.awsSdk.clientsMqMod.AuthenticationStrategy] = js.undefined
  
  /**
    * Enables automatic upgrades to new minor versions for brokers, as new versions are released and supported by Amazon MQ. Automatic upgrades occur during the scheduled maintenance window of the broker or after a manual broker reboot. Set to true by default, if no value is specified.
    */
  var AutoMinorVersionUpgrade: boolean
  
  /**
    * Required. The broker's name. This value must be unique in your AWS account, 1-50 characters long, must contain only letters, numbers, dashes, and underscores, and must not contain white spaces, brackets, wildcard characters, or special characters.
    */
  var BrokerName: string
  
  /**
    * A list of information about the configuration.
    */
  var Configuration: js.UndefOr[ConfigurationId] = js.undefined
  
  /**
    * The unique ID that the requester receives for the created broker. Amazon MQ passes your ID with the API action. Note: We recommend using a Universally Unique Identifier (UUID) for the creatorRequestId. You may omit the creatorRequestId if your application doesn't require idempotency.
    */
  var CreatorRequestId: js.UndefOr[string] = js.undefined
  
  /**
    * Required. The broker's deployment mode.
    */
  var DeploymentMode: typings.awsSdk.clientsMqMod.DeploymentMode
  
  /**
    * Encryption options for the broker. Does not apply to RabbitMQ brokers.
    */
  var EncryptionOptions: js.UndefOr[typings.awsSdk.clientsMqMod.EncryptionOptions] = js.undefined
  
  /**
    * Required. The type of broker engine. Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
    */
  var EngineType: typings.awsSdk.clientsMqMod.EngineType
  
  /**
    * Required. The broker engine's version. For a list of supported engine versions, see Supported engines.
    */
  var EngineVersion: string
  
  /**
    * Required. The broker's instance type.
    */
  var HostInstanceType: string
  
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
    * Enables connections from applications outside of the VPC that hosts the broker's subnets. Set to false by default, if no value is provided.
    */
  var PubliclyAccessible: boolean
  
  /**
    * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
    */
  var SecurityGroups: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The broker's storage type.
    */
  var StorageType: js.UndefOr[BrokerStorageType] = js.undefined
  
  /**
    * The list of groups that define which subnets and IP ranges the broker can use from different Availability Zones. If you specify more than one subnet, the subnets must be in different Availability Zones. Amazon MQ will not be able to create VPC endpoints for your broker with multiple subnets in the same Availability Zone. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An ACTIVE_STANDBY_MULTI_AZ Amazon MQ for ActiveMQ deployment requires two subnets. A CLUSTER_MULTI_AZ Amazon MQ for RabbitMQ deployment has no subnet requirements when deployed with public accessibility. Deployment without public accessibility requires at least one subnet. If you specify subnets in a shared VPC for a RabbitMQ broker, the associated VPC to which the specified subnets belong must be owned by your AWS account. Amazon MQ will not be able to create VPC endpoints in VPCs that are not owned by your AWS account.
    */
  var SubnetIds: js.UndefOr[listOfString] = js.undefined
  
  /**
    * Create tags when creating the broker.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
  
  /**
    * Required. The list of broker users (persons or applications) who can access queues and topics. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long. Amazon MQ for RabbitMQ When you create an Amazon MQ for RabbitMQ broker, one and only one administrative user is accepted and created when a broker is first provisioned. All subsequent broker users are created by making RabbitMQ API calls directly to brokers or via the RabbitMQ web console.
    */
  var Users: listOfUser
}
object CreateBrokerRequest {
  
  inline def apply(
    AutoMinorVersionUpgrade: boolean,
    BrokerName: string,
    DeploymentMode: DeploymentMode,
    EngineType: EngineType,
    EngineVersion: string,
    HostInstanceType: string,
    PubliclyAccessible: boolean,
    Users: listOfUser
  ): CreateBrokerRequest = {
    val __obj = js.Dynamic.literal(AutoMinorVersionUpgrade = AutoMinorVersionUpgrade.asInstanceOf[js.Any], BrokerName = BrokerName.asInstanceOf[js.Any], DeploymentMode = DeploymentMode.asInstanceOf[js.Any], EngineType = EngineType.asInstanceOf[js.Any], EngineVersion = EngineVersion.asInstanceOf[js.Any], HostInstanceType = HostInstanceType.asInstanceOf[js.Any], PubliclyAccessible = PubliclyAccessible.asInstanceOf[js.Any], Users = Users.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBrokerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBrokerRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationStrategy(value: AuthenticationStrategy): Self = StObject.set(x, "AuthenticationStrategy", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationStrategyUndefined: Self = StObject.set(x, "AuthenticationStrategy", js.undefined)
    
    inline def setAutoMinorVersionUpgrade(value: boolean): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setBrokerName(value: string): Self = StObject.set(x, "BrokerName", value.asInstanceOf[js.Any])
    
    inline def setConfiguration(value: ConfigurationId): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setCreatorRequestId(value: string): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    inline def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
    
    inline def setDeploymentMode(value: DeploymentMode): Self = StObject.set(x, "DeploymentMode", value.asInstanceOf[js.Any])
    
    inline def setEncryptionOptions(value: EncryptionOptions): Self = StObject.set(x, "EncryptionOptions", value.asInstanceOf[js.Any])
    
    inline def setEncryptionOptionsUndefined: Self = StObject.set(x, "EncryptionOptions", js.undefined)
    
    inline def setEngineType(value: EngineType): Self = StObject.set(x, "EngineType", value.asInstanceOf[js.Any])
    
    inline def setEngineVersion(value: string): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setHostInstanceType(value: string): Self = StObject.set(x, "HostInstanceType", value.asInstanceOf[js.Any])
    
    inline def setLdapServerMetadata(value: LdapServerMetadataInput): Self = StObject.set(x, "LdapServerMetadata", value.asInstanceOf[js.Any])
    
    inline def setLdapServerMetadataUndefined: Self = StObject.set(x, "LdapServerMetadata", js.undefined)
    
    inline def setLogs(value: Logs): Self = StObject.set(x, "Logs", value.asInstanceOf[js.Any])
    
    inline def setLogsUndefined: Self = StObject.set(x, "Logs", js.undefined)
    
    inline def setMaintenanceWindowStartTime(value: WeeklyStartTime): Self = StObject.set(x, "MaintenanceWindowStartTime", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceWindowStartTimeUndefined: Self = StObject.set(x, "MaintenanceWindowStartTime", js.undefined)
    
    inline def setPubliclyAccessible(value: boolean): Self = StObject.set(x, "PubliclyAccessible", value.asInstanceOf[js.Any])
    
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
    
    inline def setUsers(value: listOfUser): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: User*): Self = StObject.set(x, "Users", js.Array(value*))
  }
}
