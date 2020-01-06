package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseDetails extends js.Object {
  /**
    * Details for the export to signed URL response.
    */
  var ExportAssetToSignedUrl: js.UndefOr[ExportAssetToSignedUrlResponseDetails] = js.native
  /**
    * Details for the export to Amazon S3 response.
    */
  var ExportAssetsToS3: js.UndefOr[ExportAssetsToS3ResponseDetails] = js.native
  /**
    * Details for the import from signed URL response.
    */
  var ImportAssetFromSignedUrl: js.UndefOr[ImportAssetFromSignedUrlResponseDetails] = js.native
  /**
    * Details for the import from Amazon S3 response.
    */
  var ImportAssetsFromS3: js.UndefOr[ImportAssetsFromS3ResponseDetails] = js.native
}

object ResponseDetails {
  @scala.inline
  def apply(
    ExportAssetToSignedUrl: ExportAssetToSignedUrlResponseDetails = null,
    ExportAssetsToS3: ExportAssetsToS3ResponseDetails = null,
    ImportAssetFromSignedUrl: ImportAssetFromSignedUrlResponseDetails = null,
    ImportAssetsFromS3: ImportAssetsFromS3ResponseDetails = null
  ): ResponseDetails = {
    val __obj = js.Dynamic.literal()
    if (ExportAssetToSignedUrl != null) __obj.updateDynamic("ExportAssetToSignedUrl")(ExportAssetToSignedUrl.asInstanceOf[js.Any])
    if (ExportAssetsToS3 != null) __obj.updateDynamic("ExportAssetsToS3")(ExportAssetsToS3.asInstanceOf[js.Any])
    if (ImportAssetFromSignedUrl != null) __obj.updateDynamic("ImportAssetFromSignedUrl")(ImportAssetFromSignedUrl.asInstanceOf[js.Any])
    if (ImportAssetsFromS3 != null) __obj.updateDynamic("ImportAssetsFromS3")(ImportAssetsFromS3.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseDetails]
  }
}

