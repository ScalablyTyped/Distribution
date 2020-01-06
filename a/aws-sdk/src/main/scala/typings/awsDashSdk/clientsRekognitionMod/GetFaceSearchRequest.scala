package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFaceSearchRequest extends js.Object {
  /**
    * The job identifer for the search request. You get the job identifier from an initial call to StartFaceSearch.
    */
  var JobId: typings.awsDashSdk.clientsRekognitionMod.JobId = js.native
  /**
    * Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you specify a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.MaxResults] = js.native
  /**
    * If the previous response was incomplete (because there is more search results to retrieve), Amazon Rekognition Video returns a pagination token in the response. You can use this pagination token to retrieve the next set of search results. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * Sort to use for grouping faces in the response. Use TIMESTAMP to group faces by the time that they are recognized. Use INDEX to sort by recognized faces. 
    */
  var SortBy: js.UndefOr[FaceSearchSortBy] = js.native
}

object GetFaceSearchRequest {
  @scala.inline
  def apply(
    JobId: JobId,
    MaxResults: Int | Double = null,
    NextToken: PaginationToken = null,
    SortBy: FaceSearchSortBy = null
  ): GetFaceSearchRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFaceSearchRequest]
  }
}

