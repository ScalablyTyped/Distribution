package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountDetails extends js.Object {
  /**
    * The ID of an AWS account.
    */
  var AccountId: js.UndefOr[AccountId] = js.undefined
  /**
    * The email of an AWS account.
    */
  var Email: js.UndefOr[NonEmptyString] = js.undefined
}

object AccountDetails {
  @scala.inline
  def apply(AccountId: AccountId = null, Email: NonEmptyString = null): AccountDetails = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    if (Email != null) __obj.updateDynamic("Email")(Email)
    __obj.asInstanceOf[AccountDetails]
  }
}

