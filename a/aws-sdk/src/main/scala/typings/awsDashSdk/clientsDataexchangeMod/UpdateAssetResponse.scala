package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAssetResponse extends js.Object {
  /**
    * The ARN for the asset.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsDataexchangeMod.Arn] = js.native
  /**
    * Information about the asset, including its size.
    */
  var AssetDetails: js.UndefOr[typings.awsDashSdk.clientsDataexchangeMod.AssetDetails] = js.native
  /**
    * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
    */
  var AssetType: js.UndefOr[typings.awsDashSdk.clientsDataexchangeMod.AssetType] = js.native
  /**
    * The date and time that the asset was created, in ISO 8601 format.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The unique identifier for the data set associated with this asset.
    */
  var DataSetId: js.UndefOr[Id] = js.native
  /**
    * The unique identifier for the asset.
    */
  var Id: js.UndefOr[typings.awsDashSdk.clientsDataexchangeMod.Id] = js.native
  /**
    * The name of the asset When importing from Amazon S3, the S3 object key is used as the asset name. When exporting to Amazon S3, the asset name is used as default target S3 object key.
    */
  var Name: js.UndefOr[AssetName] = js.native
  /**
    * The unique identifier for the revision associated with this asset.
    */
  var RevisionId: js.UndefOr[Id] = js.native
  /**
    * The asset ID of the owned asset corresponding to the entitled asset being viewed. This parameter is returned when an asset owner is viewing the entitled copy of its owned asset.
    */
  var SourceId: js.UndefOr[Id] = js.native
  /**
    * The date and time that the asset was last updated, in ISO 8601 format.
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.native
}

object UpdateAssetResponse {
  @scala.inline
  def apply(
    Arn: Arn = null,
    AssetDetails: AssetDetails = null,
    AssetType: AssetType = null,
    CreatedAt: Timestamp = null,
    DataSetId: Id = null,
    Id: Id = null,
    Name: AssetName = null,
    RevisionId: Id = null,
    SourceId: Id = null,
    UpdatedAt: Timestamp = null
  ): UpdateAssetResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (AssetDetails != null) __obj.updateDynamic("AssetDetails")(AssetDetails.asInstanceOf[js.Any])
    if (AssetType != null) __obj.updateDynamic("AssetType")(AssetType.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (DataSetId != null) __obj.updateDynamic("DataSetId")(DataSetId.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId.asInstanceOf[js.Any])
    if (SourceId != null) __obj.updateDynamic("SourceId")(SourceId.asInstanceOf[js.Any])
    if (UpdatedAt != null) __obj.updateDynamic("UpdatedAt")(UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssetResponse]
  }
}

