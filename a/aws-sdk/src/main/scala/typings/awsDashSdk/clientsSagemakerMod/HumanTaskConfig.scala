package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanTaskConfig extends js.Object {
  /**
    * Configures how labels are consolidated across human workers.
    */
  var AnnotationConsolidationConfig: typings.awsDashSdk.clientsSagemakerMod.AnnotationConsolidationConfig = js.native
  /**
    * Defines the maximum number of data objects that can be labeled by human workers at the same time. Also referred to as batch size. Each object may have more than one worker at one time.
    */
  var MaxConcurrentTaskCount: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MaxConcurrentTaskCount] = js.native
  /**
    * The number of human workers that will label an object. 
    */
  var NumberOfHumanWorkersPerDataObject: typings.awsDashSdk.clientsSagemakerMod.NumberOfHumanWorkersPerDataObject = js.native
  /**
    * The Amazon Resource Name (ARN) of a Lambda function that is run before a data object is sent to a human worker. Use this function to provide input to a custom labeling job. For the built-in bounding box, image classification, semantic segmentation, and text classification task types, Amazon SageMaker Ground Truth provides the following Lambda functions:  US East (Northern Virginia) (us-east-1):     arn:aws:lambda:us-east-1:432418664414:function:PRE-BoundingBox     arn:aws:lambda:us-east-1:432418664414:function:PRE-ImageMultiClass     arn:aws:lambda:us-east-1:432418664414:function:PRE-SemanticSegmentation     arn:aws:lambda:us-east-1:432418664414:function:PRE-TextMultiClass     arn:aws:lambda:us-east-1:432418664414:function:PRE-NamedEntityRecognition     arn:aws:lambda:us-east-1:432418664414:function:PRE-VerificationBoundingBox     arn:aws:lambda:us-east-1:432418664414:function:PRE-VerificationSemanticSegmentation     arn:aws:lambda:us-east-1:432418664414:function:PRE-AdjustmentBoundingBox     arn:aws:lambda:us-east-1:432418664414:function:PRE-AdjustmentSemanticSegmentation     US East (Ohio) (us-east-2):     arn:aws:lambda:us-east-2:266458841044:function:PRE-BoundingBox     arn:aws:lambda:us-east-2:266458841044:function:PRE-ImageMultiClass     arn:aws:lambda:us-east-2:266458841044:function:PRE-SemanticSegmentation     arn:aws:lambda:us-east-2:266458841044:function:PRE-TextMultiClass     arn:aws:lambda:us-east-2:266458841044:function:PRE-NamedEntityRecognition     arn:aws:lambda:us-east-2:266458841044:function:PRE-VerificationBoundingBox     arn:aws:lambda:us-east-2:266458841044:function:PRE-VerificationSemanticSegmentation     arn:aws:lambda:us-east-2:266458841044:function:PRE-AdjustmentBoundingBox     arn:aws:lambda:us-east-2:266458841044:function:PRE-AdjustmentSemanticSegmentation     US West (Oregon) (us-west-2):     arn:aws:lambda:us-west-2:081040173940:function:PRE-BoundingBox     arn:aws:lambda:us-west-2:081040173940:function:PRE-ImageMultiClass     arn:aws:lambda:us-west-2:081040173940:function:PRE-SemanticSegmentation     arn:aws:lambda:us-west-2:081040173940:function:PRE-TextMultiClass     arn:aws:lambda:us-west-2:081040173940:function:PRE-NamedEntityRecognition     arn:aws:lambda:us-west-2:081040173940:function:PRE-VerificationBoundingBox     arn:aws:lambda:us-west-2:081040173940:function:PRE-VerificationSemanticSegmentation     arn:aws:lambda:us-west-2:081040173940:function:PRE-AdjustmentBoundingBox     arn:aws:lambda:us-west-2:081040173940:function:PRE-AdjustmentSemanticSegmentation     Canada (Central) (ca-central-1):     arn:aws:lambda:ca-central-1:918755190332:function:PRE-BoundingBox     arn:aws:lambda:ca-central-1:918755190332:function:PRE-ImageMultiClass     arn:aws:lambda:ca-central-1:918755190332:function:PRE-SemanticSegmentation     arn:aws:lambda:ca-central-1:918755190332:function:PRE-TextMultiClass     arn:aws:lambda:ca-central-1:918755190332:function:PRE-NamedEntityRecognition     arn:aws:lambda:ca-central-1:918755190332:function:PRE-VerificationBoundingBox     arn:aws:lambda:ca-central-1:918755190332:function:PRE-VerificationSemanticSegmentation     arn:aws:lambda:ca-central-1:918755190332:function:PRE-AdjustmentBoundingBox     arn:aws:lambda:ca-central-1:918755190332:function:PRE-AdjustmentSemanticSegmentation     EU (Ireland) (eu-west-1):     arn:aws:lambda:eu-west-1:568282634449:function:PRE-BoundingBox     arn:aws:lambda:eu-west-1:568282634449:function:PRE-ImageMultiClass     arn:aws:lambda:eu-west-1:568282634449:function:PRE-SemanticSegmentation     arn:aws:lambda:eu-west-1:568282634449:function:PRE-TextMultiClass     arn:aws:lambda:eu-west-1:568282634449:function:PRE-NamedEntityRecognition     arn:aws:lambda:eu-west-1:568282634449:function:PRE-VerificationBoundingBox     arn:aws:lambda:eu-west-1:568282634449:function:PRE-VerificationSemanticSegmentation     arn:aws:lambda:eu-west-1:568282634449:function:PRE-AdjustmentBoundingBox     arn:aws:lambda:eu-west-1:568282634449:function:PRE-AdjustmentSemanticSegmentation     EU (London) (eu-west-2):     arn:aws:lambda:eu-west-2:487402164563:function:PRE-BoundingBox     arn:aws:lambda:eu-west-2:487402164563:function:PRE-ImageMultiClass     arn:aws:lambda:eu-west-2:487402164563:function:PRE-SemanticSegmentation     arn:aws:lambda:eu-west-2:487402164563:function:PRE-TextMultiClass     arn:aws:lambda:eu-west-2:487402164563:function:PRE-NamedEntityRecognition     arn:aws:lambda:eu-west-2:487402164563:function:PRE-VerificationBoundingBox     arn:aws:lambda:eu-west-2:487402164563:function:PRE-VerificationSemanticSegmentation     arn:aws:lambda:eu-west-2:487402164563:function:PRE-AdjustmentBoundingBox     arn:aws:lambda:eu-west-2:487402164563:function:PRE-AdjustmentSemanticSegmentation     EU Frankfurt (eu-central-1):     arn:aws:lambda:eu-central-1:203001061592:function:PRE-BoundingBox     arn:aws:lambda:eu-central-1:203001061592:function:PRE-ImageMultiClass     arn:aws:lambda:eu-central-1:203001061592:function:PRE-SemanticSegmentation     arn:aws:lambda:eu-central-1:203001061592:function:PRE-TextMultiClass     arn:aws:lambda:eu-central-1:203001061592:function:PRE-NamedEntityRecognition     arn:aws:lambda:eu-central-1:203001061592:function:PRE-VerificationBoundingBox     arn:aws:lambda:eu-central-1:203001061592:function:PRE-VerificationSemanticSegmentation     arn:aws:lambda:eu-central-1:203001061592:function:PRE-AdjustmentBoundingBox     arn:aws:lambda:eu-central-1:203001061592:function:PRE-AdjustmentSemanticSegmentation     Asia Pacific (Tokyo) (ap-northeast-1):     arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-BoundingBox     arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-ImageMultiClass     arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-SemanticSegmentation     arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-TextMultiClass     arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-NamedEntityRecognition     arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-VerificationBoundingBox     arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-VerificationSemanticSegmentation     arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-AdjustmentBoundingBox     arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-AdjustmentSemanticSegmentation     Asia Pacific (Seoul) (ap-northeast-2):     arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-BoundingBox     arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-ImageMultiClass     arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-SemanticSegmentation     arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-TextMultiClass     arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-NamedEntityRecognition     arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-VerificationBoundingBox     arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-VerificationSemanticSegmentation     arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-AdjustmentBoundingBox     arn:aws:lambda:ap-northeast-2:845288260483:function:PRE-AdjustmentSemanticSegmentation     Asia Pacific (Mumbai) (ap-south-1):     arn:aws:lambda:ap-south-1:565803892007:function:PRE-BoundingBox     arn:aws:lambda:ap-south-1:565803892007:function:PRE-ImageMultiClass     arn:aws:lambda:ap-south-1:565803892007:function:PRE-SemanticSegmentation     arn:aws:lambda:ap-south-1:565803892007:function:PRE-TextMultiClass     arn:aws:lambda:ap-south-1:565803892007:function:PRE-NamedEntityRecognition     arn:aws:lambda:ap-south-1:565803892007:function:PRE-VerificationBoundingBox     arn:aws:lambda:ap-south-1:565803892007:function:PRE-VerificationSemanticSegmentation     arn:aws:lambda:ap-south-1:565803892007:function:PRE-AdjustmentBoundingBox     arn:aws:lambda:ap-south-1:565803892007:function:PRE-AdjustmentSemanticSegmentation     Asia Pacific (Singapore) (ap-southeast-1):     arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-BoundingBox     arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-ImageMultiClass     arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-SemanticSegmentation     arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-TextMultiClass     arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-NamedEntityRecognition     arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-VerificationBoundingBox     arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-VerificationSemanticSegmentation     arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-AdjustmentBoundingBox     arn:aws:lambda:ap-southeast-1:377565633583:function:PRE-AdjustmentSemanticSegmentation     Asia Pacific (Sydney) (ap-southeast-2):     arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-BoundingBox     arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-ImageMultiClass     arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-SemanticSegmentation     arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-TextMultiClass     arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-NamedEntityRecognition     arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-VerificationBoundingBox     arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-VerificationSemanticSegmentation     arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-AdjustmentBoundingBox     arn:aws:lambda:ap-southeast-2:454466003867:function:PRE-AdjustmentSemanticSegmentation   
    */
  var PreHumanTaskLambdaArn: LambdaFunctionArn = js.native
  /**
    * The price that you pay for each task performed by an Amazon Mechanical Turk worker.
    */
  var PublicWorkforceTaskPrice: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.PublicWorkforceTaskPrice] = js.native
  /**
    * The length of time that a task remains available for labeling by human workers. If you choose the Amazon Mechanical Turk workforce, the maximum is 12 hours (43200). For private and vendor workforces, the maximum is as listed.
    */
  var TaskAvailabilityLifetimeInSeconds: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.TaskAvailabilityLifetimeInSeconds] = js.native
  /**
    * A description of the task for your human workers.
    */
  var TaskDescription: typings.awsDashSdk.clientsSagemakerMod.TaskDescription = js.native
  /**
    * Keywords used to describe the task so that workers on Amazon Mechanical Turk can discover the task.
    */
  var TaskKeywords: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.TaskKeywords] = js.native
  /**
    * The amount of time that a worker has to complete a task.
    */
  var TaskTimeLimitInSeconds: typings.awsDashSdk.clientsSagemakerMod.TaskTimeLimitInSeconds = js.native
  /**
    * A title for the task for your human workers.
    */
  var TaskTitle: typings.awsDashSdk.clientsSagemakerMod.TaskTitle = js.native
  /**
    * Information about the user interface that workers use to complete the labeling task.
    */
  var UiConfig: typings.awsDashSdk.clientsSagemakerMod.UiConfig = js.native
  /**
    * The Amazon Resource Name (ARN) of the work team assigned to complete the tasks.
    */
  var WorkteamArn: typings.awsDashSdk.clientsSagemakerMod.WorkteamArn = js.native
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
    MaxConcurrentTaskCount: Int | Double = null,
    PublicWorkforceTaskPrice: PublicWorkforceTaskPrice = null,
    TaskAvailabilityLifetimeInSeconds: Int | Double = null,
    TaskKeywords: TaskKeywords = null
  ): HumanTaskConfig = {
    val __obj = js.Dynamic.literal(AnnotationConsolidationConfig = AnnotationConsolidationConfig.asInstanceOf[js.Any], NumberOfHumanWorkersPerDataObject = NumberOfHumanWorkersPerDataObject.asInstanceOf[js.Any], PreHumanTaskLambdaArn = PreHumanTaskLambdaArn.asInstanceOf[js.Any], TaskDescription = TaskDescription.asInstanceOf[js.Any], TaskTimeLimitInSeconds = TaskTimeLimitInSeconds.asInstanceOf[js.Any], TaskTitle = TaskTitle.asInstanceOf[js.Any], UiConfig = UiConfig.asInstanceOf[js.Any], WorkteamArn = WorkteamArn.asInstanceOf[js.Any])
    if (MaxConcurrentTaskCount != null) __obj.updateDynamic("MaxConcurrentTaskCount")(MaxConcurrentTaskCount.asInstanceOf[js.Any])
    if (PublicWorkforceTaskPrice != null) __obj.updateDynamic("PublicWorkforceTaskPrice")(PublicWorkforceTaskPrice.asInstanceOf[js.Any])
    if (TaskAvailabilityLifetimeInSeconds != null) __obj.updateDynamic("TaskAvailabilityLifetimeInSeconds")(TaskAvailabilityLifetimeInSeconds.asInstanceOf[js.Any])
    if (TaskKeywords != null) __obj.updateDynamic("TaskKeywords")(TaskKeywords.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanTaskConfig]
  }
}

