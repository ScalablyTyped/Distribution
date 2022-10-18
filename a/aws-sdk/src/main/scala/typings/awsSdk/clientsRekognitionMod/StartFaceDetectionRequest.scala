package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartFaceDetectionRequest extends StObject {
  
  /**
    * Idempotent token used to identify the start request. If you use the same token with multiple StartFaceDetection requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidently started more than once. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsRekognitionMod.ClientRequestToken] = js.undefined
  
  /**
    * The face attributes you want returned.  DEFAULT - The following subset of facial attributes are returned: BoundingBox, Confidence, Pose, Quality and Landmarks.   ALL - All facial attributes are returned.
    */
  var FaceAttributes: js.UndefOr[typings.awsSdk.clientsRekognitionMod.FaceAttributes] = js.undefined
  
  /**
    * An identifier you specify that's returned in the completion notification that's published to your Amazon Simple Notification Service topic. For example, you can use JobTag to group related jobs and identify them in the completion notification.
    */
  var JobTag: js.UndefOr[typings.awsSdk.clientsRekognitionMod.JobTag] = js.undefined
  
  /**
    * The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion status of the face detection operation. The Amazon SNS topic must have a topic name that begins with AmazonRekognition if you are using the AmazonRekognitionServiceRole permissions policy.
    */
  var NotificationChannel: js.UndefOr[typings.awsSdk.clientsRekognitionMod.NotificationChannel] = js.undefined
  
  /**
    * The video in which you want to detect faces. The video must be stored in an Amazon S3 bucket.
    */
  var Video: typings.awsSdk.clientsRekognitionMod.Video
}
object StartFaceDetectionRequest {
  
  inline def apply(Video: Video): StartFaceDetectionRequest = {
    val __obj = js.Dynamic.literal(Video = Video.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFaceDetectionRequest]
  }
  
  extension [Self <: StartFaceDetectionRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setFaceAttributes(value: FaceAttributes): Self = StObject.set(x, "FaceAttributes", value.asInstanceOf[js.Any])
    
    inline def setFaceAttributesUndefined: Self = StObject.set(x, "FaceAttributes", js.undefined)
    
    inline def setJobTag(value: JobTag): Self = StObject.set(x, "JobTag", value.asInstanceOf[js.Any])
    
    inline def setJobTagUndefined: Self = StObject.set(x, "JobTag", js.undefined)
    
    inline def setNotificationChannel(value: NotificationChannel): Self = StObject.set(x, "NotificationChannel", value.asInstanceOf[js.Any])
    
    inline def setNotificationChannelUndefined: Self = StObject.set(x, "NotificationChannel", js.undefined)
    
    inline def setVideo(value: Video): Self = StObject.set(x, "Video", value.asInstanceOf[js.Any])
  }
}
