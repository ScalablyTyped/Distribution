package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectVersionDescription extends StObject {
  
  /**
    * The duration, in seconds, that you were billed for a successful training of the model version. This value is only returned if the model version has been successfully trained.
    */
  var BillableTrainingTimeInSeconds: js.UndefOr[ULong] = js.undefined
  
  /**
    * The Unix datetime for the date and time that training started.
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The training results. EvaluationResult is only returned if training is successful.
    */
  var EvaluationResult: js.UndefOr[typings.awsSdk.clientsRekognitionMod.EvaluationResult] = js.undefined
  
  /**
    * The identifer for the AWS Key Management Service key (AWS KMS key) that was used to encrypt the model during training. 
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsRekognitionMod.KmsKeyId] = js.undefined
  
  /**
    * The location of the summary manifest. The summary manifest provides aggregate data validation results for the training and test datasets.
    */
  var ManifestSummary: js.UndefOr[GroundTruthManifest] = js.undefined
  
  /**
    * The maximum number of inference units Amazon Rekognition Custom Labels uses to auto-scale the model. For more information, see StartProjectVersion.
    */
  var MaxInferenceUnits: js.UndefOr[InferenceUnits] = js.undefined
  
  /**
    * The minimum number of inference units used by the model. For more information, see StartProjectVersion.
    */
  var MinInferenceUnits: js.UndefOr[InferenceUnits] = js.undefined
  
  /**
    * The location where training results are saved.
    */
  var OutputConfig: js.UndefOr[typings.awsSdk.clientsRekognitionMod.OutputConfig] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the model version. 
    */
  var ProjectVersionArn: js.UndefOr[typings.awsSdk.clientsRekognitionMod.ProjectVersionArn] = js.undefined
  
  /**
    * If the model version was copied from a different project, SourceProjectVersionArn contains the ARN of the source model version. 
    */
  var SourceProjectVersionArn: js.UndefOr[ProjectVersionArn] = js.undefined
  
  /**
    * The current status of the model version.
    */
  var Status: js.UndefOr[ProjectVersionStatus] = js.undefined
  
  /**
    * A descriptive message for an error or warning that occurred.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.clientsRekognitionMod.StatusMessage] = js.undefined
  
  /**
    * Contains information about the testing results.
    */
  var TestingDataResult: js.UndefOr[typings.awsSdk.clientsRekognitionMod.TestingDataResult] = js.undefined
  
  /**
    * Contains information about the training results.
    */
  var TrainingDataResult: js.UndefOr[typings.awsSdk.clientsRekognitionMod.TrainingDataResult] = js.undefined
  
  /**
    * The Unix date and time that training of the model ended.
    */
  var TrainingEndTimestamp: js.UndefOr[js.Date] = js.undefined
}
object ProjectVersionDescription {
  
  inline def apply(): ProjectVersionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectVersionDescription]
  }
  
  extension [Self <: ProjectVersionDescription](x: Self) {
    
    inline def setBillableTrainingTimeInSeconds(value: ULong): Self = StObject.set(x, "BillableTrainingTimeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setBillableTrainingTimeInSecondsUndefined: Self = StObject.set(x, "BillableTrainingTimeInSeconds", js.undefined)
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setEvaluationResult(value: EvaluationResult): Self = StObject.set(x, "EvaluationResult", value.asInstanceOf[js.Any])
    
    inline def setEvaluationResultUndefined: Self = StObject.set(x, "EvaluationResult", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setManifestSummary(value: GroundTruthManifest): Self = StObject.set(x, "ManifestSummary", value.asInstanceOf[js.Any])
    
    inline def setManifestSummaryUndefined: Self = StObject.set(x, "ManifestSummary", js.undefined)
    
    inline def setMaxInferenceUnits(value: InferenceUnits): Self = StObject.set(x, "MaxInferenceUnits", value.asInstanceOf[js.Any])
    
    inline def setMaxInferenceUnitsUndefined: Self = StObject.set(x, "MaxInferenceUnits", js.undefined)
    
    inline def setMinInferenceUnits(value: InferenceUnits): Self = StObject.set(x, "MinInferenceUnits", value.asInstanceOf[js.Any])
    
    inline def setMinInferenceUnitsUndefined: Self = StObject.set(x, "MinInferenceUnits", js.undefined)
    
    inline def setOutputConfig(value: OutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "OutputConfig", js.undefined)
    
    inline def setProjectVersionArn(value: ProjectVersionArn): Self = StObject.set(x, "ProjectVersionArn", value.asInstanceOf[js.Any])
    
    inline def setProjectVersionArnUndefined: Self = StObject.set(x, "ProjectVersionArn", js.undefined)
    
    inline def setSourceProjectVersionArn(value: ProjectVersionArn): Self = StObject.set(x, "SourceProjectVersionArn", value.asInstanceOf[js.Any])
    
    inline def setSourceProjectVersionArnUndefined: Self = StObject.set(x, "SourceProjectVersionArn", js.undefined)
    
    inline def setStatus(value: ProjectVersionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTestingDataResult(value: TestingDataResult): Self = StObject.set(x, "TestingDataResult", value.asInstanceOf[js.Any])
    
    inline def setTestingDataResultUndefined: Self = StObject.set(x, "TestingDataResult", js.undefined)
    
    inline def setTrainingDataResult(value: TrainingDataResult): Self = StObject.set(x, "TrainingDataResult", value.asInstanceOf[js.Any])
    
    inline def setTrainingDataResultUndefined: Self = StObject.set(x, "TrainingDataResult", js.undefined)
    
    inline def setTrainingEndTimestamp(value: js.Date): Self = StObject.set(x, "TrainingEndTimestamp", value.asInstanceOf[js.Any])
    
    inline def setTrainingEndTimestampUndefined: Self = StObject.set(x, "TrainingEndTimestamp", js.undefined)
  }
}
