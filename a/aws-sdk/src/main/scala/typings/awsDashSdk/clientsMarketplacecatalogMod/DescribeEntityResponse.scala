package typings.awsDashSdk.clientsMarketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEntityResponse extends js.Object {
  /**
    * This stringified JSON object includes the details of the entity.
    */
  var Details: js.UndefOr[Json] = js.native
  /**
    * The ARN associated to the unique identifier for the change set referenced in this request.
    */
  var EntityArn: js.UndefOr[ARN] = js.native
  /**
    * The identifier of the entity, in the format of EntityId@RevisionId.
    */
  var EntityIdentifier: js.UndefOr[Identifier] = js.native
  /**
    * The named type of the entity, in the format of EntityType@Version.
    */
  var EntityType: js.UndefOr[typings.awsDashSdk.clientsMarketplacecatalogMod.EntityType] = js.native
  /**
    * The last modified date of the entity, in ISO 8601 format (2018-02-27T13:45:22Z).
    */
  var LastModifiedDate: js.UndefOr[StringValue] = js.native
}

object DescribeEntityResponse {
  @scala.inline
  def apply(
    Details: Json = null,
    EntityArn: ARN = null,
    EntityIdentifier: Identifier = null,
    EntityType: EntityType = null,
    LastModifiedDate: StringValue = null
  ): DescribeEntityResponse = {
    val __obj = js.Dynamic.literal()
    if (Details != null) __obj.updateDynamic("Details")(Details.asInstanceOf[js.Any])
    if (EntityArn != null) __obj.updateDynamic("EntityArn")(EntityArn.asInstanceOf[js.Any])
    if (EntityIdentifier != null) __obj.updateDynamic("EntityIdentifier")(EntityIdentifier.asInstanceOf[js.Any])
    if (EntityType != null) __obj.updateDynamic("EntityType")(EntityType.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEntityResponse]
  }
}

