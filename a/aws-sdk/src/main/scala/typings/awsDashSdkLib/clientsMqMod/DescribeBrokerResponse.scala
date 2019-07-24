package typings
package awsDashSdkLib.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBrokerResponse extends js.Object {
  /**
    * Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[__boolean] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the broker.
    */
  var BrokerArn: js.UndefOr[__string] = js.undefined
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[__string] = js.undefined
  /**
    * A list of information about allocated brokers.
    */
  var BrokerInstances: js.UndefOr[__listOfBrokerInstance] = js.undefined
  /**
    * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or special characters.
    */
  var BrokerName: js.UndefOr[__string] = js.undefined
  /**
    * The status of the broker.
    */
  var BrokerState: js.UndefOr[BrokerState] = js.undefined
  /**
    * The list of all revisions for the specified configuration.
    */
  var Configurations: js.UndefOr[Configurations] = js.undefined
  /**
    * The time when the broker was created.
    */
  var Created: js.UndefOr[__timestampIso8601] = js.undefined
  /**
    * Required. The deployment mode of the broker.
    */
  var DeploymentMode: js.UndefOr[DeploymentMode] = js.undefined
  /**
    * Encryption options for the broker.
    */
  var EncryptionOptions: js.UndefOr[EncryptionOptions] = js.undefined
  /**
    * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
    */
  var EngineType: js.UndefOr[EngineType] = js.undefined
  /**
    * The version of the broker engine. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
    */
  var EngineVersion: js.UndefOr[__string] = js.undefined
  /**
    * The broker's instance type.
    */
  var HostInstanceType: js.UndefOr[__string] = js.undefined
  /**
    * The list of information about logs currently enabled and pending to be deployed for the specified broker.
    */
  var Logs: js.UndefOr[LogsSummary] = js.undefined
  /**
    * The parameters that determine the WeeklyStartTime.
    */
  var MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime] = js.undefined
  /**
    * The version of the broker engine to upgrade to. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
    */
  var PendingEngineVersion: js.UndefOr[__string] = js.undefined
  /**
    * Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
    */
  var PubliclyAccessible: js.UndefOr[__boolean] = js.undefined
  /**
    * Required. The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
    */
  var SecurityGroups: js.UndefOr[__listOf__string] = js.undefined
  /**
    * The list of groups (2 maximum) that define which subnets and IP ranges the broker can use from different Availability Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An ACTIVE_STANDBY_MULTI_AZ deployment requires two subnets.
    */
  var SubnetIds: js.UndefOr[__listOf__string] = js.undefined
  /**
    * The list of all tags associated with this broker.
    */
  var Tags: js.UndefOr[__mapOf__string] = js.undefined
  /**
    * The list of all ActiveMQ usernames for the specified broker.
    */
  var Users: js.UndefOr[__listOfUserSummary] = js.undefined
}

object DescribeBrokerResponse {
  @scala.inline
  def apply(
    AutoMinorVersionUpgrade: js.UndefOr[__boolean] = js.undefined,
    BrokerArn: __string = null,
    BrokerId: __string = null,
    BrokerInstances: __listOfBrokerInstance = null,
    BrokerName: __string = null,
    BrokerState: BrokerState = null,
    Configurations: Configurations = null,
    Created: __timestampIso8601 = null,
    DeploymentMode: DeploymentMode = null,
    EncryptionOptions: EncryptionOptions = null,
    EngineType: EngineType = null,
    EngineVersion: __string = null,
    HostInstanceType: __string = null,
    Logs: LogsSummary = null,
    MaintenanceWindowStartTime: WeeklyStartTime = null,
    PendingEngineVersion: __string = null,
    PubliclyAccessible: js.UndefOr[__boolean] = js.undefined,
    SecurityGroups: __listOf__string = null,
    SubnetIds: __listOf__string = null,
    Tags: __mapOf__string = null,
    Users: __listOfUserSummary = null
  ): DescribeBrokerResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoMinorVersionUpgrade)) __obj.updateDynamic("AutoMinorVersionUpgrade")(AutoMinorVersionUpgrade)
    if (BrokerArn != null) __obj.updateDynamic("BrokerArn")(BrokerArn)
    if (BrokerId != null) __obj.updateDynamic("BrokerId")(BrokerId)
    if (BrokerInstances != null) __obj.updateDynamic("BrokerInstances")(BrokerInstances)
    if (BrokerName != null) __obj.updateDynamic("BrokerName")(BrokerName)
    if (BrokerState != null) __obj.updateDynamic("BrokerState")(BrokerState.asInstanceOf[js.Any])
    if (Configurations != null) __obj.updateDynamic("Configurations")(Configurations)
    if (Created != null) __obj.updateDynamic("Created")(Created)
    if (DeploymentMode != null) __obj.updateDynamic("DeploymentMode")(DeploymentMode.asInstanceOf[js.Any])
    if (EncryptionOptions != null) __obj.updateDynamic("EncryptionOptions")(EncryptionOptions)
    if (EngineType != null) __obj.updateDynamic("EngineType")(EngineType.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (HostInstanceType != null) __obj.updateDynamic("HostInstanceType")(HostInstanceType)
    if (Logs != null) __obj.updateDynamic("Logs")(Logs)
    if (MaintenanceWindowStartTime != null) __obj.updateDynamic("MaintenanceWindowStartTime")(MaintenanceWindowStartTime)
    if (PendingEngineVersion != null) __obj.updateDynamic("PendingEngineVersion")(PendingEngineVersion)
    if (!js.isUndefined(PubliclyAccessible)) __obj.updateDynamic("PubliclyAccessible")(PubliclyAccessible)
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups)
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (Users != null) __obj.updateDynamic("Users")(Users)
    __obj.asInstanceOf[DescribeBrokerResponse]
  }
}

