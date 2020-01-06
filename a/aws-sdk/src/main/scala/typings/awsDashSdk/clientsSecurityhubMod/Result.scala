package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  /**
    * An AWS account ID of the account that wasn't be processed.
    */
  var AccountId: js.UndefOr[typings.awsDashSdk.clientsSecurityhubMod.AccountId] = js.native
  /**
    * The reason that the account wasn't be processed.
    */
  var ProcessingResult: js.UndefOr[NonEmptyString] = js.native
}

object Result {
  @scala.inline
  def apply(AccountId: AccountId = null, ProcessingResult: NonEmptyString = null): Result = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (ProcessingResult != null) __obj.updateDynamic("ProcessingResult")(ProcessingResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

