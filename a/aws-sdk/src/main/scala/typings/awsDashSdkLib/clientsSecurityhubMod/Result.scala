package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  /**
    * An AWS account ID of the account that wasn't be processed.
    */
  var AccountId: js.UndefOr[AccountId] = js.undefined
  /**
    * The reason that the account wasn't be processed.
    */
  var ProcessingResult: js.UndefOr[NonEmptyString] = js.undefined
}

object Result {
  @scala.inline
  def apply(AccountId: AccountId = null, ProcessingResult: NonEmptyString = null): Result = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    if (ProcessingResult != null) __obj.updateDynamic("ProcessingResult")(ProcessingResult)
    __obj.asInstanceOf[Result]
  }
}

