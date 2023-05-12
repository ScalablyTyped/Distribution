package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEarthObservationJobOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Earth Observation job.
    */
  var Arn: String
  
  /**
    * The creation time of the initiated Earth Observation job.
    */
  var CreationTime: js.Date
  
  /**
    * The duration of Earth Observation job, in seconds.
    */
  var DurationInSeconds: Integer
  
  /**
    * Details about the errors generated during the Earth Observation job.
    */
  var ErrorDetails: js.UndefOr[EarthObservationJobErrorDetails] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that you specified for the job.
    */
  var ExecutionRoleArn: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.ExecutionRoleArn] = js.undefined
  
  /**
    * Details about the errors generated during ExportEarthObservationJob.
    */
  var ExportErrorDetails: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.ExportErrorDetails] = js.undefined
  
  /**
    * The status of the Earth Observation job.
    */
  var ExportStatus: js.UndefOr[EarthObservationJobExportStatus] = js.undefined
  
  /**
    * Input data for the Earth Observation job.
    */
  var InputConfig: InputConfigOutput
  
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
    * Bands available in the output of an operation.
    */
  var OutputBands: js.UndefOr[EarthObservationJobOutputBands] = js.undefined
  
  /**
    * The status of a previously initiated Earth Observation job.
    */
  var Status: EarthObservationJobStatus
  
  /**
    * Each tag consists of a key and a value.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.Tags] = js.undefined
}
object GetEarthObservationJobOutput {
  
  inline def apply(
    Arn: String,
    CreationTime: js.Date,
    DurationInSeconds: Integer,
    InputConfig: InputConfigOutput,
    JobConfig: JobConfigInput,
    Name: String,
    Status: EarthObservationJobStatus
  ): GetEarthObservationJobOutput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], DurationInSeconds = DurationInSeconds.asInstanceOf[js.Any], InputConfig = InputConfig.asInstanceOf[js.Any], JobConfig = JobConfig.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEarthObservationJobOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEarthObservationJobOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDurationInSeconds(value: Integer): Self = StObject.set(x, "DurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setErrorDetails(value: EarthObservationJobErrorDetails): Self = StObject.set(x, "ErrorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "ErrorDetails", js.undefined)
    
    inline def setExecutionRoleArn(value: ExecutionRoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "ExecutionRoleArn", js.undefined)
    
    inline def setExportErrorDetails(value: ExportErrorDetails): Self = StObject.set(x, "ExportErrorDetails", value.asInstanceOf[js.Any])
    
    inline def setExportErrorDetailsUndefined: Self = StObject.set(x, "ExportErrorDetails", js.undefined)
    
    inline def setExportStatus(value: EarthObservationJobExportStatus): Self = StObject.set(x, "ExportStatus", value.asInstanceOf[js.Any])
    
    inline def setExportStatusUndefined: Self = StObject.set(x, "ExportStatus", js.undefined)
    
    inline def setInputConfig(value: InputConfigOutput): Self = StObject.set(x, "InputConfig", value.asInstanceOf[js.Any])
    
    inline def setJobConfig(value: JobConfigInput): Self = StObject.set(x, "JobConfig", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: KmsKey): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputBands(value: EarthObservationJobOutputBands): Self = StObject.set(x, "OutputBands", value.asInstanceOf[js.Any])
    
    inline def setOutputBandsUndefined: Self = StObject.set(x, "OutputBands", js.undefined)
    
    inline def setOutputBandsVarargs(value: OutputBand*): Self = StObject.set(x, "OutputBands", js.Array(value*))
    
    inline def setStatus(value: EarthObservationJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
