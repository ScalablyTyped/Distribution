package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamProcessorRequest extends StObject {
  
  /**
    *  Shows whether you are sharing data with Rekognition to improve model performance. You can choose this option at the account level or on a per-stream basis. Note that if you opt out at the account level this setting is ignored on individual streams. 
    */
  var DataSharingPreference: js.UndefOr[StreamProcessorDataSharingPreference] = js.undefined
  
  /**
    * Kinesis video stream stream that provides the source streaming video. If you are using the AWS CLI, the parameter name is StreamProcessorInput. This is required for both face search and label detection stream processors.
    */
  var Input: StreamProcessorInput
  
  /**
    *  The identifier for your AWS Key Management Service key (AWS KMS key). This is an optional parameter for label detection stream processors and should not be used to create a face search stream processor. You can supply the Amazon Resource Name (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key is used to encrypt results and data published to your Amazon S3 bucket, which includes image frames and hero images. Your source images are unaffected.   
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsRekognitionMod.KmsKeyId] = js.undefined
  
  /**
    * An identifier you assign to the stream processor. You can use Name to manage the stream processor. For example, you can get the current status of the stream processor by calling DescribeStreamProcessor. Name is idempotent. This is required for both face search and label detection stream processors. 
    */
  var Name: StreamProcessorName
  
  var NotificationChannel: js.UndefOr[StreamProcessorNotificationChannel] = js.undefined
  
  /**
    * Kinesis data stream stream or Amazon S3 bucket location to which Amazon Rekognition Video puts the analysis results. If you are using the AWS CLI, the parameter name is StreamProcessorOutput. This must be a S3Destination of an Amazon S3 bucket that you own for a label detection stream processor or a Kinesis data stream ARN for a face search stream processor.
    */
  var Output: StreamProcessorOutput
  
  /**
    *  Specifies locations in the frames where Amazon Rekognition checks for objects or people. You can specify up to 10 regions of interest, and each region has either a polygon or a bounding box. This is an optional parameter for label detection stream processors and should not be used to create a face search stream processor. 
    */
  var RegionsOfInterest: js.UndefOr[typings.awsSdk.clientsRekognitionMod.RegionsOfInterest] = js.undefined
  
  /**
    * The Amazon Resource Number (ARN) of the IAM role that allows access to the stream processor. The IAM role provides Rekognition read permissions for a Kinesis stream. It also provides write permissions to an Amazon S3 bucket and Amazon Simple Notification Service topic for a label detection stream processor. This is required for both face search and label detection stream processors.
    */
  var RoleArn: typings.awsSdk.clientsRekognitionMod.RoleArn
  
  /**
    * Input parameters used in a streaming video analyzed by a stream processor. You can use FaceSearch to recognize faces in a streaming video, or you can use ConnectedHome to detect labels.
    */
  var Settings: StreamProcessorSettings
  
  /**
    *  A set of tags (key-value pairs) that you want to attach to the stream processor. 
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateStreamProcessorRequest {
  
  inline def apply(
    Input: StreamProcessorInput,
    Name: StreamProcessorName,
    Output: StreamProcessorOutput,
    RoleArn: RoleArn,
    Settings: StreamProcessorSettings
  ): CreateStreamProcessorRequest = {
    val __obj = js.Dynamic.literal(Input = Input.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Output = Output.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamProcessorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateStreamProcessorRequest] (val x: Self) extends AnyVal {
    
    inline def setDataSharingPreference(value: StreamProcessorDataSharingPreference): Self = StObject.set(x, "DataSharingPreference", value.asInstanceOf[js.Any])
    
    inline def setDataSharingPreferenceUndefined: Self = StObject.set(x, "DataSharingPreference", js.undefined)
    
    inline def setInput(value: StreamProcessorInput): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setName(value: StreamProcessorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNotificationChannel(value: StreamProcessorNotificationChannel): Self = StObject.set(x, "NotificationChannel", value.asInstanceOf[js.Any])
    
    inline def setNotificationChannelUndefined: Self = StObject.set(x, "NotificationChannel", js.undefined)
    
    inline def setOutput(value: StreamProcessorOutput): Self = StObject.set(x, "Output", value.asInstanceOf[js.Any])
    
    inline def setRegionsOfInterest(value: RegionsOfInterest): Self = StObject.set(x, "RegionsOfInterest", value.asInstanceOf[js.Any])
    
    inline def setRegionsOfInterestUndefined: Self = StObject.set(x, "RegionsOfInterest", js.undefined)
    
    inline def setRegionsOfInterestVarargs(value: RegionOfInterest*): Self = StObject.set(x, "RegionsOfInterest", js.Array(value*))
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: StreamProcessorSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
