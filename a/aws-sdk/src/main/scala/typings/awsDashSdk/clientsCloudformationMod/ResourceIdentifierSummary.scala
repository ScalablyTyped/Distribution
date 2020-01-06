package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceIdentifierSummary extends js.Object {
  /**
    * The logical IDs of the target resources of the specified ResourceType, as defined in the import template.
    */
  var LogicalResourceIds: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.LogicalResourceIds] = js.native
  /**
    * The resource properties you can provide during the import to identify your target resources. For example, BucketName is a possible identifier property for AWS::S3::Bucket resources.
    */
  var ResourceIdentifiers: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ResourceIdentifiers] = js.native
  /**
    * The template resource type of the target resources, such as AWS::S3::Bucket.
    */
  var ResourceType: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ResourceType] = js.native
}

object ResourceIdentifierSummary {
  @scala.inline
  def apply(
    LogicalResourceIds: LogicalResourceIds = null,
    ResourceIdentifiers: ResourceIdentifiers = null,
    ResourceType: ResourceType = null
  ): ResourceIdentifierSummary = {
    val __obj = js.Dynamic.literal()
    if (LogicalResourceIds != null) __obj.updateDynamic("LogicalResourceIds")(LogicalResourceIds.asInstanceOf[js.Any])
    if (ResourceIdentifiers != null) __obj.updateDynamic("ResourceIdentifiers")(ResourceIdentifiers.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceIdentifierSummary]
  }
}

