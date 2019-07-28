package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccountResponse extends js.Object {
  /**
    * The Amazon Chime account details.
    */
  var Account: js.UndefOr[typings.awsDashSdk.clientsChimeMod.Account] = js.undefined
}

object GetAccountResponse {
  @scala.inline
  def apply(Account: Account = null): GetAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (Account != null) __obj.updateDynamic("Account")(Account)
    __obj.asInstanceOf[GetAccountResponse]
  }
}

