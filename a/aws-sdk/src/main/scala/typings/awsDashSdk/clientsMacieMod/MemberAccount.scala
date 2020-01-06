package typings.awsDashSdk.clientsMacieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberAccount extends js.Object {
  /**
    * The AWS account ID of the Amazon Macie member account.
    */
  var accountId: js.UndefOr[AWSAccountId] = js.native
}

object MemberAccount {
  @scala.inline
  def apply(accountId: AWSAccountId = null): MemberAccount = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberAccount]
  }
}

