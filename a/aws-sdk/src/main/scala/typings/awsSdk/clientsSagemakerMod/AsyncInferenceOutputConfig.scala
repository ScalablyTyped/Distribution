package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncInferenceOutputConfig extends StObject {
  
  /**
    * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that SageMaker uses to encrypt the asynchronous inference output in Amazon S3. 
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsSagemakerMod.KmsKeyId] = js.undefined
  
  /**
    * Specifies the configuration for notifications of inference results for asynchronous inference.
    */
  var NotificationConfig: js.UndefOr[AsyncInferenceNotificationConfig] = js.undefined
  
  /**
    * The Amazon S3 location to upload failure inference responses to.
    */
  var S3FailurePath: js.UndefOr[DestinationS3Uri] = js.undefined
  
  /**
    * The Amazon S3 location to upload inference responses to.
    */
  var S3OutputPath: js.UndefOr[DestinationS3Uri] = js.undefined
}
object AsyncInferenceOutputConfig {
  
  inline def apply(): AsyncInferenceOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncInferenceOutputConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsyncInferenceOutputConfig] (val x: Self) extends AnyVal {
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setNotificationConfig(value: AsyncInferenceNotificationConfig): Self = StObject.set(x, "NotificationConfig", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigUndefined: Self = StObject.set(x, "NotificationConfig", js.undefined)
    
    inline def setS3FailurePath(value: DestinationS3Uri): Self = StObject.set(x, "S3FailurePath", value.asInstanceOf[js.Any])
    
    inline def setS3FailurePathUndefined: Self = StObject.set(x, "S3FailurePath", js.undefined)
    
    inline def setS3OutputPath(value: DestinationS3Uri): Self = StObject.set(x, "S3OutputPath", value.asInstanceOf[js.Any])
    
    inline def setS3OutputPathUndefined: Self = StObject.set(x, "S3OutputPath", js.undefined)
  }
}
