package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestDetails extends js.Object {
  /**
    * Details about the export to signed URL request.
    */
  var ExportAssetToSignedUrl: js.UndefOr[ExportAssetToSignedUrlRequestDetails] = js.native
  /**
    * Details about the export to Amazon S3 request.
    */
  var ExportAssetsToS3: js.UndefOr[ExportAssetsToS3RequestDetails] = js.native
  /**
    * Details about the import from signed URL request.
    */
  var ImportAssetFromSignedUrl: js.UndefOr[ImportAssetFromSignedUrlRequestDetails] = js.native
  /**
    * Details about the import from Amazon S3 request.
    */
  var ImportAssetsFromS3: js.UndefOr[ImportAssetsFromS3RequestDetails] = js.native
}

object RequestDetails {
  @scala.inline
  def apply(
    ExportAssetToSignedUrl: ExportAssetToSignedUrlRequestDetails = null,
    ExportAssetsToS3: ExportAssetsToS3RequestDetails = null,
    ImportAssetFromSignedUrl: ImportAssetFromSignedUrlRequestDetails = null,
    ImportAssetsFromS3: ImportAssetsFromS3RequestDetails = null
  ): RequestDetails = {
    val __obj = js.Dynamic.literal()
    if (ExportAssetToSignedUrl != null) __obj.updateDynamic("ExportAssetToSignedUrl")(ExportAssetToSignedUrl.asInstanceOf[js.Any])
    if (ExportAssetsToS3 != null) __obj.updateDynamic("ExportAssetsToS3")(ExportAssetsToS3.asInstanceOf[js.Any])
    if (ImportAssetFromSignedUrl != null) __obj.updateDynamic("ImportAssetFromSignedUrl")(ImportAssetFromSignedUrl.asInstanceOf[js.Any])
    if (ImportAssetsFromS3 != null) __obj.updateDynamic("ImportAssetsFromS3")(ImportAssetsFromS3.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDetails]
  }
}

