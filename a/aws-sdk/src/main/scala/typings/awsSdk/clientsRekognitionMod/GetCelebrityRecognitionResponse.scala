package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCelebrityRecognitionResponse extends StObject {
  
  /**
    * Array of celebrities recognized in the video.
    */
  var Celebrities: js.UndefOr[CelebrityRecognitions] = js.undefined
  
  /**
    * Job identifier for the celebrity recognition operation for which you want to obtain results. The job identifer is returned by an initial call to StartCelebrityRecognition.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsRekognitionMod.JobId] = js.undefined
  
  /**
    * The current status of the celebrity recognition job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.undefined
  
  /**
    * A job identifier specified in the call to StartCelebrityRecognition and returned in the job completion notification sent to your Amazon Simple Notification Service topic.
    */
  var JobTag: js.UndefOr[typings.awsSdk.clientsRekognitionMod.JobTag] = js.undefined
  
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of celebrities.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.clientsRekognitionMod.StatusMessage] = js.undefined
  
  var Video: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Video] = js.undefined
  
  /**
    * Information about a video that Amazon Rekognition Video analyzed. Videometadata is returned in every page of paginated responses from a Amazon Rekognition Video operation.
    */
  var VideoMetadata: js.UndefOr[typings.awsSdk.clientsRekognitionMod.VideoMetadata] = js.undefined
}
object GetCelebrityRecognitionResponse {
  
  inline def apply(): GetCelebrityRecognitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCelebrityRecognitionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCelebrityRecognitionResponse] (val x: Self) extends AnyVal {
    
    inline def setCelebrities(value: CelebrityRecognitions): Self = StObject.set(x, "Celebrities", value.asInstanceOf[js.Any])
    
    inline def setCelebritiesUndefined: Self = StObject.set(x, "Celebrities", js.undefined)
    
    inline def setCelebritiesVarargs(value: CelebrityRecognition*): Self = StObject.set(x, "Celebrities", js.Array(value*))
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobStatus(value: VideoJobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    inline def setJobTag(value: JobTag): Self = StObject.set(x, "JobTag", value.asInstanceOf[js.Any])
    
    inline def setJobTagUndefined: Self = StObject.set(x, "JobTag", js.undefined)
    
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
