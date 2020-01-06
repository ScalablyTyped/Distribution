package typings.awsDashSdk.clientsSsoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountInfo extends js.Object {
  /**
    * The identifier of the AWS account that is assigned to the user.
    */
  var accountId: js.UndefOr[AccountIdType] = js.native
  /**
    * The display name of the AWS account that is assigned to the user.
    */
  var accountName: js.UndefOr[AccountNameType] = js.native
  /**
    * The email address of the AWS account that is assigned to the user.
    */
  var emailAddress: js.UndefOr[EmailAddressType] = js.native
}

object AccountInfo {
  @scala.inline
  def apply(
    accountId: AccountIdType = null,
    accountName: AccountNameType = null,
    emailAddress: EmailAddressType = null
  ): AccountInfo = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (accountName != null) __obj.updateDynamic("accountName")(accountName.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
}

