package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAccountResponse extends js.Object {
  /**
    * The Amazon Chime account details.
    */
  var Account: js.UndefOr[typings.awsDashSdk.clientsChimeMod.Account] = js.undefined
}

object CreateAccountResponse {
  @scala.inline
  def apply(Account: Account = null): CreateAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (Account != null) __obj.updateDynamic("Account")(Account)
    __obj.asInstanceOf[CreateAccountResponse]
  }
}

