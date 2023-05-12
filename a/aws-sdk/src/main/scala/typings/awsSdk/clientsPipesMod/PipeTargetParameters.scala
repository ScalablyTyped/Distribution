package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeTargetParameters extends StObject {
  
  /**
    * The parameters for using an Batch job as a target.
    */
  var BatchJobParameters: js.UndefOr[PipeTargetBatchJobParameters] = js.undefined
  
  /**
    * The parameters for using an CloudWatch Logs log stream as a target.
    */
  var CloudWatchLogsParameters: js.UndefOr[PipeTargetCloudWatchLogsParameters] = js.undefined
  
  /**
    * The parameters for using an Amazon ECS task as a target.
    */
  var EcsTaskParameters: js.UndefOr[PipeTargetEcsTaskParameters] = js.undefined
  
  /**
    * The parameters for using an EventBridge event bus as a target.
    */
  var EventBridgeEventBusParameters: js.UndefOr[PipeTargetEventBridgeEventBusParameters] = js.undefined
  
  /**
    * These are custom parameter to be used when the target is an API Gateway REST APIs or EventBridge ApiDestinations.
    */
  var HttpParameters: js.UndefOr[PipeTargetHttpParameters] = js.undefined
  
  /**
    * Valid JSON text passed to the target. In this case, nothing from the event itself is passed to the target. For more information, see The JavaScript Object Notation (JSON) Data Interchange Format.
    */
  var InputTemplate: js.UndefOr[typings.awsSdk.clientsPipesMod.InputTemplate] = js.undefined
  
  /**
    * The parameters for using a Kinesis stream as a source.
    */
  var KinesisStreamParameters: js.UndefOr[PipeTargetKinesisStreamParameters] = js.undefined
  
  /**
    * The parameters for using a Lambda function as a target.
    */
  var LambdaFunctionParameters: js.UndefOr[PipeTargetLambdaFunctionParameters] = js.undefined
  
  /**
    * These are custom parameters to be used when the target is a Amazon Redshift cluster to invoke the Amazon Redshift Data API ExecuteStatement.
    */
  var RedshiftDataParameters: js.UndefOr[PipeTargetRedshiftDataParameters] = js.undefined
  
  /**
    * The parameters for using a SageMaker pipeline as a target.
    */
  var SageMakerPipelineParameters: js.UndefOr[PipeTargetSageMakerPipelineParameters] = js.undefined
  
  /**
    * The parameters for using a Amazon SQS stream as a source.
    */
  var SqsQueueParameters: js.UndefOr[PipeTargetSqsQueueParameters] = js.undefined
  
  /**
    * The parameters for using a Step Functions state machine as a target.
    */
  var StepFunctionStateMachineParameters: js.UndefOr[PipeTargetStateMachineParameters] = js.undefined
}
object PipeTargetParameters {
  
  inline def apply(): PipeTargetParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipeTargetParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipeTargetParameters] (val x: Self) extends AnyVal {
    
    inline def setBatchJobParameters(value: PipeTargetBatchJobParameters): Self = StObject.set(x, "BatchJobParameters", value.asInstanceOf[js.Any])
    
    inline def setBatchJobParametersUndefined: Self = StObject.set(x, "BatchJobParameters", js.undefined)
    
    inline def setCloudWatchLogsParameters(value: PipeTargetCloudWatchLogsParameters): Self = StObject.set(x, "CloudWatchLogsParameters", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsParametersUndefined: Self = StObject.set(x, "CloudWatchLogsParameters", js.undefined)
    
    inline def setEcsTaskParameters(value: PipeTargetEcsTaskParameters): Self = StObject.set(x, "EcsTaskParameters", value.asInstanceOf[js.Any])
    
    inline def setEcsTaskParametersUndefined: Self = StObject.set(x, "EcsTaskParameters", js.undefined)
    
    inline def setEventBridgeEventBusParameters(value: PipeTargetEventBridgeEventBusParameters): Self = StObject.set(x, "EventBridgeEventBusParameters", value.asInstanceOf[js.Any])
    
    inline def setEventBridgeEventBusParametersUndefined: Self = StObject.set(x, "EventBridgeEventBusParameters", js.undefined)
    
    inline def setHttpParameters(value: PipeTargetHttpParameters): Self = StObject.set(x, "HttpParameters", value.asInstanceOf[js.Any])
    
    inline def setHttpParametersUndefined: Self = StObject.set(x, "HttpParameters", js.undefined)
    
    inline def setInputTemplate(value: InputTemplate): Self = StObject.set(x, "InputTemplate", value.asInstanceOf[js.Any])
    
    inline def setInputTemplateUndefined: Self = StObject.set(x, "InputTemplate", js.undefined)
    
    inline def setKinesisStreamParameters(value: PipeTargetKinesisStreamParameters): Self = StObject.set(x, "KinesisStreamParameters", value.asInstanceOf[js.Any])
    
    inline def setKinesisStreamParametersUndefined: Self = StObject.set(x, "KinesisStreamParameters", js.undefined)
    
    inline def setLambdaFunctionParameters(value: PipeTargetLambdaFunctionParameters): Self = StObject.set(x, "LambdaFunctionParameters", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionParametersUndefined: Self = StObject.set(x, "LambdaFunctionParameters", js.undefined)
    
    inline def setRedshiftDataParameters(value: PipeTargetRedshiftDataParameters): Self = StObject.set(x, "RedshiftDataParameters", value.asInstanceOf[js.Any])
    
    inline def setRedshiftDataParametersUndefined: Self = StObject.set(x, "RedshiftDataParameters", js.undefined)
    
    inline def setSageMakerPipelineParameters(value: PipeTargetSageMakerPipelineParameters): Self = StObject.set(x, "SageMakerPipelineParameters", value.asInstanceOf[js.Any])
    
    inline def setSageMakerPipelineParametersUndefined: Self = StObject.set(x, "SageMakerPipelineParameters", js.undefined)
    
    inline def setSqsQueueParameters(value: PipeTargetSqsQueueParameters): Self = StObject.set(x, "SqsQueueParameters", value.asInstanceOf[js.Any])
    
    inline def setSqsQueueParametersUndefined: Self = StObject.set(x, "SqsQueueParameters", js.undefined)
    
    inline def setStepFunctionStateMachineParameters(value: PipeTargetStateMachineParameters): Self = StObject.set(x, "StepFunctionStateMachineParameters", value.asInstanceOf[js.Any])
    
    inline def setStepFunctionStateMachineParametersUndefined: Self = StObject.set(x, "StepFunctionStateMachineParameters", js.undefined)
  }
}
