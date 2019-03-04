package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PictureFillSymbol
  extends Symbol
     with PictureSourced {
  var outline: js.UndefOr[SimpleLineSymbol] = js.undefined
  @JSName("type")
  var type_PictureFillSymbol: arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriPFS
   // if outline has been specified
  var xscale: js.UndefOr[scala.Double] = js.undefined
  var yscale: js.UndefOr[scala.Double] = js.undefined
}

object PictureFillSymbol {
  @scala.inline
  def apply(
    `type`: arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriPFS,
    angle: scala.Int | scala.Double = null,
    contentType: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    imageData: java.lang.String = null,
    outline: SimpleLineSymbol = null,
    style: java.lang.String = null,
    url: java.lang.String = null,
    width: scala.Int | scala.Double = null,
    xoffset: scala.Int | scala.Double = null,
    xscale: scala.Int | scala.Double = null,
    yoffset: scala.Int | scala.Double = null,
    yscale: scala.Int | scala.Double = null
  ): PictureFillSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (imageData != null) __obj.updateDynamic("imageData")(imageData)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (style != null) __obj.updateDynamic("style")(style)
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xoffset != null) __obj.updateDynamic("xoffset")(xoffset.asInstanceOf[js.Any])
    if (xscale != null) __obj.updateDynamic("xscale")(xscale.asInstanceOf[js.Any])
    if (yoffset != null) __obj.updateDynamic("yoffset")(yoffset.asInstanceOf[js.Any])
    if (yscale != null) __obj.updateDynamic("yscale")(yscale.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureFillSymbol]
  }
}

