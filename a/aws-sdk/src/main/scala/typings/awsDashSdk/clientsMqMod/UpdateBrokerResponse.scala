package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBrokerResponse extends js.Object {
  /**
    * The new value of automatic upgrades to new minor version for brokers.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[__boolean] = js.undefined
  /**
    * Required. The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the updated configuration.
    */
  var Configuration: js.UndefOr[ConfigurationId] = js.undefined
  /**
    * The version of the broker engine to upgrade to. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
    */
  var EngineVersion: js.UndefOr[__string] = js.undefined
  /**
    * The list of information about logs to be enabled for the specified broker.
    */
  var Logs: js.UndefOr[typings.awsDashSdk.clientsMqMod.Logs] = js.undefined
}

object UpdateBrokerResponse {
  @scala.inline
  def apply(
    AutoMinorVersionUpgrade: js.UndefOr[__boolean] = js.undefined,
    BrokerId: __string = null,
    Configuration: ConfigurationId = null,
    EngineVersion: __string = null,
    Logs: Logs = null
  ): UpdateBrokerResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoMinorVersionUpgrade)) __obj.updateDynamic("AutoMinorVersionUpgrade")(AutoMinorVersionUpgrade)
    if (BrokerId != null) __obj.updateDynamic("BrokerId")(BrokerId)
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (Logs != null) __obj.updateDynamic("Logs")(Logs)
    __obj.asInstanceOf[UpdateBrokerResponse]
  }
}

