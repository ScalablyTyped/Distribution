package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLabelingJobResponse extends js.Object {
  /**
    * The date and time that the labeling job was created.
    */
  var CreationTime: Timestamp
  /**
    * If the job failed, the reason that it failed. 
    */
  var FailureReason: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.FailureReason] = js.undefined
  /**
    * Configuration information required for human workers to complete a labeling task.
    */
  var HumanTaskConfig: typings.awsDashSdk.clientsSagemakerMod.HumanTaskConfig
  /**
    * Input configuration information for the labeling job, such as the Amazon S3 location of the data objects and the location of the manifest file that describes the data objects.
    */
  var InputConfig: LabelingJobInputConfig
  /**
    * A unique identifier for work done as part of a labeling job.
    */
  var JobReferenceCode: typings.awsDashSdk.clientsSagemakerMod.JobReferenceCode
  /**
    * The attribute used as the label in the output manifest file.
    */
  var LabelAttributeName: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.LabelAttributeName] = js.undefined
  /**
    * The S3 location of the JSON file that defines the categories used to label data objects. The file is a JSON structure in the following format:  {    "document-version": "2018-11-28"    "labels": [    {    "label": "label 1"    },    {    "label": "label 2"    },    ...    {    "label": "label n"    }    ]   } 
    */
  var LabelCategoryConfigS3Uri: js.UndefOr[S3Uri] = js.undefined
  /**
    * Provides a breakdown of the number of data objects labeled by humans, the number of objects labeled by machine, the number of objects than couldn't be labeled, and the total number of objects labeled. 
    */
  var LabelCounters: typings.awsDashSdk.clientsSagemakerMod.LabelCounters
  /**
    * Configuration information for automated data labeling.
    */
  var LabelingJobAlgorithmsConfig: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.LabelingJobAlgorithmsConfig] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the labeling job.
    */
  var LabelingJobArn: typings.awsDashSdk.clientsSagemakerMod.LabelingJobArn
  /**
    * The name assigned to the labeling job when it was created.
    */
  var LabelingJobName: typings.awsDashSdk.clientsSagemakerMod.LabelingJobName
  /**
    * The location of the output produced by the labeling job.
    */
  var LabelingJobOutput: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.LabelingJobOutput] = js.undefined
  /**
    * The processing status of the labeling job. 
    */
  var LabelingJobStatus: typings.awsDashSdk.clientsSagemakerMod.LabelingJobStatus
  /**
    * The date and time that the labeling job was last updated.
    */
  var LastModifiedTime: Timestamp
  /**
    * The location of the job's output data and the AWS Key Management Service key ID for the key used to encrypt the output data, if any.
    */
  var OutputConfig: LabelingJobOutputConfig
  /**
    * The Amazon Resource Name (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during data labeling.
    */
  var RoleArn: typings.awsDashSdk.clientsSagemakerMod.RoleArn
  /**
    * A set of conditions for stopping a labeling job. If any of the conditions are met, the job is automatically stopped.
    */
  var StoppingConditions: js.UndefOr[LabelingJobStoppingConditions] = js.undefined
  /**
    * An array of key/value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object DescribeLabelingJobResponse {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    HumanTaskConfig: HumanTaskConfig,
    InputConfig: LabelingJobInputConfig,
    JobReferenceCode: JobReferenceCode,
    LabelCounters: LabelCounters,
    LabelingJobArn: LabelingJobArn,
    LabelingJobName: LabelingJobName,
    LabelingJobStatus: LabelingJobStatus,
    LastModifiedTime: Timestamp,
    OutputConfig: LabelingJobOutputConfig,
    RoleArn: RoleArn,
    FailureReason: FailureReason = null,
    LabelAttributeName: LabelAttributeName = null,
    LabelCategoryConfigS3Uri: S3Uri = null,
    LabelingJobAlgorithmsConfig: LabelingJobAlgorithmsConfig = null,
    LabelingJobOutput: LabelingJobOutput = null,
    StoppingConditions: LabelingJobStoppingConditions = null,
    Tags: TagList = null
  ): DescribeLabelingJobResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime, HumanTaskConfig = HumanTaskConfig, InputConfig = InputConfig, JobReferenceCode = JobReferenceCode, LabelCounters = LabelCounters, LabelingJobArn = LabelingJobArn, LabelingJobName = LabelingJobName, LabelingJobStatus = LabelingJobStatus.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime, OutputConfig = OutputConfig, RoleArn = RoleArn)
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason)
    if (LabelAttributeName != null) __obj.updateDynamic("LabelAttributeName")(LabelAttributeName)
    if (LabelCategoryConfigS3Uri != null) __obj.updateDynamic("LabelCategoryConfigS3Uri")(LabelCategoryConfigS3Uri)
    if (LabelingJobAlgorithmsConfig != null) __obj.updateDynamic("LabelingJobAlgorithmsConfig")(LabelingJobAlgorithmsConfig)
    if (LabelingJobOutput != null) __obj.updateDynamic("LabelingJobOutput")(LabelingJobOutput)
    if (StoppingConditions != null) __obj.updateDynamic("StoppingConditions")(StoppingConditions)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[DescribeLabelingJobResponse]
  }
}

