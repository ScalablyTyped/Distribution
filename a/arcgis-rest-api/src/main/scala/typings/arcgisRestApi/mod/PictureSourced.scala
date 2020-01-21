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
    angle: Int | Double = null,
    contentType: String = null,
    height: Int | Double = null,
    imageData: String = null,
    url: String = null,
    width: Int | Double = null,
    xoffset: Int | Double = null,
    yoffset: Int | Double = null
  ): PictureSourced = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (imageData != null) __obj.updateDynamic("imageData")(imageData.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xoffset != null) __obj.updateDynamic("xoffset")(xoffset.asInstanceOf[js.Any])
    if (yoffset != null) __obj.updateDynamic("yoffset")(yoffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureSourced]
  }
}

