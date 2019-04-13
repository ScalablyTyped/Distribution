package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetContentModerationResponse extends js.Object {
  /**
    * The current status of the content moderation job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.undefined
  /**
    * The detected moderation labels and the time(s) they were detected.
    */
  var ModerationLabels: js.UndefOr[ContentModerationDetections] = js.undefined
  /**
    * Version number of the moderation detection model that was used to detect unsafe content.
    */
  var ModerationModelVersion: js.UndefOr[String] = js.undefined
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of moderation labels. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[StatusMessage] = js.undefined
  /**
    * Information about a video that Amazon Rekognition analyzed. Videometadata is returned in every page of paginated responses from GetContentModeration. 
    */
  var VideoMetadata: js.UndefOr[VideoMetadata] = js.undefined
}

object GetContentModerationResponse {
  @scala.inline
  def apply(
    JobStatus: VideoJobStatus = null,
    ModerationLabels: ContentModerationDetections = null,
    ModerationModelVersion: String = null,
    NextToken: PaginationToken = null,
    StatusMessage: StatusMessage = null,
    VideoMetadata: VideoMetadata = null
  ): GetContentModerationResponse = {
    val __obj = js.Dynamic.literal()
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    if (ModerationLabels != null) __obj.updateDynamic("ModerationLabels")(ModerationLabels)
    if (ModerationModelVersion != null) __obj.updateDynamic("ModerationModelVersion")(ModerationModelVersion)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    if (VideoMetadata != null) __obj.updateDynamic("VideoMetadata")(VideoMetadata)
    __obj.asInstanceOf[GetContentModerationResponse]
  }
}

