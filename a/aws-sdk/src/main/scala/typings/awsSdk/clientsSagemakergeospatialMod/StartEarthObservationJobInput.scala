package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartEarthObservationJobInput extends StObject {
  
  /**
    * A unique token that guarantees that the call to this API is idempotent.
    */
  var ClientToken: js.UndefOr[StartEarthObservationJobInputClientTokenString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that you specified for the job.
    */
  var ExecutionRoleArn: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.ExecutionRoleArn] = js.undefined
  
  /**
    * Input configuration information for the Earth Observation job.
    */
  var InputConfig: InputConfigInput
  
  /**
    * An object containing information about the job configuration.
    */
  var JobConfig: JobConfigInput
  
  /**
    * The Key Management Service key ID for server-side encryption.
    */
  var KmsKeyId: js.UndefOr[KmsKey] = js.undefined
  
  /**
    * The name of the Earth Observation job.
    */
  var Name: StartEarthObservationJobInputNameString
  
  /**
    * Each tag consists of a key and a value.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.Tags] = js.undefined
}
object StartEarthObservationJobInput {
  
  inline def apply(
    InputConfig: InputConfigInput,
    JobConfig: JobConfigInput,
    Name: StartEarthObservationJobInputNameString
  ): StartEarthObservationJobInput = {
    val __obj = js.Dynamic.literal(InputConfig = InputConfig.asInstanceOf[js.Any], JobConfig = JobConfig.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartEarthObservationJobInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartEarthObservationJobInput] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: StartEarthObservationJobInputClientTokenString): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setExecutionRoleArn(value: ExecutionRoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "ExecutionRoleArn", js.undefined)
    
    inline def setInputConfig(value: InputConfigInput): Self = StObject.set(x, "InputConfig", value.asInstanceOf[js.Any])
    
    inline def setJobConfig(value: JobConfigInput): Self = StObject.set(x, "JobConfig", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: KmsKey): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setName(value: StartEarthObservationJobInputNameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
