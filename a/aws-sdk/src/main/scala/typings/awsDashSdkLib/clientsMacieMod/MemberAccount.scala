package typings
package awsDashSdkLib.clientsMacieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberAccount extends js.Object {
  /**
    * The AWS account ID of the Amazon Macie member account.
    */
  var accountId: js.UndefOr[AWSAccountId] = js.undefined
}

object MemberAccount {
  @scala.inline
  def apply(accountId: AWSAccountId = null): MemberAccount = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    __obj.asInstanceOf[MemberAccount]
  }
}

