package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HumanTaskConfig extends js.Object {
  /**
    * Configures how labels are consolidated across human workers.
    */
  var AnnotationConsolidationConfig: awsDashSdkLib.clientsSagemakerMod.AnnotationConsolidationConfig
  /**
    * Defines the maximum number of data objects that can be labeled by human workers at the same time. Each object may have more than one worker at one time.
    */
  var MaxConcurrentTaskCount: js.UndefOr[MaxConcurrentTaskCount] = js.undefined
  /**
    * The number of human workers that will label an object. 
    */
  var NumberOfHumanWorkersPerDataObject: awsDashSdkLib.clientsSagemakerMod.NumberOfHumanWorkersPerDataObject
  /**
    * The Amazon Resource Name (ARN) of a Lambda function that is run before a data object is sent to a human worker. Use this function to provide input to a custom labeling job. For the built-in bounding box, image classification, semantic segmentation, and text classification task types, Amazon SageMaker Ground Truth provides the following Lambda functions:  US East (Northern Virginia) (us-east-1):     arn:aws:lambda:us-east-1:432418664414:function:PRE-BoundingBox     arn:aws:lambda:us-east-1:432418664414:function:PRE-ImageMultiClass     arn:aws:lambda:us-east-1:432418664414:function:PRE-SemanticSegmentation     arn:aws:lambda:us-east-1:432418664414:function:PRE-TextMultiClass     US East (Ohio) (us-east-2):     arn:aws:lambda:us-east-2:266458841044:function:PRE-BoundingBox     arn:aws:lambda:us-east-2:266458841044:function:PRE-ImageMultiClass     arn:aws:lambda:us-east-2:266458841044:function:PRE-SemanticSegmentation     arn:aws:lambda:us-east-2:266458841044:function:PRE-TextMultiClass     US West (Oregon) (us-west-2):     arn:aws:lambda:us-west-2:081040173940:function:PRE-BoundingBox     arn:aws:lambda:us-west-2:081040173940:function:PRE-ImageMultiClass     arn:aws:lambda:us-west-2:081040173940:function:PRE-SemanticSegmentation     arn:aws:lambda:us-west-2:081040173940:function:PRE-TextMultiClass     EU (Ireland) (eu-west-1):     arn:aws:lambda:eu-west-1:568282634449:function:PRE-BoundingBox     arn:aws:lambda:eu-west-1:568282634449:function:PRE-ImageMultiClass     arn:aws:lambda:eu-west-1:568282634449:function:PRE-SemanticSegmentation     arn:aws:lambda:eu-west-1:568282634449:function:PRE-TextMultiClass     Asia Pacific (Tokyo (ap-northeast-1):     arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-BoundingBox     arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-ImageMultiClass     arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-SemanticSegmentation     arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-TextMultiClass   
    */
  var PreHumanTaskLambdaArn: LambdaFunctionArn
  /**
    * The price that you pay for each task performed by a public worker.
    */
  var PublicWorkforceTaskPrice: js.UndefOr[PublicWorkforceTaskPrice] = js.undefined
  /**
    * The length of time that a task remains available for labelling by human workers.
    */
  var TaskAvailabilityLifetimeInSeconds: js.UndefOr[TaskAvailabilityLifetimeInSeconds] = js.undefined
  /**
    * A description of the task for your human workers.
    */
  var TaskDescription: awsDashSdkLib.clientsSagemakerMod.TaskDescription
  /**
    * Keywords used to describe the task so that workers on Amazon Mechanical Turk can discover the task.
    */
  var TaskKeywords: js.UndefOr[TaskKeywords] = js.undefined
  /**
    * The amount of time that a worker has to complete a task.
    */
  var TaskTimeLimitInSeconds: awsDashSdkLib.clientsSagemakerMod.TaskTimeLimitInSeconds
  /**
    * A title for the task for your human workers.
    */
  var TaskTitle: awsDashSdkLib.clientsSagemakerMod.TaskTitle
  /**
    * Information about the user interface that workers use to complete the labeling task.
    */
  var UiConfig: awsDashSdkLib.clientsSagemakerMod.UiConfig
  /**
    * The Amazon Resource Name (ARN) of the work team assigned to complete the tasks.
    */
  var WorkteamArn: awsDashSdkLib.clientsSagemakerMod.WorkteamArn
}

object HumanTaskConfig {
  @scala.inline
  def apply(
    AnnotationConsolidationConfig: AnnotationConsolidationConfig,
    NumberOfHumanWorkersPerDataObject: NumberOfHumanWorkersPerDataObject,
    PreHumanTaskLambdaArn: LambdaFunctionArn,
    TaskDescription: TaskDescription,
    TaskTimeLimitInSeconds: TaskTimeLimitInSeconds,
    TaskTitle: TaskTitle,
    UiConfig: UiConfig,
    WorkteamArn: WorkteamArn,
    MaxConcurrentTaskCount: js.UndefOr[MaxConcurrentTaskCount] = js.undefined,
    PublicWorkforceTaskPrice: PublicWorkforceTaskPrice = null,
    TaskAvailabilityLifetimeInSeconds: js.UndefOr[TaskAvailabilityLifetimeInSeconds] = js.undefined,
    TaskKeywords: TaskKeywords = null
  ): HumanTaskConfig = {
    val __obj = js.Dynamic.literal(AnnotationConsolidationConfig = AnnotationConsolidationConfig, NumberOfHumanWorkersPerDataObject = NumberOfHumanWorkersPerDataObject, PreHumanTaskLambdaArn = PreHumanTaskLambdaArn, TaskDescription = TaskDescription, TaskTimeLimitInSeconds = TaskTimeLimitInSeconds, TaskTitle = TaskTitle, UiConfig = UiConfig, WorkteamArn = WorkteamArn)
    if (!js.isUndefined(MaxConcurrentTaskCount)) __obj.updateDynamic("MaxConcurrentTaskCount")(MaxConcurrentTaskCount)
    if (PublicWorkforceTaskPrice != null) __obj.updateDynamic("PublicWorkforceTaskPrice")(PublicWorkforceTaskPrice)
    if (!js.isUndefined(TaskAvailabilityLifetimeInSeconds)) __obj.updateDynamic("TaskAvailabilityLifetimeInSeconds")(TaskAvailabilityLifetimeInSeconds)
    if (TaskKeywords != null) __obj.updateDynamic("TaskKeywords")(TaskKeywords)
    __obj.asInstanceOf[HumanTaskConfig]
  }
}

