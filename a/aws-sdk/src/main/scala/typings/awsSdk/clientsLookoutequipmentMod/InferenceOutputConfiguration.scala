package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferenceOutputConfiguration extends StObject {
  
  /**
    * The ID number for the AWS KMS key used to encrypt the inference output. 
    */
  var KmsKeyId: js.UndefOr[NameOrArn] = js.undefined
  
  /**
    *  Specifies configuration information for the output results from for the inference, output S3 location. 
    */
  var S3OutputConfiguration: InferenceS3OutputConfiguration
}
object InferenceOutputConfiguration {
  
  inline def apply(S3OutputConfiguration: InferenceS3OutputConfiguration): InferenceOutputConfiguration = {
    val __obj = js.Dynamic.literal(S3OutputConfiguration = S3OutputConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferenceOutputConfiguration]
  }
  
  extension [Self <: InferenceOutputConfiguration](x: Self) {
    
    inline def setKmsKeyId(value: NameOrArn): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setS3OutputConfiguration(value: InferenceS3OutputConfiguration): Self = StObject.set(x, "S3OutputConfiguration", value.asInstanceOf[js.Any])
  }
}
