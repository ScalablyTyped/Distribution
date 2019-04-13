package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPersonTrackingRequest extends js.Object {
  /**
    * The identifier for a job that tracks persons in a video. You get the JobId from a call to StartPersonTracking. 
    */
  var JobId: awsDashSdkLib.clientsRekognitionMod.JobId
  /**
    * Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you specify a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * If the previous response was incomplete (because there are more persons to retrieve), Amazon Rekognition Video returns a pagination token in the response. You can use this pagination token to retrieve the next set of persons. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * Sort to use for elements in the Persons array. Use TIMESTAMP to sort array elements by the time persons are detected. Use INDEX to sort by the tracked persons. If you sort by INDEX, the array elements for each person are sorted by detection confidence. The default sort is by TIMESTAMP.
    */
  var SortBy: js.UndefOr[PersonTrackingSortBy] = js.undefined
}

object GetPersonTrackingRequest {
  @scala.inline
  def apply(
    JobId: JobId,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: PaginationToken = null,
    SortBy: PersonTrackingSortBy = null
  ): GetPersonTrackingRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPersonTrackingRequest]
  }
}

