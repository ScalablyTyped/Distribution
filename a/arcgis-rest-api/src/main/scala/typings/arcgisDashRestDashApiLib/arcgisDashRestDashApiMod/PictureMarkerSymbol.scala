package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- arcgisDashRestDashApiLib.arcgisDashRestDashApiMod.PictureSourced because var conflicts: angle, xoffset, yoffset. Inlined url, imageData, contentType, width, height */ trait PictureMarkerSymbol extends MarkerSymbol {
   // "<base64EncodedImageData>";
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
   // Relative URL for static layers and full URL for dynamic layers. Access relative URL using http://<mapservice-url>/<layerId1>/images/<imageUrl11>
  var imageData: js.UndefOr[java.lang.String] = js.undefined
  @JSName("type")
  var type_PictureMarkerSymbol: arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriPMS
  var url: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object PictureMarkerSymbol {
  @scala.inline
  def apply(
    `type`: arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriPMS,
    angle: scala.Int | scala.Double = null,
    contentType: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    imageData: java.lang.String = null,
    style: java.lang.String = null,
    url: java.lang.String = null,
    width: scala.Int | scala.Double = null,
    xoffset: scala.Int | scala.Double = null,
    yoffset: scala.Int | scala.Double = null
  ): PictureMarkerSymbol = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (imageData != null) __obj.updateDynamic("imageData")(imageData)
    if (style != null) __obj.updateDynamic("style")(style)
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xoffset != null) __obj.updateDynamic("xoffset")(xoffset.asInstanceOf[js.Any])
    if (yoffset != null) __obj.updateDynamic("yoffset")(yoffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureMarkerSymbol]
  }
}

