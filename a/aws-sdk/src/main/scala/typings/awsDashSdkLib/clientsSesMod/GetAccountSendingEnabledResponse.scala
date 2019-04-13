package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccountSendingEnabledResponse extends js.Object {
  /**
    * Describes whether email sending is enabled or disabled for your Amazon SES account in the current AWS Region.
    */
  var Enabled: js.UndefOr[Enabled] = js.undefined
}

object GetAccountSendingEnabledResponse {
  @scala.inline
  def apply(Enabled: js.UndefOr[Enabled] = js.undefined): GetAccountSendingEnabledResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    __obj.asInstanceOf[GetAccountSendingEnabledResponse]
  }
}

