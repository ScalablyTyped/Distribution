package typings.awsDashSdk.clientsMarketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntitySummary extends js.Object {
  /**
    * The ARN associated with the unique identifier for the entity.
    */
  var EntityArn: js.UndefOr[ARN] = js.native
  /**
    * The unique identifier for the entity.
    */
  var EntityId: js.UndefOr[ResourceId] = js.native
  /**
    * The type of the entity.
    */
  var EntityType: js.UndefOr[typings.awsDashSdk.clientsMarketplacecatalogMod.EntityType] = js.native
  /**
    * The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).
    */
  var LastModifiedDate: js.UndefOr[StringValue] = js.native
  /**
    * The name for the entity. This value is not unique. It is defined by the provider.
    */
  var Name: js.UndefOr[StringValue] = js.native
  /**
    * The visibility status of the entity to subscribers. This value can be Public (everyone can view the entity), Limited (the entity is visible to limited accounts only), or Restricted (the entity was published and then unpublished and only existing subscribers can view it). 
    */
  var Visibility: js.UndefOr[StringValue] = js.native
}

object EntitySummary {
  @scala.inline
  def apply(
    EntityArn: ARN = null,
    EntityId: ResourceId = null,
    EntityType: EntityType = null,
    LastModifiedDate: StringValue = null,
    Name: StringValue = null,
    Visibility: StringValue = null
  ): EntitySummary = {
    val __obj = js.Dynamic.literal()
    if (EntityArn != null) __obj.updateDynamic("EntityArn")(EntityArn.asInstanceOf[js.Any])
    if (EntityId != null) __obj.updateDynamic("EntityId")(EntityId.asInstanceOf[js.Any])
    if (EntityType != null) __obj.updateDynamic("EntityType")(EntityType.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Visibility != null) __obj.updateDynamic("Visibility")(Visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntitySummary]
  }
}

