package typings.arcgisRestApi.mod

import typings.arcgisRestApi.arcgisRestApiStrings.esriPFS
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
    angle: js.UndefOr[Double] = js.undefined,
    contentType: String = null,
    height: js.UndefOr[Double] = js.undefined,
    imageData: String = null,
    outline: SimpleLineSymbol = null,
    style: String = null,
    url: String = null,
    width: js.UndefOr[Double] = js.undefined,
    xoffset: js.UndefOr[Double] = js.undefined,
    xscale: js.UndefOr[Double] = js.undefined,
    yoffset: js.UndefOr[Double] = js.undefined,
    yscale: js.UndefOr[Double] = js.undefined
  ): PictureFillSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (imageData != null) __obj.updateDynamic("imageData")(imageData.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xoffset)) __obj.updateDynamic("xoffset")(xoffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xscale)) __obj.updateDynamic("xscale")(xscale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yoffset)) __obj.updateDynamic("yoffset")(yoffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yscale)) __obj.updateDynamic("yscale")(yscale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureFillSymbol]
  }
}

