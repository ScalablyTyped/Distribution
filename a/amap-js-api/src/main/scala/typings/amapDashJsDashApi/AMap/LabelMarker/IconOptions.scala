package typings.amapDashJsDashApi.AMap.LabelMarker

import typings.amapDashJsDashApi.AMap.Pixel
import typings.amapDashJsDashApi.AMap.Size
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
    angel: Int | Double = null,
    clipOrigin: js.Array[Double] | Pixel = null,
    clipSize: js.Tuple2[Double, Double] = null,
    image: String = null,
    retina: js.UndefOr[Boolean] = js.undefined,
    size: js.Array[Double] | Size = null,
    `type`: String = null,
    zooms: js.Tuple2[Double, Double] = null
  ): IconOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (angel != null) __obj.updateDynamic("angel")(angel.asInstanceOf[js.Any])
    if (clipOrigin != null) __obj.updateDynamic("clipOrigin")(clipOrigin.asInstanceOf[js.Any])
    if (clipSize != null) __obj.updateDynamic("clipSize")(clipSize)
    if (image != null) __obj.updateDynamic("image")(image)
    if (!js.isUndefined(retina)) __obj.updateDynamic("retina")(retina)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (zooms != null) __obj.updateDynamic("zooms")(zooms)
    __obj.asInstanceOf[IconOptions]
  }
}

