package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceAccountCredentials extends js.Object {
  /**
    * The user name of the account. This account must have the following privileges: create computer objects, join computers to the domain, and change/reset the password on descendant computer objects for the organizational units specified.
    */
  var AccountName: typings.awsDashSdk.clientsAppstreamMod.AccountName = js.native
  /**
    * The password for the account.
    */
  var AccountPassword: typings.awsDashSdk.clientsAppstreamMod.AccountPassword = js.native
}

object ServiceAccountCredentials {
  @scala.inline
  def apply(AccountName: AccountName, AccountPassword: AccountPassword): ServiceAccountCredentials = {
    val __obj = js.Dynamic.literal(AccountName = AccountName.asInstanceOf[js.Any], AccountPassword = AccountPassword.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServiceAccountCredentials]
  }
}

