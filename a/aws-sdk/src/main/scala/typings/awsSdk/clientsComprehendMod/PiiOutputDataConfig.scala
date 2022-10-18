package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PiiOutputDataConfig extends StObject {
  
  /**
    * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the output results from an analysis job.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsComprehendMod.KmsKeyId] = js.undefined
  
  /**
    * When you use the PiiOutputDataConfig object with asynchronous operations, you specify the Amazon S3 location where you want to write the output data.   For a PII entity detection job, the output file is plain text, not a compressed archive. The output file name is the same as the input file, with .out appended at the end. 
    */
  var S3Uri: typings.awsSdk.clientsComprehendMod.S3Uri
}
object PiiOutputDataConfig {
  
  inline def apply(S3Uri: S3Uri): PiiOutputDataConfig = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PiiOutputDataConfig]
  }
  
  extension [Self <: PiiOutputDataConfig](x: Self) {
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
