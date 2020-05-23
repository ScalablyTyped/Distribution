package typings.arcgisRestApi.mod

import typings.arcgisRestApi.arcgisRestApiStrings.esriPMS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.arcgisRestApi.mod.PictureSourced because var conflicts: angle, xoffset, yoffset. Inlined url, imageData, contentType, width, height */ trait PictureMarkerSymbol extends MarkerSymbol {
   // "<base64EncodedImageData>";
  var contentType: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
   // Relative URL for static layers and full URL for dynamic layers. Access relative URL using http://<mapservice-url>/<layerId1>/images/<imageUrl11>
  var imageData: js.UndefOr[String] = js.undefined
  @JSName("type")
  var type_PictureMarkerSymbol: esriPMS
  var url: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PictureMarkerSymbol {
  @scala.inline
  def apply(
    `type`: esriPMS,
    angle: js.UndefOr[Double] = js.undefined,
    contentType: String = null,
    height: js.UndefOr[Double] = js.undefined,
    imageData: String = null,
    style: String = null,
    url: String = null,
    width: js.UndefOr[Double] = js.undefined,
    xoffset: js.UndefOr[Double] = js.undefined,
    yoffset: js.UndefOr[Double] = js.undefined
  ): PictureMarkerSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (imageData != null) __obj.updateDynamic("imageData")(imageData.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xoffset)) __obj.updateDynamic("xoffset")(xoffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yoffset)) __obj.updateDynamic("yoffset")(yoffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureMarkerSymbol]
  }
}

