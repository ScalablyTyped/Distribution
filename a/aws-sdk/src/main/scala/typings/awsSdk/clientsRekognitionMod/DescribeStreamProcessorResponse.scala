package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStreamProcessorResponse extends StObject {
  
  /**
    * Date and time the stream processor was created
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Shows whether you are sharing data with Rekognition to improve model performance. You can choose this option at the account level or on a per-stream basis. Note that if you opt out at the account level this setting is ignored on individual streams. 
    */
  var DataSharingPreference: js.UndefOr[StreamProcessorDataSharingPreference] = js.undefined
  
  /**
    * Kinesis video stream that provides the source streaming video.
    */
  var Input: js.UndefOr[StreamProcessorInput] = js.undefined
  
  /**
    *  The identifier for your AWS Key Management Service key (AWS KMS key). This is an optional parameter for label detection stream processors. 
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsRekognitionMod.KmsKeyId] = js.undefined
  
  /**
    * The time, in Unix format, the stream processor was last updated. For example, when the stream processor moves from a running state to a failed state, or when the user starts or stops the stream processor.
    */
  var LastUpdateTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Name of the stream processor. 
    */
  var Name: js.UndefOr[StreamProcessorName] = js.undefined
  
  var NotificationChannel: js.UndefOr[StreamProcessorNotificationChannel] = js.undefined
  
  /**
    * Kinesis data stream to which Amazon Rekognition Video puts the analysis results.
    */
  var Output: js.UndefOr[StreamProcessorOutput] = js.undefined
  
  /**
    *  Specifies locations in the frames where Amazon Rekognition checks for objects or people. This is an optional parameter for label detection stream processors. 
    */
  var RegionsOfInterest: js.UndefOr[typings.awsSdk.clientsRekognitionMod.RegionsOfInterest] = js.undefined
  
  /**
    * ARN of the IAM role that allows access to the stream processor.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsRekognitionMod.RoleArn] = js.undefined
  
  /**
    * Input parameters used in a streaming video analyzed by a stream processor. You can use FaceSearch to recognize faces in a streaming video, or you can use ConnectedHome to detect labels.
    */
  var Settings: js.UndefOr[StreamProcessorSettings] = js.undefined
  
  /**
    * Current status of the stream processor.
    */
  var Status: js.UndefOr[StreamProcessorStatus] = js.undefined
  
  /**
    * Detailed status message about the stream processor.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * ARN of the stream processor.
    */
  var StreamProcessorArn: js.UndefOr[typings.awsSdk.clientsRekognitionMod.StreamProcessorArn] = js.undefined
}
object DescribeStreamProcessorResponse {
  
  inline def apply(): DescribeStreamProcessorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStreamProcessorResponse]
  }
  
  extension [Self <: DescribeStreamProcessorResponse](x: Self) {
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setDataSharingPreference(value: StreamProcessorDataSharingPreference): Self = StObject.set(x, "DataSharingPreference", value.asInstanceOf[js.Any])
    
    inline def setDataSharingPreferenceUndefined: Self = StObject.set(x, "DataSharingPreference", js.undefined)
    
    inline def setInput(value: StreamProcessorInput): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLastUpdateTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdateTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimestampUndefined: Self = StObject.set(x, "LastUpdateTimestamp", js.undefined)
    
    inline def setName(value: StreamProcessorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNotificationChannel(value: StreamProcessorNotificationChannel): Self = StObject.set(x, "NotificationChannel", value.asInstanceOf[js.Any])
    
    inline def setNotificationChannelUndefined: Self = StObject.set(x, "NotificationChannel", js.undefined)
    
    inline def setOutput(value: StreamProcessorOutput): Self = StObject.set(x, "Output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "Output", js.undefined)
    
    inline def setRegionsOfInterest(value: RegionsOfInterest): Self = StObject.set(x, "RegionsOfInterest", value.asInstanceOf[js.Any])
    
    inline def setRegionsOfInterestUndefined: Self = StObject.set(x, "RegionsOfInterest", js.undefined)
    
    inline def setRegionsOfInterestVarargs(value: RegionOfInterest*): Self = StObject.set(x, "RegionsOfInterest", js.Array(value*))
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSettings(value: StreamProcessorSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
    
    inline def setStatus(value: StreamProcessorStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setStreamProcessorArn(value: StreamProcessorArn): Self = StObject.set(x, "StreamProcessorArn", value.asInstanceOf[js.Any])
    
    inline def setStreamProcessorArnUndefined: Self = StObject.set(x, "StreamProcessorArn", js.undefined)
  }
}
