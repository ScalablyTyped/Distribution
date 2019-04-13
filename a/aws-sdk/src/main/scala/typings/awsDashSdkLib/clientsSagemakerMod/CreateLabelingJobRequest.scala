package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLabelingJobRequest extends js.Object {
  /**
    * Configures the information required for human workers to complete a labeling task.
    */
  var HumanTaskConfig: awsDashSdkLib.clientsSagemakerMod.HumanTaskConfig
  /**
    * Input data for the labeling job, such as the Amazon S3 location of the data objects and the location of the manifest file that describes the data objects.
    */
  var InputConfig: LabelingJobInputConfig
  /**
    * The attribute name to use for the label in the output manifest file. This is the key for the key/value pair formed with the label that a worker assigns to the object. The name can't end with "-metadata". If you are running a semantic segmentation labeling job, the attribute name must end with "-ref". If you are running any other kind of labeling job, the attribute name must not end with "-ref".
    */
  var LabelAttributeName: awsDashSdkLib.clientsSagemakerMod.LabelAttributeName
  /**
    * The S3 URL of the file that defines the categories used to label the data objects. The file is a JSON structure in the following format:  {    "document-version": "2018-11-28"    "labels": [    {    "label": "label 1"    },    {    "label": "label 2"    },    ...    {    "label": "label n"    }    ]   } 
    */
  var LabelCategoryConfigS3Uri: js.UndefOr[S3Uri] = js.undefined
  /**
    * Configures the information required to perform automated data labeling.
    */
  var LabelingJobAlgorithmsConfig: js.UndefOr[LabelingJobAlgorithmsConfig] = js.undefined
  /**
    * The name of the labeling job. This name is used to identify the job in a list of labeling jobs.
    */
  var LabelingJobName: awsDashSdkLib.clientsSagemakerMod.LabelingJobName
  /**
    * The location of the output data and the AWS Key Management Service key ID for the key used to encrypt the output data, if any.
    */
  var OutputConfig: LabelingJobOutputConfig
  /**
    * The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during data labeling. You must grant this role the necessary permissions so that Amazon SageMaker can successfully complete data labeling.
    */
  var RoleArn: awsDashSdkLib.clientsSagemakerMod.RoleArn
  /**
    * A set of conditions for stopping the labeling job. If any of the conditions are met, the job is automatically stopped. You can use these conditions to control the cost of data labeling.
    */
  var StoppingConditions: js.UndefOr[LabelingJobStoppingConditions] = js.undefined
  /**
    * An array of key/value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateLabelingJobRequest {
  @scala.inline
  def apply(
    HumanTaskConfig: HumanTaskConfig,
    InputConfig: LabelingJobInputConfig,
    LabelAttributeName: LabelAttributeName,
    LabelingJobName: LabelingJobName,
    OutputConfig: LabelingJobOutputConfig,
    RoleArn: RoleArn,
    LabelCategoryConfigS3Uri: S3Uri = null,
    LabelingJobAlgorithmsConfig: LabelingJobAlgorithmsConfig = null,
    StoppingConditions: LabelingJobStoppingConditions = null,
    Tags: TagList = null
  ): CreateLabelingJobRequest = {
    val __obj = js.Dynamic.literal(HumanTaskConfig = HumanTaskConfig, InputConfig = InputConfig, LabelAttributeName = LabelAttributeName, LabelingJobName = LabelingJobName, OutputConfig = OutputConfig, RoleArn = RoleArn)
    if (LabelCategoryConfigS3Uri != null) __obj.updateDynamic("LabelCategoryConfigS3Uri")(LabelCategoryConfigS3Uri)
    if (LabelingJobAlgorithmsConfig != null) __obj.updateDynamic("LabelingJobAlgorithmsConfig")(LabelingJobAlgorithmsConfig)
    if (StoppingConditions != null) __obj.updateDynamic("StoppingConditions")(StoppingConditions)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateLabelingJobRequest]
  }
}

