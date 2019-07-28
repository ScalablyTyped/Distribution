package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateResourceIdentifier extends js.Object {
  /**
    * The ID of the AWS resource.
    */
  var ResourceId: typings.awsDashSdk.clientsConfigserviceMod.ResourceId
  /**
    * The name of the AWS resource.
    */
  var ResourceName: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ResourceName] = js.undefined
  /**
    * The type of the AWS resource.
    */
  var ResourceType: typings.awsDashSdk.clientsConfigserviceMod.ResourceType
  /**
    * The 12-digit account ID of the source account.
    */
  var SourceAccountId: AccountId
  /**
    * The source region where data is aggregated.
    */
  var SourceRegion: AwsRegion
}

object AggregateResourceIdentifier {
  @scala.inline
  def apply(
    ResourceId: ResourceId,
    ResourceType: ResourceType,
    SourceAccountId: AccountId,
    SourceRegion: AwsRegion,
    ResourceName: ResourceName = null
  ): AggregateResourceIdentifier = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId, ResourceType = ResourceType.asInstanceOf[js.Any], SourceAccountId = SourceAccountId, SourceRegion = SourceRegion)
    if (ResourceName != null) __obj.updateDynamic("ResourceName")(ResourceName)
    __obj.asInstanceOf[AggregateResourceIdentifier]
  }
}

