package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMembersResponse extends js.Object {
  /**
    * A list of account ID and email address pairs of the AWS accounts that couldn't be processed. 
    */
  var UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined
}

object DeleteMembersResponse {
  @scala.inline
  def apply(UnprocessedAccounts: ResultList = null): DeleteMembersResponse = {
    val __obj = js.Dynamic.literal()
    if (UnprocessedAccounts != null) __obj.updateDynamic("UnprocessedAccounts")(UnprocessedAccounts)
    __obj.asInstanceOf[DeleteMembersResponse]
  }
}

