package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLabelDetectionResponse extends StObject {
  
  /**
    * Information about the paramters used when getting a response. Includes information on aggregation and sorting methods.
    */
  var GetRequestMetadata: js.UndefOr[GetLabelDetectionRequestMetadata] = js.undefined
  
  /**
    * Job identifier for the label detection operation for which you want to obtain results. The job identifer is returned by an initial call to StartLabelDetection.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsRekognitionMod.JobId] = js.undefined
  
  /**
    * The current status of the label detection job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.undefined
  
  /**
    * A job identifier specified in the call to StartLabelDetection and returned in the job completion notification sent to your Amazon Simple Notification Service topic.
    */
  var JobTag: js.UndefOr[typings.awsSdk.clientsRekognitionMod.JobTag] = js.undefined
  
  /**
    * Version number of the label detection model that was used to detect labels.
    */
  var LabelModelVersion: js.UndefOr[String] = js.undefined
  
  /**
    * An array of labels detected in the video. Each element contains the detected label and the time, in milliseconds from the start of the video, that the label was detected. 
    */
  var Labels: js.UndefOr[LabelDetections] = js.undefined
  
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of labels.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.clientsRekognitionMod.StatusMessage] = js.undefined
  
  var Video: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Video] = js.undefined
  
  /**
    * Information about a video that Amazon Rekognition Video analyzed. Videometadata is returned in every page of paginated responses from a Amazon Rekognition video operation.
    */
  var VideoMetadata: js.UndefOr[typings.awsSdk.clientsRekognitionMod.VideoMetadata] = js.undefined
}
object GetLabelDetectionResponse {
  
  inline def apply(): GetLabelDetectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLabelDetectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLabelDetectionResponse] (val x: Self) extends AnyVal {
    
    inline def setGetRequestMetadata(value: GetLabelDetectionRequestMetadata): Self = StObject.set(x, "GetRequestMetadata", value.asInstanceOf[js.Any])
    
    inline def setGetRequestMetadataUndefined: Self = StObject.set(x, "GetRequestMetadata", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobStatus(value: VideoJobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    inline def setJobTag(value: JobTag): Self = StObject.set(x, "JobTag", value.asInstanceOf[js.Any])
    
    inline def setJobTagUndefined: Self = StObject.set(x, "JobTag", js.undefined)
    
    inline def setLabelModelVersion(value: String): Self = StObject.set(x, "LabelModelVersion", value.asInstanceOf[js.Any])
    
    inline def setLabelModelVersionUndefined: Self = StObject.set(x, "LabelModelVersion", js.undefined)
    
    inline def setLabels(value: LabelDetections): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    inline def setLabelsVarargs(value: LabelDetection*): Self = StObject.set(x, "Labels", js.Array(value*))
    
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
