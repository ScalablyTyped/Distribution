package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDataSetResponse extends js.Object {
  /**
    * The ARN for the data set.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsDataexchangeMod.Arn] = js.native
  /**
    * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
    */
  var AssetType: js.UndefOr[typings.awsDashSdk.clientsDataexchangeMod.AssetType] = js.native
  /**
    * The date and time that the data set was created, in ISO 8601 format.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The description for the data set.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsDataexchangeMod.Description] = js.native
  /**
    * The unique identifier for the data set.
    */
  var Id: js.UndefOr[typings.awsDashSdk.clientsDataexchangeMod.Id] = js.native
  /**
    * The name of the data set.
    */
  var Name: js.UndefOr[typings.awsDashSdk.clientsDataexchangeMod.Name] = js.native
  /**
    * A property that defines the data set as OWNED by the account (for providers) or ENTITLED to the account (for subscribers).
    */
  var Origin: js.UndefOr[typings.awsDashSdk.clientsDataexchangeMod.Origin] = js.native
  /**
    * If the origin of this data set is ENTITLED, includes the details for the product on AWS Marketplace.
    */
  var OriginDetails: js.UndefOr[typings.awsDashSdk.clientsDataexchangeMod.OriginDetails] = js.native
  /**
    * The data set ID of the owned data set corresponding to the entitled data set being viewed. This parameter is returned when a data set owner is viewing the entitled copy of its owned data set.
    */
  var SourceId: js.UndefOr[Id] = js.native
  /**
    * The tags for the data set.
    */
  var Tags: js.UndefOr[MapOf__string] = js.native
  /**
    * The date and time that the data set was last updated, in ISO 8601 format.
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.native
}

object CreateDataSetResponse {
  @scala.inline
  def apply(
    Arn: Arn = null,
    AssetType: AssetType = null,
    CreatedAt: Timestamp = null,
    Description: Description = null,
    Id: Id = null,
    Name: Name = null,
    Origin: Origin = null,
    OriginDetails: OriginDetails = null,
    SourceId: Id = null,
    Tags: MapOf__string = null,
    UpdatedAt: Timestamp = null
  ): CreateDataSetResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (AssetType != null) __obj.updateDynamic("AssetType")(AssetType.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Origin != null) __obj.updateDynamic("Origin")(Origin.asInstanceOf[js.Any])
    if (OriginDetails != null) __obj.updateDynamic("OriginDetails")(OriginDetails.asInstanceOf[js.Any])
    if (SourceId != null) __obj.updateDynamic("SourceId")(SourceId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (UpdatedAt != null) __obj.updateDynamic("UpdatedAt")(UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSetResponse]
  }
}

