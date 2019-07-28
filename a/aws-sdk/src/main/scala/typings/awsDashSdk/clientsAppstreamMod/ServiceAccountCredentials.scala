package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccountCredentials extends js.Object {
  /**
    * The user name of the account. This account must have the following privileges: create computer objects, join computers to the domain, and change/reset the password on descendant computer objects for the organizational units specified.
    */
  var AccountName: typings.awsDashSdk.clientsAppstreamMod.AccountName
  /**
    * The password for the account.
    */
  var AccountPassword: typings.awsDashSdk.clientsAppstreamMod.AccountPassword
}

object ServiceAccountCredentials {
  @scala.inline
  def apply(AccountName: AccountName, AccountPassword: AccountPassword): ServiceAccountCredentials = {
    val __obj = js.Dynamic.literal(AccountName = AccountName, AccountPassword = AccountPassword)
  
    __obj.asInstanceOf[ServiceAccountCredentials]
  }
}

