package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccountCredentials extends js.Object {
  /**
    * The user name of the account. This account must have the following privileges: create computer objects, join computers to the domain, and change/reset the password on descendant computer objects for the organizational units specified.
    */
  var AccountName: awsDashSdkLib.clientsAppstreamMod.AccountName
  /**
    * The password for the account.
    */
  var AccountPassword: awsDashSdkLib.clientsAppstreamMod.AccountPassword
}

object ServiceAccountCredentials {
  @scala.inline
  def apply(AccountName: AccountName, AccountPassword: AccountPassword): ServiceAccountCredentials = {
    val __obj = js.Dynamic.literal(AccountName = AccountName, AccountPassword = AccountPassword)
  
    __obj.asInstanceOf[ServiceAccountCredentials]
  }
}

