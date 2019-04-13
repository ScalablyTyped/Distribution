package typings
package awsDashSdkLib.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTranscriptionJobsResponse extends js.Object {
  /**
    * The ListTranscriptionJobs operation returns a page of jobs at a time. The maximum size of the page is set by the MaxResults parameter. If there are more jobs in the list than the page size, Amazon Transcribe returns the NextPage token. Include the token in the next request to the ListTranscriptionJobs operation to return in the next page of jobs.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The requested status of the jobs returned.
    */
  var Status: js.UndefOr[TranscriptionJobStatus] = js.undefined
  /**
    * A list of objects containing summary information for a transcription job.
    */
  var TranscriptionJobSummaries: js.UndefOr[TranscriptionJobSummaries] = js.undefined
}

object ListTranscriptionJobsResponse {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    Status: TranscriptionJobStatus = null,
    TranscriptionJobSummaries: TranscriptionJobSummaries = null
  ): ListTranscriptionJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TranscriptionJobSummaries != null) __obj.updateDynamic("TranscriptionJobSummaries")(TranscriptionJobSummaries)
    __obj.asInstanceOf[ListTranscriptionJobsResponse]
  }
}

