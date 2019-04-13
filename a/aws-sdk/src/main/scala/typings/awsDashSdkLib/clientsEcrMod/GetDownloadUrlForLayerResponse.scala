package typings
package awsDashSdkLib.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDownloadUrlForLayerResponse extends js.Object {
  /**
    * The pre-signed Amazon S3 download URL for the requested layer.
    */
  var downloadUrl: js.UndefOr[Url] = js.undefined
  /**
    * The digest of the image layer to download.
    */
  var layerDigest: js.UndefOr[LayerDigest] = js.undefined
}

object GetDownloadUrlForLayerResponse {
  @scala.inline
  def apply(downloadUrl: Url = null, layerDigest: LayerDigest = null): GetDownloadUrlForLayerResponse = {
    val __obj = js.Dynamic.literal()
    if (downloadUrl != null) __obj.updateDynamic("downloadUrl")(downloadUrl)
    if (layerDigest != null) __obj.updateDynamic("layerDigest")(layerDigest)
    __obj.asInstanceOf[GetDownloadUrlForLayerResponse]
  }
}

