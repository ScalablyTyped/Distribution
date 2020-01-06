package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layer extends js.Object {
  /**
    * The availability status of the image layer.
    */
  var layerAvailability: js.UndefOr[LayerAvailability] = js.native
  /**
    * The sha256 digest of the image layer.
    */
  var layerDigest: js.UndefOr[LayerDigest] = js.native
  /**
    * The size, in bytes, of the image layer.
    */
  var layerSize: js.UndefOr[LayerSizeInBytes] = js.native
  /**
    * The media type of the layer, such as application/vnd.docker.image.rootfs.diff.tar.gzip or application/vnd.oci.image.layer.v1.tar+gzip.
    */
  var mediaType: js.UndefOr[MediaType] = js.native
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
    if (layerDigest != null) __obj.updateDynamic("layerDigest")(layerDigest.asInstanceOf[js.Any])
    if (layerSize != null) __obj.updateDynamic("layerSize")(layerSize.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
}

