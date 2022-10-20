package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDataCaptureConfig extends StObject {
  
  /**
    * The Amazon S3 location being used to capture the data.
    */
  var DestinationS3Uri: S3Uri
  
  /**
    * Flag that indicates whether to append inference id to the output.
    */
  var GenerateInferenceId: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service key that SageMaker uses to encrypt data on the storage volume attached to the ML compute instance that hosts the batch transform job. The KmsKeyId can be any of the following formats:    Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias name ARN: arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias   
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsSagemakerMod.KmsKeyId] = js.undefined
}
object BatchDataCaptureConfig {
  
  inline def apply(DestinationS3Uri: S3Uri): BatchDataCaptureConfig = {
    val __obj = js.Dynamic.literal(DestinationS3Uri = DestinationS3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDataCaptureConfig]
  }
  
  extension [Self <: BatchDataCaptureConfig](x: Self) {
    
    inline def setDestinationS3Uri(value: S3Uri): Self = StObject.set(x, "DestinationS3Uri", value.asInstanceOf[js.Any])
    
    inline def setGenerateInferenceId(value: Boolean): Self = StObject.set(x, "GenerateInferenceId", value.asInstanceOf[js.Any])
    
    inline def setGenerateInferenceIdUndefined: Self = StObject.set(x, "GenerateInferenceId", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
  }
}
