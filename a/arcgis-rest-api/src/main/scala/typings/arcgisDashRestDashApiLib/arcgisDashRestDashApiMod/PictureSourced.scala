package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PictureSourced extends js.Object {
  var angle: js.UndefOr[scala.Double] = js.undefined
   // "<base64EncodedImageData>";
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
   // Relative URL for static layers and full URL for dynamic layers. Access relative URL using http://<mapservice-url>/<layerId1>/images/<imageUrl11>
  var imageData: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var xoffset: js.UndefOr[scala.Double] = js.undefined
  var yoffset: js.UndefOr[scala.Double] = js.undefined
}

object PictureSourced {
  @scala.inline
  def apply(
    angle: scala.Int | scala.Double = null,
    contentType: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    imageData: java.lang.String = null,
    url: java.lang.String = null,
    width: scala.Int | scala.Double = null,
    xoffset: scala.Int | scala.Double = null,
    yoffset: scala.Int | scala.Double = null
  ): PictureSourced = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (imageData != null) __obj.updateDynamic("imageData")(imageData)
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xoffset != null) __obj.updateDynamic("xoffset")(xoffset.asInstanceOf[js.Any])
    if (yoffset != null) __obj.updateDynamic("yoffset")(yoffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureSourced]
  }
}

