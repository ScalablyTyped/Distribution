package typings.awsDashSdk.clientsDetectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnprocessedAccount extends js.Object {
  /**
    * The AWS account identifier of the member account that was not processed.
    */
  var AccountId: js.UndefOr[typings.awsDashSdk.clientsDetectiveMod.AccountId] = js.native
  /**
    * The reason that the member account request could not be processed.
    */
  var Reason: js.UndefOr[UnprocessedReason] = js.native
}

object UnprocessedAccount {
  @scala.inline
  def apply(AccountId: AccountId = null, Reason: UnprocessedReason = null): UnprocessedAccount = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (Reason != null) __obj.updateDynamic("Reason")(Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnprocessedAccount]
  }
}

