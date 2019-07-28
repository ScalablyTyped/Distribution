package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCelebrityRecognitionResponse extends js.Object {
  /**
    * Array of celebrities recognized in the video.
    */
  var Celebrities: js.UndefOr[CelebrityRecognitions] = js.undefined
  /**
    * The current status of the celebrity recognition job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.undefined
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of celebrities.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.StatusMessage] = js.undefined
  /**
    * Information about a video that Amazon Rekognition Video analyzed. Videometadata is returned in every page of paginated responses from a Amazon Rekognition Video operation.
    */
  var VideoMetadata: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.VideoMetadata] = js.undefined
}

object GetCelebrityRecognitionResponse {
  @scala.inline
  def apply(
    Celebrities: CelebrityRecognitions = null,
    JobStatus: VideoJobStatus = null,
    NextToken: PaginationToken = null,
    StatusMessage: StatusMessage = null,
    VideoMetadata: VideoMetadata = null
  ): GetCelebrityRecognitionResponse = {
    val __obj = js.Dynamic.literal()
    if (Celebrities != null) __obj.updateDynamic("Celebrities")(Celebrities)
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    if (VideoMetadata != null) __obj.updateDynamic("VideoMetadata")(VideoMetadata)
    __obj.asInstanceOf[GetCelebrityRecognitionResponse]
  }
}

