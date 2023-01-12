package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLabelingJobRequest extends StObject {
  
  /**
    * Configures the labeling task and how it is presented to workers; including, but not limited to price, keywords, and batch size (task count).
    */
  var HumanTaskConfig: typings.awsSdk.clientsSagemakerMod.HumanTaskConfig
  
  /**
    * Input data for the labeling job, such as the Amazon S3 location of the data objects and the location of the manifest file that describes the data objects. You must specify at least one of the following: S3DataSource or SnsDataSource.    Use SnsDataSource to specify an SNS input topic for a streaming labeling job. If you do not specify and SNS input topic ARN, Ground Truth will create a one-time labeling job that stops after all data objects in the input manifest file have been labeled.   Use S3DataSource to specify an input manifest file for both streaming and one-time labeling jobs. Adding an S3DataSource is optional if you use SnsDataSource to create a streaming labeling job.   If you use the Amazon Mechanical Turk workforce, your input data should not include confidential information, personal information or protected health information. Use ContentClassifiers to specify that your data is free of personally identifiable information and adult content.
    */
  var InputConfig: LabelingJobInputConfig
  
  /**
    * The attribute name to use for the label in the output manifest file. This is the key for the key/value pair formed with the label that a worker assigns to the object. The LabelAttributeName must meet the following requirements.   The name can't end with "-metadata".    If you are using one of the following built-in task types, the attribute name must end with "-ref". If the task type you are using is not listed below, the attribute name must not end with "-ref".   Image semantic segmentation (SemanticSegmentation), and adjustment (AdjustmentSemanticSegmentation) and verification (VerificationSemanticSegmentation) labeling jobs for this task type.   Video frame object detection (VideoObjectDetection), and adjustment and verification (AdjustmentVideoObjectDetection) labeling jobs for this task type.   Video frame object tracking (VideoObjectTracking), and adjustment and verification (AdjustmentVideoObjectTracking) labeling jobs for this task type.   3D point cloud semantic segmentation (3DPointCloudSemanticSegmentation), and adjustment and verification (Adjustment3DPointCloudSemanticSegmentation) labeling jobs for this task type.    3D point cloud object tracking (3DPointCloudObjectTracking), and adjustment and verification (Adjustment3DPointCloudObjectTracking) labeling jobs for this task type.        If you are creating an adjustment or verification labeling job, you must use a different LabelAttributeName than the one used in the original labeling job. The original labeling job is the Ground Truth labeling job that produced the labels that you want verified or adjusted. To learn more about adjustment and verification labeling jobs, see Verify and Adjust Labels. 
    */
  var LabelAttributeName: typings.awsSdk.clientsSagemakerMod.LabelAttributeName
  
  /**
    * The S3 URI of the file, referred to as a label category configuration file, that defines the categories used to label the data objects. For 3D point cloud and video frame task types, you can add label category attributes and frame attributes to your label category configuration file. To learn how, see Create a Labeling Category Configuration File for 3D Point Cloud Labeling Jobs.  For named entity recognition jobs, in addition to "labels", you must provide worker instructions in the label category configuration file using the "instructions" parameter: "instructions": {"shortInstruction":"&lt;h1&gt;Add header&lt;/h1&gt;&lt;p&gt;Add Instructions&lt;/p&gt;", "fullInstruction":"&lt;p&gt;Add additional instructions.&lt;/p&gt;"}. For details and an example, see Create a Named Entity Recognition Labeling Job (API) . For all other built-in task types and custom tasks, your label category configuration file must be a JSON file in the following format. Identify the labels you want to use by replacing label_1, label_2,...,label_n with your label categories.  {    "document-version": "2018-11-28",   "labels": [{"label": "label_1"},{"label": "label_2"},...{"label": "label_n"}]   }  Note the following about the label category configuration file:   For image classification and text classification (single and multi-label) you must specify at least two label categories. For all other task types, the minimum number of label categories required is one.    Each label category must be unique, you cannot specify duplicate label categories.   If you create a 3D point cloud or video frame adjustment or verification labeling job, you must include auditLabelAttributeName in the label category configuration. Use this parameter to enter the  LabelAttributeName  of the labeling job you want to adjust or verify annotations of.  
    */
  var LabelCategoryConfigS3Uri: js.UndefOr[S3Uri] = js.undefined
  
  /**
    * Configures the information required to perform automated data labeling.
    */
  var LabelingJobAlgorithmsConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.LabelingJobAlgorithmsConfig] = js.undefined
  
  /**
    * The name of the labeling job. This name is used to identify the job in a list of labeling jobs. Labeling job names must be unique within an Amazon Web Services account and region. LabelingJobName is not case sensitive. For example, Example-job and example-job are considered the same labeling job name by Ground Truth.
    */
  var LabelingJobName: typings.awsSdk.clientsSagemakerMod.LabelingJobName
  
  /**
    * The location of the output data and the Amazon Web Services Key Management Service key ID for the key used to encrypt the output data, if any.
    */
  var OutputConfig: LabelingJobOutputConfig
  
  /**
    * The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during data labeling. You must grant this role the necessary permissions so that Amazon SageMaker can successfully complete data labeling.
    */
  var RoleArn: typings.awsSdk.clientsSagemakerMod.RoleArn
  
  /**
    * A set of conditions for stopping the labeling job. If any of the conditions are met, the job is automatically stopped. You can use these conditions to control the cost of data labeling.
    */
  var StoppingConditions: js.UndefOr[LabelingJobStoppingConditions] = js.undefined
  
  /**
    * An array of key/value pairs. For more information, see Using Cost Allocation Tags in the Amazon Web Services Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateLabelingJobRequest {
  
  inline def apply(
    HumanTaskConfig: HumanTaskConfig,
    InputConfig: LabelingJobInputConfig,
    LabelAttributeName: LabelAttributeName,
    LabelingJobName: LabelingJobName,
    OutputConfig: LabelingJobOutputConfig,
    RoleArn: RoleArn
  ): CreateLabelingJobRequest = {
    val __obj = js.Dynamic.literal(HumanTaskConfig = HumanTaskConfig.asInstanceOf[js.Any], InputConfig = InputConfig.asInstanceOf[js.Any], LabelAttributeName = LabelAttributeName.asInstanceOf[js.Any], LabelingJobName = LabelingJobName.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLabelingJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLabelingJobRequest] (val x: Self) extends AnyVal {
    
    inline def setHumanTaskConfig(value: HumanTaskConfig): Self = StObject.set(x, "HumanTaskConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfig(value: LabelingJobInputConfig): Self = StObject.set(x, "InputConfig", value.asInstanceOf[js.Any])
    
    inline def setLabelAttributeName(value: LabelAttributeName): Self = StObject.set(x, "LabelAttributeName", value.asInstanceOf[js.Any])
    
    inline def setLabelCategoryConfigS3Uri(value: S3Uri): Self = StObject.set(x, "LabelCategoryConfigS3Uri", value.asInstanceOf[js.Any])
    
    inline def setLabelCategoryConfigS3UriUndefined: Self = StObject.set(x, "LabelCategoryConfigS3Uri", js.undefined)
    
    inline def setLabelingJobAlgorithmsConfig(value: LabelingJobAlgorithmsConfig): Self = StObject.set(x, "LabelingJobAlgorithmsConfig", value.asInstanceOf[js.Any])
    
    inline def setLabelingJobAlgorithmsConfigUndefined: Self = StObject.set(x, "LabelingJobAlgorithmsConfig", js.undefined)
    
    inline def setLabelingJobName(value: LabelingJobName): Self = StObject.set(x, "LabelingJobName", value.asInstanceOf[js.Any])
    
    inline def setOutputConfig(value: LabelingJobOutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setStoppingConditions(value: LabelingJobStoppingConditions): Self = StObject.set(x, "StoppingConditions", value.asInstanceOf[js.Any])
    
    inline def setStoppingConditionsUndefined: Self = StObject.set(x, "StoppingConditions", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
