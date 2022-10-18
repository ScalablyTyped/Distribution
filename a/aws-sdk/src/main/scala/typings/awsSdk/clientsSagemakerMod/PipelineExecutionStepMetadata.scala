package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineExecutionStepMetadata extends StObject {
  
  /**
    * The URL of the Amazon SQS queue used by this step execution, the pipeline generated token, and a list of output parameters.
    */
  var Callback: js.UndefOr[CallbackStepMetadata] = js.undefined
  
  /**
    * Container for the metadata for a Clarify check step. The configurations and outcomes of the check step execution. This includes:    The type of the check conducted,   The Amazon S3 URIs of baseline constraints and statistics files to be used for the drift check.   The Amazon S3 URIs of newly calculated baseline constraints and statistics.   The model package group name provided.   The Amazon S3 URI of the violation report if violations detected.   The Amazon Resource Name (ARN) of check processing job initiated by the step execution.   The boolean flags indicating if the drift check is skipped.   If step property BaselineUsedForDriftCheck is set the same as CalculatedBaseline.  
    */
  var ClarifyCheck: js.UndefOr[ClarifyCheckStepMetadata] = js.undefined
  
  /**
    * The outcome of the condition evaluation that was run by this step execution.
    */
  var Condition: js.UndefOr[ConditionStepMetadata] = js.undefined
  
  /**
    * The configurations and outcomes of an EMR step execution.
    */
  var EMR: js.UndefOr[EMRStepMetadata] = js.undefined
  
  /**
    * The configurations and outcomes of a Fail step execution.
    */
  var Fail: js.UndefOr[FailStepMetadata] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda function that was run by this step execution and a list of output parameters.
    */
  var Lambda: js.UndefOr[LambdaStepMetadata] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the model that was created by this step execution.
    */
  var Model: js.UndefOr[ModelStepMetadata] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the processing job that was run by this step execution.
    */
  var ProcessingJob: js.UndefOr[ProcessingJobStepMetadata] = js.undefined
  
  /**
    * The configurations and outcomes of the check step execution. This includes:    The type of the check conducted,   The Amazon S3 URIs of baseline constraints and statistics files to be used for the drift check.   The Amazon S3 URIs of newly calculated baseline constraints and statistics.   The model package group name provided.   The Amazon S3 URI of the violation report if violations detected.   The Amazon Resource Name (ARN) of check processing job initiated by the step execution.   The boolean flags indicating if the drift check is skipped.   If step property BaselineUsedForDriftCheck is set the same as CalculatedBaseline.  
    */
  var QualityCheck: js.UndefOr[QualityCheckStepMetadata] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the model package the model was registered to by this step execution.
    */
  var RegisterModel: js.UndefOr[RegisterModelStepMetadata] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the training job that was run by this step execution.
    */
  var TrainingJob: js.UndefOr[TrainingJobStepMetadata] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the transform job that was run by this step execution.
    */
  var TransformJob: js.UndefOr[TransformJobStepMetadata] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the tuning job that was run by this step execution.
    */
  var TuningJob: js.UndefOr[TuningJobStepMetaData] = js.undefined
}
object PipelineExecutionStepMetadata {
  
  inline def apply(): PipelineExecutionStepMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineExecutionStepMetadata]
  }
  
  extension [Self <: PipelineExecutionStepMetadata](x: Self) {
    
    inline def setCallback(value: CallbackStepMetadata): Self = StObject.set(x, "Callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "Callback", js.undefined)
    
    inline def setClarifyCheck(value: ClarifyCheckStepMetadata): Self = StObject.set(x, "ClarifyCheck", value.asInstanceOf[js.Any])
    
    inline def setClarifyCheckUndefined: Self = StObject.set(x, "ClarifyCheck", js.undefined)
    
    inline def setCondition(value: ConditionStepMetadata): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    inline def setEMR(value: EMRStepMetadata): Self = StObject.set(x, "EMR", value.asInstanceOf[js.Any])
    
    inline def setEMRUndefined: Self = StObject.set(x, "EMR", js.undefined)
    
    inline def setFail(value: FailStepMetadata): Self = StObject.set(x, "Fail", value.asInstanceOf[js.Any])
    
    inline def setFailUndefined: Self = StObject.set(x, "Fail", js.undefined)
    
    inline def setLambda(value: LambdaStepMetadata): Self = StObject.set(x, "Lambda", value.asInstanceOf[js.Any])
    
    inline def setLambdaUndefined: Self = StObject.set(x, "Lambda", js.undefined)
    
    inline def setModel(value: ModelStepMetadata): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
    
    inline def setProcessingJob(value: ProcessingJobStepMetadata): Self = StObject.set(x, "ProcessingJob", value.asInstanceOf[js.Any])
    
    inline def setProcessingJobUndefined: Self = StObject.set(x, "ProcessingJob", js.undefined)
    
    inline def setQualityCheck(value: QualityCheckStepMetadata): Self = StObject.set(x, "QualityCheck", value.asInstanceOf[js.Any])
    
    inline def setQualityCheckUndefined: Self = StObject.set(x, "QualityCheck", js.undefined)
    
    inline def setRegisterModel(value: RegisterModelStepMetadata): Self = StObject.set(x, "RegisterModel", value.asInstanceOf[js.Any])
    
    inline def setRegisterModelUndefined: Self = StObject.set(x, "RegisterModel", js.undefined)
    
    inline def setTrainingJob(value: TrainingJobStepMetadata): Self = StObject.set(x, "TrainingJob", value.asInstanceOf[js.Any])
    
    inline def setTrainingJobUndefined: Self = StObject.set(x, "TrainingJob", js.undefined)
    
    inline def setTransformJob(value: TransformJobStepMetadata): Self = StObject.set(x, "TransformJob", value.asInstanceOf[js.Any])
    
    inline def setTransformJobUndefined: Self = StObject.set(x, "TransformJob", js.undefined)
    
    inline def setTuningJob(value: TuningJobStepMetaData): Self = StObject.set(x, "TuningJob", value.asInstanceOf[js.Any])
    
    inline def setTuningJobUndefined: Self = StObject.set(x, "TuningJob", js.undefined)
  }
}
