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
    * The Amazon S3 location to upload inference responses to.
    */
  var S3OutputPath: DestinationS3Uri
}
object AsyncInferenceOutputConfig {
  
  inline def apply(S3OutputPath: DestinationS3Uri): AsyncInferenceOutputConfig = {
    val __obj = js.Dynamic.literal(S3OutputPath = S3OutputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncInferenceOutputConfig]
  }
  
  extension [Self <: AsyncInferenceOutputConfig](x: Self) {
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setNotificationConfig(value: AsyncInferenceNotificationConfig): Self = StObject.set(x, "NotificationConfig", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigUndefined: Self = StObject.set(x, "NotificationConfig", js.undefined)
    
    inline def setS3OutputPath(value: DestinationS3Uri): Self = StObject.set(x, "S3OutputPath", value.asInstanceOf[js.Any])
  }
}
