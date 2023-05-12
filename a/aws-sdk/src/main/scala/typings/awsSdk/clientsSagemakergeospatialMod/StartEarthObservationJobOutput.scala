package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartEarthObservationJobOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Earth Observation job.
    */
  var Arn: String
  
  /**
    * The creation time.
    */
  var CreationTime: js.Date
  
  /**
    * The duration of the session, in seconds.
    */
  var DurationInSeconds: Integer
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that you specified for the job.
    */
  var ExecutionRoleArn: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.ExecutionRoleArn] = js.undefined
  
  /**
    * Input configuration information for the Earth Observation job.
    */
  var InputConfig: js.UndefOr[InputConfigOutput] = js.undefined
  
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
  var Name: String
  
  /**
    * The status of the Earth Observation job.
    */
  var Status: EarthObservationJobStatus
  
  /**
    * Each tag consists of a key and a value.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.Tags] = js.undefined
}
object StartEarthObservationJobOutput {
  
  inline def apply(
    Arn: String,
    CreationTime: js.Date,
    DurationInSeconds: Integer,
    JobConfig: JobConfigInput,
    Name: String,
    Status: EarthObservationJobStatus
  ): StartEarthObservationJobOutput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], DurationInSeconds = DurationInSeconds.asInstanceOf[js.Any], JobConfig = JobConfig.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartEarthObservationJobOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartEarthObservationJobOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDurationInSeconds(value: Integer): Self = StObject.set(x, "DurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArn(value: ExecutionRoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "ExecutionRoleArn", js.undefined)
    
    inline def setInputConfig(value: InputConfigOutput): Self = StObject.set(x, "InputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "InputConfig", js.undefined)
    
    inline def setJobConfig(value: JobConfigInput): Self = StObject.set(x, "JobConfig", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: KmsKey): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: EarthObservationJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
