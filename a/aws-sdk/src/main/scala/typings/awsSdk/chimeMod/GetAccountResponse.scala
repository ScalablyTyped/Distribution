package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccountResponse extends js.Object {
  /**
    * The Amazon Chime account details.
    */
  var Account: js.UndefOr[typings.awsSdk.chimeMod.Account] = js.native
}

object GetAccountResponse {
  @scala.inline
  def apply(Account: Account = null): GetAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (Account != null) __obj.updateDynamic("Account")(Account.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccountResponse]
  }
}

