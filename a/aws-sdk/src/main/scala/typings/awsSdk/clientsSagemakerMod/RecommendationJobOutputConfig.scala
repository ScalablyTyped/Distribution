package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationJobOutputConfig extends StObject {
  
  /**
    * Provides information about the output configuration for the compiled model.
    */
  var CompiledOutputConfig: js.UndefOr[RecommendationJobCompiledOutputConfig] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to encrypt your output artifacts with Amazon S3 server-side encryption. The SageMaker execution role must have kms:GenerateDataKey permission. The KmsKeyId can be any of the following formats:   // KMS Key ID  "1234abcd-12ab-34cd-56ef-1234567890ab"    // Amazon Resource Name (ARN) of a KMS Key  "arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"    // KMS Key Alias  "alias/ExampleAlias"    // Amazon Resource Name (ARN) of a KMS Key Alias  "arn:aws:kms:&lt;region&gt;:&lt;account&gt;:alias/&lt;ExampleAlias&gt;"    For more information about key identifiers, see Key identifiers (KeyID) in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsSagemakerMod.KmsKeyId] = js.undefined
}
object RecommendationJobOutputConfig {
  
  inline def apply(): RecommendationJobOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationJobOutputConfig]
  }
  
  extension [Self <: RecommendationJobOutputConfig](x: Self) {
    
    inline def setCompiledOutputConfig(value: RecommendationJobCompiledOutputConfig): Self = StObject.set(x, "CompiledOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setCompiledOutputConfigUndefined: Self = StObject.set(x, "CompiledOutputConfig", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
  }
}
