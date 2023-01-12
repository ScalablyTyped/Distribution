package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the target.
    */
  var Arn: TargetArn
  
  /**
    * An object that contains information about an Amazon SQS queue that EventBridge Scheduler uses as a dead-letter queue for your schedule. If specified, EventBridge Scheduler delivers failed events that could not be successfully delivered to a target to the queue.
    */
  var DeadLetterConfig: js.UndefOr[typings.awsSdk.clientsSchedulerMod.DeadLetterConfig] = js.undefined
  
  /**
    * The templated target type for the Amazon ECS  RunTask  API operation.
    */
  var EcsParameters: js.UndefOr[typings.awsSdk.clientsSchedulerMod.EcsParameters] = js.undefined
  
  /**
    * The templated target type for the EventBridge  PutEvents  API operation.
    */
  var EventBridgeParameters: js.UndefOr[typings.awsSdk.clientsSchedulerMod.EventBridgeParameters] = js.undefined
  
  /**
    * The text, or well-formed JSON, passed to the target. If you are configuring a templated Lambda, AWS Step Functions, or Amazon EventBridge target, the input must be a well-formed JSON. For all other target types, a JSON is not required. If you do not specify anything for this field, EventBridge Scheduler delivers a default notification to the target.
    */
  var Input: js.UndefOr[TargetInput] = js.undefined
  
  /**
    * The templated target type for the Amazon Kinesis  PutRecord  API operation.
    */
  var KinesisParameters: js.UndefOr[typings.awsSdk.clientsSchedulerMod.KinesisParameters] = js.undefined
  
  /**
    * A RetryPolicy object that includes information about the retry policy settings, including the maximum age of an event, and the maximum number of times EventBridge Scheduler will try to deliver the event to a target.
    */
  var RetryPolicy: js.UndefOr[typings.awsSdk.clientsSchedulerMod.RetryPolicy] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that EventBridge Scheduler will use for this target when the schedule is invoked.
    */
  var RoleArn: typings.awsSdk.clientsSchedulerMod.RoleArn
  
  /**
    * The templated target type for the Amazon SageMaker  StartPipelineExecution  API operation.
    */
  var SageMakerPipelineParameters: js.UndefOr[typings.awsSdk.clientsSchedulerMod.SageMakerPipelineParameters] = js.undefined
  
  /**
    * The templated target type for the Amazon SQS  SendMessage  API operation. Contains the message group ID to use when the target is a FIFO queue. If you specify an Amazon SQS FIFO queue as a target, the queue must have content-based deduplication enabled. For more information, see Using the Amazon SQS message deduplication ID in the Amazon SQS Developer Guide.
    */
  var SqsParameters: js.UndefOr[typings.awsSdk.clientsSchedulerMod.SqsParameters] = js.undefined
}
object Target {
  
  inline def apply(Arn: TargetArn, RoleArn: RoleArn): Target = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
    
    inline def setArn(value: TargetArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setDeadLetterConfig(value: DeadLetterConfig): Self = StObject.set(x, "DeadLetterConfig", value.asInstanceOf[js.Any])
    
    inline def setDeadLetterConfigUndefined: Self = StObject.set(x, "DeadLetterConfig", js.undefined)
    
    inline def setEcsParameters(value: EcsParameters): Self = StObject.set(x, "EcsParameters", value.asInstanceOf[js.Any])
    
    inline def setEcsParametersUndefined: Self = StObject.set(x, "EcsParameters", js.undefined)
    
    inline def setEventBridgeParameters(value: EventBridgeParameters): Self = StObject.set(x, "EventBridgeParameters", value.asInstanceOf[js.Any])
    
    inline def setEventBridgeParametersUndefined: Self = StObject.set(x, "EventBridgeParameters", js.undefined)
    
    inline def setInput(value: TargetInput): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
    
    inline def setKinesisParameters(value: KinesisParameters): Self = StObject.set(x, "KinesisParameters", value.asInstanceOf[js.Any])
    
    inline def setKinesisParametersUndefined: Self = StObject.set(x, "KinesisParameters", js.undefined)
    
    inline def setRetryPolicy(value: RetryPolicy): Self = StObject.set(x, "RetryPolicy", value.asInstanceOf[js.Any])
    
    inline def setRetryPolicyUndefined: Self = StObject.set(x, "RetryPolicy", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setSageMakerPipelineParameters(value: SageMakerPipelineParameters): Self = StObject.set(x, "SageMakerPipelineParameters", value.asInstanceOf[js.Any])
    
    inline def setSageMakerPipelineParametersUndefined: Self = StObject.set(x, "SageMakerPipelineParameters", js.undefined)
    
    inline def setSqsParameters(value: SqsParameters): Self = StObject.set(x, "SqsParameters", value.asInstanceOf[js.Any])
    
    inline def setSqsParametersUndefined: Self = StObject.set(x, "SqsParameters", js.undefined)
  }
}
