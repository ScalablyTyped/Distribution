package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the target.
    */
  var Arn: TargetArn
  /**
    * If the event target is an AWS Batch job, this contains the job definition, job name, and other parameters. For more information, see Jobs in the AWS Batch User Guide.
    */
  var BatchParameters: js.UndefOr[typings.awsDashSdk.clientsEventbridgeMod.BatchParameters] = js.undefined
  /**
    * Contains the Amazon ECS task definition and task count to be used if the event target is an Amazon ECS task. For more information about Amazon ECS tasks, see Task Definitions  in the Amazon EC2 Container Service Developer Guide.
    */
  var EcsParameters: js.UndefOr[typings.awsDashSdk.clientsEventbridgeMod.EcsParameters] = js.undefined
  /**
    * A name for the target. Use a string that will help you identify the target. Each target associated with a rule must have an Id unique for that rule.
    */
  var Id: TargetId
  /**
    * Valid JSON text passed to the target. In this case, nothing from the event itself is passed to the target. For more information, see The JavaScript Object Notation (JSON) Data Interchange Format.
    */
  var Input: js.UndefOr[TargetInput] = js.undefined
  /**
    * The value of the JSONPath that is used for extracting part of the matched event when passing it to the target. You must use JSON dot notation, not bracket notation. For more information about JSON paths, see JSONPath.
    */
  var InputPath: js.UndefOr[TargetInputPath] = js.undefined
  /**
    * Settings to enable you to provide custom input to a target based on certain event data. You can extract one or more key-value pairs from the event and then use that data to send customized input to the target.
    */
  var InputTransformer: js.UndefOr[typings.awsDashSdk.clientsEventbridgeMod.InputTransformer] = js.undefined
  /**
    * The custom parameter that you can use to control the shard assignment when the target is a Kinesis data stream. If you don't include this parameter, the default is to use the eventId as the partition key.
    */
  var KinesisParameters: js.UndefOr[typings.awsDashSdk.clientsEventbridgeMod.KinesisParameters] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. If one rule triggers multiple targets, you can use a different IAM role for each target.
    */
  var RoleArn: js.UndefOr[typings.awsDashSdk.clientsEventbridgeMod.RoleArn] = js.undefined
  /**
    * Parameters used when you are using the rule to invoke Amazon EC2 Run Command.
    */
  var RunCommandParameters: js.UndefOr[typings.awsDashSdk.clientsEventbridgeMod.RunCommandParameters] = js.undefined
  /**
    * Contains the message group ID to use when the target is a FIFO queue. If you specify an SQS FIFO queue as a target, the queue must have content-based deduplication enabled.
    */
  var SqsParameters: js.UndefOr[typings.awsDashSdk.clientsEventbridgeMod.SqsParameters] = js.undefined
}

object Target {
  @scala.inline
  def apply(
    Arn: TargetArn,
    Id: TargetId,
    BatchParameters: BatchParameters = null,
    EcsParameters: EcsParameters = null,
    Input: TargetInput = null,
    InputPath: TargetInputPath = null,
    InputTransformer: InputTransformer = null,
    KinesisParameters: KinesisParameters = null,
    RoleArn: RoleArn = null,
    RunCommandParameters: RunCommandParameters = null,
    SqsParameters: SqsParameters = null
  ): Target = {
    val __obj = js.Dynamic.literal(Arn = Arn, Id = Id)
    if (BatchParameters != null) __obj.updateDynamic("BatchParameters")(BatchParameters)
    if (EcsParameters != null) __obj.updateDynamic("EcsParameters")(EcsParameters)
    if (Input != null) __obj.updateDynamic("Input")(Input)
    if (InputPath != null) __obj.updateDynamic("InputPath")(InputPath)
    if (InputTransformer != null) __obj.updateDynamic("InputTransformer")(InputTransformer)
    if (KinesisParameters != null) __obj.updateDynamic("KinesisParameters")(KinesisParameters)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (RunCommandParameters != null) __obj.updateDynamic("RunCommandParameters")(RunCommandParameters)
    if (SqsParameters != null) __obj.updateDynamic("SqsParameters")(SqsParameters)
    __obj.asInstanceOf[Target]
  }
}

