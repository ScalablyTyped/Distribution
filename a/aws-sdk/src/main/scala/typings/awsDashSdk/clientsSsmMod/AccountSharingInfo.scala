package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountSharingInfo extends js.Object {
  /**
    * The AWS account ID where the current document is shared.
    */
  var AccountId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AccountId] = js.native
  /**
    * The version of the current document shared with the account.
    */
  var SharedDocumentVersion: js.UndefOr[typings.awsDashSdk.clientsSsmMod.SharedDocumentVersion] = js.native
}

object AccountSharingInfo {
  @scala.inline
  def apply(AccountId: AccountId = null, SharedDocumentVersion: SharedDocumentVersion = null): AccountSharingInfo = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (SharedDocumentVersion != null) __obj.updateDynamic("SharedDocumentVersion")(SharedDocumentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountSharingInfo]
  }
}

