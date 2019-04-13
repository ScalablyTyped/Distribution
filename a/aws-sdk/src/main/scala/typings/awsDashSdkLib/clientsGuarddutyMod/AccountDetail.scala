package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountDetail extends js.Object {
  /**
    * Member account ID.
    */
  var AccountId: awsDashSdkLib.clientsGuarddutyMod.AccountId
  /**
    * Member account's email address.
    */
  var Email: awsDashSdkLib.clientsGuarddutyMod.Email
}

object AccountDetail {
  @scala.inline
  def apply(AccountId: AccountId, Email: Email): AccountDetail = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, Email = Email)
  
    __obj.asInstanceOf[AccountDetail]
  }
}

