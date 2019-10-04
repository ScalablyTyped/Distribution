package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBrokerRequest extends js.Object {
  /**
    * Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[__boolean] = js.undefined
  /**
    * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or special characters.
    */
  var BrokerId: __string
  /**
    * A list of information about the configuration.
    */
  var Configuration: js.UndefOr[ConfigurationId] = js.undefined
  /**
    * The version of the broker engine. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
    */
  var EngineVersion: js.UndefOr[__string] = js.undefined
  /**
    * The host instance type of the broker to upgrade to. For a list of supported instance types, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide//broker.html#broker-instance-types
    */
  var HostInstanceType: js.UndefOr[__string] = js.undefined
  /**
    * Enables Amazon CloudWatch logging for brokers.
    */
  var Logs: js.UndefOr[typings.awsDashSdk.clientsMqMod.Logs] = js.undefined
  /**
    * The list of security groups (1 minimum, 5 maximum) that authorize connections to brokers.
    */
  var SecurityGroups: js.UndefOr[__listOf__string] = js.undefined
}

object UpdateBrokerRequest {
  @scala.inline
  def apply(
    BrokerId: __string,
    AutoMinorVersionUpgrade: js.UndefOr[__boolean] = js.undefined,
    Configuration: ConfigurationId = null,
    EngineVersion: __string = null,
    HostInstanceType: __string = null,
    Logs: Logs = null,
    SecurityGroups: __listOf__string = null
  ): UpdateBrokerRequest = {
    val __obj = js.Dynamic.literal(BrokerId = BrokerId)
    if (!js.isUndefined(AutoMinorVersionUpgrade)) __obj.updateDynamic("AutoMinorVersionUpgrade")(AutoMinorVersionUpgrade)
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (HostInstanceType != null) __obj.updateDynamic("HostInstanceType")(HostInstanceType)
    if (Logs != null) __obj.updateDynamic("Logs")(Logs)
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups)
    __obj.asInstanceOf[UpdateBrokerRequest]
  }
}

