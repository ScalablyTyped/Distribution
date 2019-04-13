package typings
package awsDashSdkLib.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTranscriptionJobsRequest extends js.Object {
  /**
    * When specified, the jobs returned in the list are limited to jobs whose name contains the specified string.
    */
  var JobNameContains: js.UndefOr[TranscriptionJobName] = js.undefined
  /**
    * The maximum number of jobs to return in the response. If there are fewer results in the list, this response contains only the actual results.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * If the result of the previous request to ListTranscriptionJobs was truncated, include the NextToken to fetch the next set of jobs.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * When specified, returns only transcription jobs with the specified status. Jobs are ordered by creation date, with the newest jobs returned first. If you don’t specify a status, Amazon Transcribe returns all transcription jobs ordered by creation date. 
    */
  var Status: js.UndefOr[TranscriptionJobStatus] = js.undefined
}

object ListTranscriptionJobsRequest {
  @scala.inline
  def apply(
    JobNameContains: TranscriptionJobName = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    Status: TranscriptionJobStatus = null
  ): ListTranscriptionJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (JobNameContains != null) __obj.updateDynamic("JobNameContains")(JobNameContains)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTranscriptionJobsRequest]
  }
}

