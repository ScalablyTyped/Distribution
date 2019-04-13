package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMembersRequest extends js.Object {
  /**
    * A list of account IDs for the Security Hub member accounts on which you want to return the details. 
    */
  var AccountIds: AccountIdList
}

object GetMembersRequest {
  @scala.inline
  def apply(AccountIds: AccountIdList): GetMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds)
  
    __obj.asInstanceOf[GetMembersRequest]
  }
}

