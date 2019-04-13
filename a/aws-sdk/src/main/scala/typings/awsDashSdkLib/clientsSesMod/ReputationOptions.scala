package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReputationOptions extends js.Object {
  /**
    * The date and time at which the reputation metrics for the configuration set were last reset. Resetting these metrics is known as a fresh start. When you disable email sending for a configuration set using UpdateConfigurationSetSendingEnabled and later re-enable it, the reputation metrics for the configuration set (but not for the entire Amazon SES account) are reset. If email sending for the configuration set has never been disabled and later re-enabled, the value of this attribute is null.
    */
  var LastFreshStart: js.UndefOr[LastFreshStart] = js.undefined
  /**
    * Describes whether or not Amazon SES publishes reputation metrics for the configuration set, such as bounce and complaint rates, to Amazon CloudWatch. If the value is true, reputation metrics are published. If the value is false, reputation metrics are not published. The default value is false.
    */
  var ReputationMetricsEnabled: js.UndefOr[Enabled] = js.undefined
  /**
    * Describes whether email sending is enabled or disabled for the configuration set. If the value is true, then Amazon SES will send emails that use the configuration set. If the value is false, Amazon SES will not send emails that use the configuration set. The default value is true. You can change this setting using UpdateConfigurationSetSendingEnabled.
    */
  var SendingEnabled: js.UndefOr[Enabled] = js.undefined
}

object ReputationOptions {
  @scala.inline
  def apply(
    LastFreshStart: LastFreshStart = null,
    ReputationMetricsEnabled: js.UndefOr[Enabled] = js.undefined,
    SendingEnabled: js.UndefOr[Enabled] = js.undefined
  ): ReputationOptions = {
    val __obj = js.Dynamic.literal()
    if (LastFreshStart != null) __obj.updateDynamic("LastFreshStart")(LastFreshStart)
    if (!js.isUndefined(ReputationMetricsEnabled)) __obj.updateDynamic("ReputationMetricsEnabled")(ReputationMetricsEnabled)
    if (!js.isUndefined(SendingEnabled)) __obj.updateDynamic("SendingEnabled")(SendingEnabled)
    __obj.asInstanceOf[ReputationOptions]
  }
}

