package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBrokerRequest extends js.Object {
  /**
    * Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[__boolean] = js.undefined
  /**
    * Required. The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or special characters.
    */
  var BrokerName: js.UndefOr[__string] = js.undefined
  /**
    * A list of information about the configuration.
    */
  var Configuration: js.UndefOr[ConfigurationId] = js.undefined
  /**
    * The unique ID that the requester receives for the created broker. Amazon MQ passes your ID with the API action. Note: We recommend using a Universally Unique Identifier (UUID) for the creatorRequestId. You may omit the creatorRequestId if your application doesn't require idempotency.
    */
  var CreatorRequestId: js.UndefOr[__string] = js.undefined
  /**
    * Required. The deployment mode of the broker.
    */
  var DeploymentMode: js.UndefOr[typings.awsDashSdk.clientsMqMod.DeploymentMode] = js.undefined
  /**
    * Encryption options for the broker.
    */
  var EncryptionOptions: js.UndefOr[typings.awsDashSdk.clientsMqMod.EncryptionOptions] = js.undefined
  /**
    * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
    */
  var EngineType: js.UndefOr[typings.awsDashSdk.clientsMqMod.EngineType] = js.undefined
  /**
    * Required. The version of the broker engine. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
    */
  var EngineVersion: js.UndefOr[__string] = js.undefined
  /**
    * Required. The broker's instance type.
    */
  var HostInstanceType: js.UndefOr[__string] = js.undefined
  /**
    * Enables Amazon CloudWatch logging for brokers.
    */
  var Logs: js.UndefOr[typings.awsDashSdk.clientsMqMod.Logs] = js.undefined
  /**
    * The parameters that determine the WeeklyStartTime.
    */
  var MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime] = js.undefined
  /**
    * Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
    */
  var PubliclyAccessible: js.UndefOr[__boolean] = js.undefined
  /**
    * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
    */
  var SecurityGroups: js.UndefOr[__listOf__string] = js.undefined
  /**
    * The list of groups (2 maximum) that define which subnets and IP ranges the broker can use from different Availability Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An ACTIVE_STANDBY_MULTI_AZ deployment requires two subnets.
    */
  var SubnetIds: js.UndefOr[__listOf__string] = js.undefined
  /**
    * Create tags when creating the broker.
    */
  var Tags: js.UndefOr[__mapOf__string] = js.undefined
  /**
    * Required. The list of ActiveMQ users (persons or applications) who can access queues and topics. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Users: js.UndefOr[__listOfUser] = js.undefined
}

object CreateBrokerRequest {
  @scala.inline
  def apply(
    AutoMinorVersionUpgrade: js.UndefOr[__boolean] = js.undefined,
    BrokerName: __string = null,
    Configuration: ConfigurationId = null,
    CreatorRequestId: __string = null,
    DeploymentMode: DeploymentMode = null,
    EncryptionOptions: EncryptionOptions = null,
    EngineType: EngineType = null,
    EngineVersion: __string = null,
    HostInstanceType: __string = null,
    Logs: Logs = null,
    MaintenanceWindowStartTime: WeeklyStartTime = null,
    PubliclyAccessible: js.UndefOr[__boolean] = js.undefined,
    SecurityGroups: __listOf__string = null,
    SubnetIds: __listOf__string = null,
    Tags: __mapOf__string = null,
    Users: __listOfUser = null
  ): CreateBrokerRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoMinorVersionUpgrade)) __obj.updateDynamic("AutoMinorVersionUpgrade")(AutoMinorVersionUpgrade)
    if (BrokerName != null) __obj.updateDynamic("BrokerName")(BrokerName)
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration)
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId)
    if (DeploymentMode != null) __obj.updateDynamic("DeploymentMode")(DeploymentMode.asInstanceOf[js.Any])
    if (EncryptionOptions != null) __obj.updateDynamic("EncryptionOptions")(EncryptionOptions)
    if (EngineType != null) __obj.updateDynamic("EngineType")(EngineType.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (HostInstanceType != null) __obj.updateDynamic("HostInstanceType")(HostInstanceType)
    if (Logs != null) __obj.updateDynamic("Logs")(Logs)
    if (MaintenanceWindowStartTime != null) __obj.updateDynamic("MaintenanceWindowStartTime")(MaintenanceWindowStartTime)
    if (!js.isUndefined(PubliclyAccessible)) __obj.updateDynamic("PubliclyAccessible")(PubliclyAccessible)
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups)
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (Users != null) __obj.updateDynamic("Users")(Users)
    __obj.asInstanceOf[CreateBrokerRequest]
  }
}

