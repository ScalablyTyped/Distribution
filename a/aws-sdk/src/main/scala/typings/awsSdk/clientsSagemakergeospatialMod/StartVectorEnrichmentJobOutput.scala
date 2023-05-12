package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartVectorEnrichmentJobOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Vector Enrichment job.
    */
  var Arn: VectorEnrichmentJobArn
  
  /**
    * The creation time.
    */
  var CreationTime: js.Date
  
  /**
    * The duration of the Vector Enrichment job, in seconds.
    */
  var DurationInSeconds: Integer
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that you specified for the job.
    */
  var ExecutionRoleArn: typings.awsSdk.clientsSagemakergeospatialMod.ExecutionRoleArn
  
  /**
    * Input configuration information for starting the Vector Enrichment job.
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
  var Name: String
  
  /**
    * The status of the Vector Enrichment job being started.
    */
  var Status: VectorEnrichmentJobStatus
  
  /**
    * Each tag consists of a key and a value.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.Tags] = js.undefined
  
  /**
    * The type of the Vector Enrichment job.
    */
  var Type: VectorEnrichmentJobType
}
object StartVectorEnrichmentJobOutput {
  
  inline def apply(
    Arn: VectorEnrichmentJobArn,
    CreationTime: js.Date,
    DurationInSeconds: Integer,
    ExecutionRoleArn: ExecutionRoleArn,
    InputConfig: VectorEnrichmentJobInputConfig,
    JobConfig: VectorEnrichmentJobConfig,
    Name: String,
    Status: VectorEnrichmentJobStatus,
    Type: VectorEnrichmentJobType
  ): StartVectorEnrichmentJobOutput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], DurationInSeconds = DurationInSeconds.asInstanceOf[js.Any], ExecutionRoleArn = ExecutionRoleArn.asInstanceOf[js.Any], InputConfig = InputConfig.asInstanceOf[js.Any], JobConfig = JobConfig.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartVectorEnrichmentJobOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartVectorEnrichmentJobOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: VectorEnrichmentJobArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDurationInSeconds(value: Integer): Self = StObject.set(x, "DurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArn(value: ExecutionRoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setInputConfig(value: VectorEnrichmentJobInputConfig): Self = StObject.set(x, "InputConfig", value.asInstanceOf[js.Any])
    
    inline def setJobConfig(value: VectorEnrichmentJobConfig): Self = StObject.set(x, "JobConfig", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: KmsKey): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: VectorEnrichmentJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setType(value: VectorEnrichmentJobType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
