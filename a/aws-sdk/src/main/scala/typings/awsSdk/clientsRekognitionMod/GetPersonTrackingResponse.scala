package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPersonTrackingResponse extends StObject {
  
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
  var StatusMessage: js.UndefOr[typings.awsSdk.clientsRekognitionMod.StatusMessage] = js.undefined
  
  /**
    * Information about a video that Amazon Rekognition Video analyzed. Videometadata is returned in every page of paginated responses from a Amazon Rekognition Video operation.
    */
  var VideoMetadata: js.UndefOr[typings.awsSdk.clientsRekognitionMod.VideoMetadata] = js.undefined
}
object GetPersonTrackingResponse {
  
  inline def apply(): GetPersonTrackingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPersonTrackingResponse]
  }
  
  extension [Self <: GetPersonTrackingResponse](x: Self) {
    
    inline def setJobStatus(value: VideoJobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPersons(value: PersonDetections): Self = StObject.set(x, "Persons", value.asInstanceOf[js.Any])
    
    inline def setPersonsUndefined: Self = StObject.set(x, "Persons", js.undefined)
    
    inline def setPersonsVarargs(value: PersonDetection*): Self = StObject.set(x, "Persons", js.Array(value*))
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setVideoMetadata(value: VideoMetadata): Self = StObject.set(x, "VideoMetadata", value.asInstanceOf[js.Any])
    
    inline def setVideoMetadataUndefined: Self = StObject.set(x, "VideoMetadata", js.undefined)
  }
}
