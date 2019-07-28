package typings.arcgisDashRestDashApi.arcgisDashRestDashApiMod

import typings.arcgisDashRestDashApi.arcgisDashRestDashApiStrings.esriPFS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PictureFillSymbol
  extends Symbol
     with PictureSourced {
  var outline: js.UndefOr[SimpleLineSymbol] = js.undefined
  @JSName("type")
  var type_PictureFillSymbol: esriPFS
   // if outline has been specified
  var xscale: js.UndefOr[Double] = js.undefined
  var yscale: js.UndefOr[Double] = js.undefined
}

object PictureFillSymbol {
  @scala.inline
  def apply(
    `type`: esriPFS,
    angle: Int | Double = null,
    contentType: String = null,
    height: Int | Double = null,
    imageData: String = null,
    outline: SimpleLineSymbol = null,
    style: String = null,
    url: String = null,
    width: Int | Double = null,
    xoffset: Int | Double = null,
    xscale: Int | Double = null,
    yoffset: Int | Double = null,
    yscale: Int | Double = null
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

