package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartVectorEnrichmentJobInput extends StObject {
  
  /**
    * A unique token that guarantees that the call to this API is idempotent.
    */
  var ClientToken: js.UndefOr[StartVectorEnrichmentJobInputClientTokenString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that you specified for the job.
    */
  var ExecutionRoleArn: typings.awsSdk.clientsSagemakergeospatialMod.ExecutionRoleArn
  
  /**
    * Input configuration information for the Vector Enrichment job.
    */
  var InputConfig: VectorEnrichmentJobInputConfig
  
  /**
    * An object containing information about the job configuration.
    */
  var JobConfig: VectorEnrichmentJobConfig
  
  /**
    * The Key Management Service key ID for server-side encryption.
    */
  var KmsKeyId: js.UndefOr[KmsKey] = js.undefined
  
  /**
    * The name of the Vector Enrichment job.
    */
  var Name: StartVectorEnrichmentJobInputNameString
  
  /**
    * Each tag consists of a key and a value.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.Tags] = js.undefined
}
object StartVectorEnrichmentJobInput {
  
  inline def apply(
    ExecutionRoleArn: ExecutionRoleArn,
    InputConfig: VectorEnrichmentJobInputConfig,
    JobConfig: VectorEnrichmentJobConfig,
    Name: StartVectorEnrichmentJobInputNameString
  ): StartVectorEnrichmentJobInput = {
    val __obj = js.Dynamic.literal(ExecutionRoleArn = ExecutionRoleArn.asInstanceOf[js.Any], InputConfig = InputConfig.asInstanceOf[js.Any], JobConfig = JobConfig.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartVectorEnrichmentJobInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartVectorEnrichmentJobInput] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: StartVectorEnrichmentJobInputClientTokenString): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setExecutionRoleArn(value: ExecutionRoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setInputConfig(value: VectorEnrichmentJobInputConfig): Self = StObject.set(x, "InputConfig", value.asInstanceOf[js.Any])
    
    inline def setJobConfig(value: VectorEnrichmentJobConfig): Self = StObject.set(x, "JobConfig", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: KmsKey): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setName(value: StartVectorEnrichmentJobInputNameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
