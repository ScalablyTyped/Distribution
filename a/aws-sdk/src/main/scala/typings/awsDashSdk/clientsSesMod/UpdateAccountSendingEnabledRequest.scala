package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAccountSendingEnabledRequest extends js.Object {
  /**
    * Describes whether email sending is enabled or disabled for your Amazon SES account in the current AWS Region.
    */
  var Enabled: js.UndefOr[typings.awsDashSdk.clientsSesMod.Enabled] = js.native
}

object UpdateAccountSendingEnabledRequest {
  @scala.inline
  def apply(Enabled: js.UndefOr[Boolean] = js.undefined): UpdateAccountSendingEnabledRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAccountSendingEnabledRequest]
  }
}

