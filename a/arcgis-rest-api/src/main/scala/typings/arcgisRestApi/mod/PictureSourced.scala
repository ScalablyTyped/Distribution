package typings.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PictureSourced extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
   // "<base64EncodedImageData>";
  var contentType: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
   // Relative URL for static layers and full URL for dynamic layers. Access relative URL using http://<mapservice-url>/<layerId1>/images/<imageUrl11>
  var imageData: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var xoffset: js.UndefOr[Double] = js.undefined
  var yoffset: js.UndefOr[Double] = js.undefined
}

object PictureSourced {
  @scala.inline
  def apply(
    angle: js.UndefOr[Double] = js.undefined,
    contentType: String = null,
    height: js.UndefOr[Double] = js.undefined,
    imageData: String = null,
    url: String = null,
    width: js.UndefOr[Double] = js.undefined,
    xoffset: js.UndefOr[Double] = js.undefined,
    yoffset: js.UndefOr[Double] = js.undefined
  ): PictureSourced = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (imageData != null) __obj.updateDynamic("imageData")(imageData.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xoffset)) __obj.updateDynamic("xoffset")(xoffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yoffset)) __obj.updateDynamic("yoffset")(yoffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureSourced]
  }
}

