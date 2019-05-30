package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  /**
    * An ID of the AWS account that couldn't be processed. 
    */
  var AccountId: js.UndefOr[AccountId] = js.undefined
  /**
    * The reason for why an account couldn't be processed.
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

