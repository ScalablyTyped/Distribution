package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPersonTrackingResponse extends js.Object {
  /**
    * The current status of the person tracking job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.undefined
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of persons. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * An array of the persons detected in the video and the time(s) their path was tracked throughout the video. An array element will exist for each time a person's path is tracked. 
    */
  var Persons: js.UndefOr[PersonDetections] = js.undefined
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.StatusMessage] = js.undefined
  /**
    * Information about a video that Amazon Rekognition Video analyzed. Videometadata is returned in every page of paginated responses from a Amazon Rekognition Video operation.
    */
  var VideoMetadata: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.VideoMetadata] = js.undefined
}

object GetPersonTrackingResponse {
  @scala.inline
  def apply(
    JobStatus: VideoJobStatus = null,
    NextToken: PaginationToken = null,
    Persons: PersonDetections = null,
    StatusMessage: StatusMessage = null,
    VideoMetadata: VideoMetadata = null
  ): GetPersonTrackingResponse = {
    val __obj = js.Dynamic.literal()
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Persons != null) __obj.updateDynamic("Persons")(Persons)
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    if (VideoMetadata != null) __obj.updateDynamic("VideoMetadata")(VideoMetadata)
    __obj.asInstanceOf[GetPersonTrackingResponse]
  }
}

