package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportAssetToSignedUrlResponseDetails extends js.Object {
  /**
    * The unique identifier for the asset associated with this export job.
    */
  var AssetId: Id = js.native
  /**
    * The unique identifier for the data set associated with this export job.
    */
  var DataSetId: Id = js.native
  /**
    * The unique identifier for the revision associated with this export response.
    */
  var RevisionId: Id = js.native
  /**
    * The signed URL for the export request.
    */
  var SignedUrl: js.UndefOr[__string] = js.native
  /**
    * The date and time that the signed URL expires, in ISO 8601 format.
    */
  var SignedUrlExpiresAt: js.UndefOr[Timestamp] = js.native
}

object ExportAssetToSignedUrlResponseDetails {
  @scala.inline
  def apply(
    AssetId: Id,
    DataSetId: Id,
    RevisionId: Id,
    SignedUrl: __string = null,
    SignedUrlExpiresAt: Timestamp = null
  ): ExportAssetToSignedUrlResponseDetails = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    if (SignedUrl != null) __obj.updateDynamic("SignedUrl")(SignedUrl.asInstanceOf[js.Any])
    if (SignedUrlExpiresAt != null) __obj.updateDynamic("SignedUrlExpiresAt")(SignedUrlExpiresAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAssetToSignedUrlResponseDetails]
  }
}

