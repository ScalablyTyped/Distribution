package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUserImportJobsRequest extends js.Object {
  /**
    * The maximum number of import jobs you want the request to return.
    */
  var MaxResults: PoolQueryLimitType
  /**
    * An identifier that was returned from the previous call to ListUserImportJobs, which can be used to return the next set of import jobs in the list.
    */
  var PaginationToken: js.UndefOr[PaginationKeyType] = js.undefined
  /**
    * The user pool ID for the user pool that the users are being imported into.
    */
  var UserPoolId: UserPoolIdType
}

object ListUserImportJobsRequest {
  @scala.inline
  def apply(
    MaxResults: PoolQueryLimitType,
    UserPoolId: UserPoolIdType,
    PaginationToken: PaginationKeyType = null
  ): ListUserImportJobsRequest = {
    val __obj = js.Dynamic.literal(MaxResults = MaxResults, UserPoolId = UserPoolId)
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken)
    __obj.asInstanceOf[ListUserImportJobsRequest]
  }
}

