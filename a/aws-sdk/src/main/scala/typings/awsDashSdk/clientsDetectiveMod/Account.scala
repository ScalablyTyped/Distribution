package typings.awsDashSdk.clientsDetectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  /**
    * The account identifier of the AWS account.
    */
  var AccountId: typings.awsDashSdk.clientsDetectiveMod.AccountId = js.native
  /**
    * The AWS account root user email address for the AWS account.
    */
  var EmailAddress: typings.awsDashSdk.clientsDetectiveMod.EmailAddress = js.native
}

object Account {
  @scala.inline
  def apply(AccountId: AccountId, EmailAddress: EmailAddress): Account = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Account]
  }
}

