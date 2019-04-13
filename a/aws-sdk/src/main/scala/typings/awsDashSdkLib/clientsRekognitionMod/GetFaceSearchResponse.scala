package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFaceSearchResponse extends js.Object {
  /**
    * The current status of the face search job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.undefined
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of search results. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * An array of persons, PersonMatch, in the video whose face(s) match the face(s) in an Amazon Rekognition collection. It also includes time information for when persons are matched in the video. You specify the input collection in an initial call to StartFaceSearch. Each Persons element includes a time the person was matched, face match details (FaceMatches) for matching faces in the collection, and person information (Person) for the matched person. 
    */
  var Persons: js.UndefOr[PersonMatches] = js.undefined
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[StatusMessage] = js.undefined
  /**
    * Information about a video that Amazon Rekognition analyzed. Videometadata is returned in every page of paginated responses from a Amazon Rekognition Video operation. 
    */
  var VideoMetadata: js.UndefOr[VideoMetadata] = js.undefined
}

object GetFaceSearchResponse {
  @scala.inline
  def apply(
    JobStatus: VideoJobStatus = null,
    NextToken: PaginationToken = null,
    Persons: PersonMatches = null,
    StatusMessage: StatusMessage = null,
    VideoMetadata: VideoMetadata = null
  ): GetFaceSearchResponse = {
    val __obj = js.Dynamic.literal()
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Persons != null) __obj.updateDynamic("Persons")(Persons)
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    if (VideoMetadata != null) __obj.updateDynamic("VideoMetadata")(VideoMetadata)
    __obj.asInstanceOf[GetFaceSearchResponse]
  }
}

