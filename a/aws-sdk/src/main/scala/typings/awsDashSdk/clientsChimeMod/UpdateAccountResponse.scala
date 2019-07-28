package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAccountResponse extends js.Object {
  /**
    * The updated Amazon Chime account details.
    */
  var Account: js.UndefOr[typings.awsDashSdk.clientsChimeMod.Account] = js.undefined
}

object UpdateAccountResponse {
  @scala.inline
  def apply(Account: Account = null): UpdateAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (Account != null) __obj.updateDynamic("Account")(Account)
    __obj.asInstanceOf[UpdateAccountResponse]
  }
}

