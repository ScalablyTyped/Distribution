package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAccountDedicatedIpWarmupAttributesRequest extends js.Object {
  /**
    * Enables or disables the automatic warm-up feature for dedicated IP addresses that are associated with your Amazon Pinpoint account in the current AWS Region. Set to true to enable the automatic warm-up feature, or set to false to disable it.
    */
  var AutoWarmupEnabled: js.UndefOr[Enabled] = js.native
}

object PutAccountDedicatedIpWarmupAttributesRequest {
  @scala.inline
  def apply(AutoWarmupEnabled: js.UndefOr[Boolean] = js.undefined): PutAccountDedicatedIpWarmupAttributesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoWarmupEnabled)) __obj.updateDynamic("AutoWarmupEnabled")(AutoWarmupEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAccountDedicatedIpWarmupAttributesRequest]
  }
}

