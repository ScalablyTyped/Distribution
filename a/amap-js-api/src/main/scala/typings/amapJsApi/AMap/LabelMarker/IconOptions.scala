package typings.amapJsApi.AMap.LabelMarker

import typings.amapJsApi.AMap.Pixel
import typings.amapJsApi.AMap.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconOptions extends js.Object {
  var anchor: js.UndefOr[Anchor] = js.undefined
  // internal
  var angel: js.UndefOr[Double] = js.undefined
  // unsupport Pixel in v1.4.14
  var clipOrigin: js.UndefOr[js.Array[Double] | Pixel] = js.undefined
  var clipSize: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var retina: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[js.Array[Double] | Size] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object IconOptions {
  @scala.inline
  def apply(
    anchor: Anchor = null,
    angel: js.UndefOr[Double] = js.undefined,
    clipOrigin: js.Array[Double] | Pixel = null,
    clipSize: js.Tuple2[Double, Double] = null,
    image: String = null,
    retina: js.UndefOr[Boolean] = js.undefined,
    size: js.Array[Double] | Size = null,
    `type`: String = null,
    zooms: js.Tuple2[Double, Double] = null
  ): IconOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(angel)) __obj.updateDynamic("angel")(angel.get.asInstanceOf[js.Any])
    if (clipOrigin != null) __obj.updateDynamic("clipOrigin")(clipOrigin.asInstanceOf[js.Any])
    if (clipSize != null) __obj.updateDynamic("clipSize")(clipSize.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(retina)) __obj.updateDynamic("retina")(retina.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconOptions]
  }
}

