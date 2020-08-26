package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceAccountCredentials extends js.Object {
  /**
    * The user name of the account. This account must have the following privileges: create computer objects, join computers to the domain, and change/reset the password on descendant computer objects for the organizational units specified.
    */
  var AccountName: typings.awsSdk.appstreamMod.AccountName = js.native
  /**
    * The password for the account.
    */
  var AccountPassword: typings.awsSdk.appstreamMod.AccountPassword = js.native
}

object ServiceAccountCredentials {
  @scala.inline
  def apply(AccountName: AccountName, AccountPassword: AccountPassword): ServiceAccountCredentials = {
    val __obj = js.Dynamic.literal(AccountName = AccountName.asInstanceOf[js.Any], AccountPassword = AccountPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceAccountCredentials]
  }
  @scala.inline
  implicit class ServiceAccountCredentialsOps[Self <: ServiceAccountCredentials] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountName(value: AccountName): Self = this.set("AccountName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccountPassword(value: AccountPassword): Self = this.set("AccountPassword", value.asInstanceOf[js.Any])
  }
  
}

