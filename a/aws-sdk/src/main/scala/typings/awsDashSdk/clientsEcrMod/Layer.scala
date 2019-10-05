package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layer extends js.Object {
  /**
    * The availability status of the image layer.
    */
  var layerAvailability: js.UndefOr[LayerAvailability] = js.undefined
  /**
    * The sha256 digest of the image layer.
    */
  var layerDigest: js.UndefOr[LayerDigest] = js.undefined
  /**
    * The size, in bytes, of the image layer.
    */
  var layerSize: js.UndefOr[LayerSizeInBytes] = js.undefined
  /**
    * The media type of the layer, such as application/vnd.docker.image.rootfs.diff.tar.gzip or application/vnd.oci.image.layer.v1.tar+gzip.
    */
  var mediaType: js.UndefOr[MediaType] = js.undefined
}

object Layer {
  @scala.inline
  def apply(
    layerAvailability: LayerAvailability = null,
    layerDigest: LayerDigest = null,
    layerSize: Int | Double = null,
    mediaType: MediaType = null
  ): Layer = {
    val __obj = js.Dynamic.literal()
    if (layerAvailability != null) __obj.updateDynamic("layerAvailability")(layerAvailability.asInstanceOf[js.Any])
    if (layerDigest != null) __obj.updateDynamic("layerDigest")(layerDigest)
    if (layerSize != null) __obj.updateDynamic("layerSize")(layerSize.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType)
    __obj.asInstanceOf[Layer]
  }
}

