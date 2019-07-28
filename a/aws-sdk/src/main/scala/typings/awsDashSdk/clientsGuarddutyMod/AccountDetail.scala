package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountDetail extends js.Object {
  /**
    * Member account ID.
    */
  var AccountId: typings.awsDashSdk.clientsGuarddutyMod.AccountId
  /**
    * Member account's email address.
    */
  var Email: typings.awsDashSdk.clientsGuarddutyMod.Email
}

object AccountDetail {
  @scala.inline
  def apply(AccountId: AccountId, Email: Email): AccountDetail = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, Email = Email)
  
    __obj.asInstanceOf[AccountDetail]
  }
}

