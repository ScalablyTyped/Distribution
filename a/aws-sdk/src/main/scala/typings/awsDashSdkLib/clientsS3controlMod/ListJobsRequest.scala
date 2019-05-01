package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsRequest extends js.Object {
  /**
    * 
    */
  var AccountId: awsDashSdkLib.clientsS3controlMod.AccountId
  /**
    * The List Jobs request returns jobs that match the statuses listed in this element.
    */
  var JobStatuses: js.UndefOr[JobStatusList] = js.undefined
  /**
    * The maximum number of jobs that Amazon S3 will include in the List Jobs response. If there are more jobs than this number, the response will include a pagination token in the NextToken field to enable you to retrieve the next page of results.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A pagination token to request the next page of results. Use the token that Amazon S3 returned in the NextToken element of the ListJobsResult from the previous List Jobs request.
    */
  var NextToken: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
}

object ListJobsRequest {
  @scala.inline
  def apply(
    AccountId: AccountId,
    JobStatuses: JobStatusList = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NonEmptyMaxLength1024String = null
  ): ListJobsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId)
    if (JobStatuses != null) __obj.updateDynamic("JobStatuses")(JobStatuses)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListJobsRequest]
  }
}

