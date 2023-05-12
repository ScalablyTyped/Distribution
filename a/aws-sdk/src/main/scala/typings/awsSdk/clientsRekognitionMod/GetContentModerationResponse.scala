package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContentModerationResponse extends StObject {
  
  /**
    * Information about the paramters used when getting a response. Includes information on aggregation and sorting methods.
    */
  var GetRequestMetadata: js.UndefOr[GetContentModerationRequestMetadata] = js.undefined
  
  /**
    * Job identifier for the content moderation operation for which you want to obtain results. The job identifer is returned by an initial call to StartContentModeration.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsRekognitionMod.JobId] = js.undefined
  
  /**
    * The current status of the content moderation analysis job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.undefined
  
  /**
    * A job identifier specified in the call to StartContentModeration and returned in the job completion notification sent to your Amazon Simple Notification Service topic.
    */
  var JobTag: js.UndefOr[typings.awsSdk.clientsRekognitionMod.JobTag] = js.undefined
  
  /**
    * The detected inappropriate, unwanted, or offensive content moderation labels and the time(s) they were detected.
    */
  var ModerationLabels: js.UndefOr[ContentModerationDetections] = js.undefined
  
  /**
    * Version number of the moderation detection model that was used to detect inappropriate, unwanted, or offensive content.
    */
  var ModerationModelVersion: js.UndefOr[String] = js.undefined
  
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of content moderation labels. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.clientsRekognitionMod.StatusMessage] = js.undefined
  
  var Video: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Video] = js.undefined
  
  /**
    * Information about a video that Amazon Rekognition analyzed. Videometadata is returned in every page of paginated responses from GetContentModeration. 
    */
  var VideoMetadata: js.UndefOr[typings.awsSdk.clientsRekognitionMod.VideoMetadata] = js.undefined
}
object GetContentModerationResponse {
  
  inline def apply(): GetContentModerationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContentModerationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetContentModerationResponse] (val x: Self) extends AnyVal {
    
    inline def setGetRequestMetadata(value: GetContentModerationRequestMetadata): Self = StObject.set(x, "GetRequestMetadata", value.asInstanceOf[js.Any])
    
    inline def setGetRequestMetadataUndefined: Self = StObject.set(x, "GetRequestMetadata", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobStatus(value: VideoJobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    inline def setJobTag(value: JobTag): Self = StObject.set(x, "JobTag", value.asInstanceOf[js.Any])
    
    inline def setJobTagUndefined: Self = StObject.set(x, "JobTag", js.undefined)
    
    inline def setModerationLabels(value: ContentModerationDetections): Self = StObject.set(x, "ModerationLabels", value.asInstanceOf[js.Any])
    
    inline def setModerationLabelsUndefined: Self = StObject.set(x, "ModerationLabels", js.undefined)
    
    inline def setModerationLabelsVarargs(value: ContentModerationDetection*): Self = StObject.set(x, "ModerationLabels", js.Array(value*))
    
    inline def setModerationModelVersion(value: String): Self = StObject.set(x, "ModerationModelVersion", value.asInstanceOf[js.Any])
    
    inline def setModerationModelVersionUndefined: Self = StObject.set(x, "ModerationModelVersion", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setVideo(value: Video): Self = StObject.set(x, "Video", value.asInstanceOf[js.Any])
    
    inline def setVideoMetadata(value: VideoMetadata): Self = StObject.set(x, "VideoMetadata", value.asInstanceOf[js.Any])
    
    inline def setVideoMetadataUndefined: Self = StObject.set(x, "VideoMetadata", js.undefined)
    
    inline def setVideoUndefined: Self = StObject.set(x, "Video", js.undefined)
  }
}
