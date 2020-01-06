package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugRuleConfiguration extends js.Object {
  /**
    * The instance type to deploy for a training job.
    */
  var InstanceType: js.UndefOr[ProcessingInstanceType] = js.native
  /**
    * Path to local storage location for rules. Defaults to /opt/ml/processing/output/rule/.
    */
  var LocalPath: js.UndefOr[DirectoryPath] = js.native
  /**
    * The name of the rule configuration. It must be unique relative to other rule configuration names.
    */
  var RuleConfigurationName: typings.awsDashSdk.clientsSagemakerMod.RuleConfigurationName = js.native
  /**
    * The Amazon Elastic Container (ECR) Image for the managed rule evaluation.
    */
  var RuleEvaluatorImage: AlgorithmImage = js.native
  /**
    *  Runtime configuration for rule container.
    */
  var RuleParameters: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.RuleParameters] = js.native
  /**
    * Path to Amazon S3 storage location for rules.
    */
  var S3OutputPath: js.UndefOr[S3Uri] = js.native
  /**
    * The size, in GB, of the ML storage volume attached to the notebook instance.
    */
  var VolumeSizeInGB: js.UndefOr[OptionalVolumeSizeInGB] = js.native
}

object DebugRuleConfiguration {
  @scala.inline
  def apply(
    RuleConfigurationName: RuleConfigurationName,
    RuleEvaluatorImage: AlgorithmImage,
    InstanceType: ProcessingInstanceType = null,
    LocalPath: DirectoryPath = null,
    RuleParameters: RuleParameters = null,
    S3OutputPath: S3Uri = null,
    VolumeSizeInGB: Int | Double = null
  ): DebugRuleConfiguration = {
    val __obj = js.Dynamic.literal(RuleConfigurationName = RuleConfigurationName.asInstanceOf[js.Any], RuleEvaluatorImage = RuleEvaluatorImage.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (LocalPath != null) __obj.updateDynamic("LocalPath")(LocalPath.asInstanceOf[js.Any])
    if (RuleParameters != null) __obj.updateDynamic("RuleParameters")(RuleParameters.asInstanceOf[js.Any])
    if (S3OutputPath != null) __obj.updateDynamic("S3OutputPath")(S3OutputPath.asInstanceOf[js.Any])
    if (VolumeSizeInGB != null) __obj.updateDynamic("VolumeSizeInGB")(VolumeSizeInGB.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugRuleConfiguration]
  }
}

