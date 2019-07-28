package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSystemInstanceRequest extends js.Object {
  var definition: DefinitionDocument
  /**
    * The ARN of the IAM role that AWS IoT Things Graph will assume when it executes the flow. This role must have read and write access to AWS Lambda and AWS IoT and any other AWS services that the flow uses when it executes. This value is required if the value of the target parameter is CLOUD.
    */
  var flowActionsRoleArn: js.UndefOr[RoleArn] = js.undefined
  /**
    * The name of the Greengrass group where the system instance will be deployed. This value is required if the value of the target parameter is GREENGRASS.
    */
  var greengrassGroupName: js.UndefOr[GroupName] = js.undefined
  var metricsConfiguration: js.UndefOr[MetricsConfiguration] = js.undefined
  /**
    * The name of the Amazon Simple Storage Service bucket that will be used to store and deploy the system instance's resource file. This value is required if the value of the target parameter is GREENGRASS.
    */
  var s3BucketName: js.UndefOr[S3BucketName] = js.undefined
  /**
    * Metadata, consisting of key-value pairs, that can be used to categorize your system instances.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  /**
    * The target type of the deployment. Valid values are GREENGRASS and CLOUD.
    */
  var target: DeploymentTarget
}

object CreateSystemInstanceRequest {
  @scala.inline
  def apply(
    definition: DefinitionDocument,
    target: DeploymentTarget,
    flowActionsRoleArn: RoleArn = null,
    greengrassGroupName: GroupName = null,
    metricsConfiguration: MetricsConfiguration = null,
    s3BucketName: S3BucketName = null,
    tags: TagList = null
  ): CreateSystemInstanceRequest = {
    val __obj = js.Dynamic.literal(definition = definition, target = target.asInstanceOf[js.Any])
    if (flowActionsRoleArn != null) __obj.updateDynamic("flowActionsRoleArn")(flowActionsRoleArn)
    if (greengrassGroupName != null) __obj.updateDynamic("greengrassGroupName")(greengrassGroupName)
    if (metricsConfiguration != null) __obj.updateDynamic("metricsConfiguration")(metricsConfiguration)
    if (s3BucketName != null) __obj.updateDynamic("s3BucketName")(s3BucketName)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateSystemInstanceRequest]
  }
}

