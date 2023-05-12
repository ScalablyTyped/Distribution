package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferenceExperimentDataStorageConfig extends StObject {
  
  var ContentType: js.UndefOr[CaptureContentTypeHeader] = js.undefined
  
  /**
    * The Amazon S3 bucket where the inference request and response data is stored. 
    */
  var Destination: DestinationS3Uri
  
  /**
    *  The Amazon Web Services Key Management Service key that Amazon SageMaker uses to encrypt captured data at rest using Amazon S3 server-side encryption. 
    */
  var KmsKey: js.UndefOr[KmsKeyId] = js.undefined
}
object InferenceExperimentDataStorageConfig {
  
  inline def apply(Destination: DestinationS3Uri): InferenceExperimentDataStorageConfig = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferenceExperimentDataStorageConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InferenceExperimentDataStorageConfig] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: CaptureContentTypeHeader): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setDestination(value: DestinationS3Uri): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setKmsKey(value: KmsKeyId): Self = StObject.set(x, "KmsKey", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyUndefined: Self = StObject.set(x, "KmsKey", js.undefined)
  }
}
