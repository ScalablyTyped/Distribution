package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUserImportJobsResponse extends js.Object {
  /**
    * An identifier that can be used to return the next set of user import jobs in the list.
    */
  var PaginationToken: js.UndefOr[PaginationKeyType] = js.undefined
  /**
    * The user import jobs.
    */
  var UserImportJobs: js.UndefOr[UserImportJobsListType] = js.undefined
}

object ListUserImportJobsResponse {
  @scala.inline
  def apply(PaginationToken: PaginationKeyType = null, UserImportJobs: UserImportJobsListType = null): ListUserImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken)
    if (UserImportJobs != null) __obj.updateDynamic("UserImportJobs")(UserImportJobs)
    __obj.asInstanceOf[ListUserImportJobsResponse]
  }
}

