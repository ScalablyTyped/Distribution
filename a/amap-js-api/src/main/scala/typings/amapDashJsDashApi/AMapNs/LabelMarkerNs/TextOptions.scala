package typings.amapDashJsDashApi.AMapNs.LabelMarkerNs

import typings.amapDashJsDashApi.AMapNs.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextOptions extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[TextDirection] = js.undefined
  var offset: js.UndefOr[Pixel | (js.Tuple2[Double, Double])] = js.undefined
  var style: js.UndefOr[TextStyle] = js.undefined
  var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object TextOptions {
  @scala.inline
  def apply(
    content: String = null,
    direction: TextDirection = null,
    offset: Pixel | (js.Tuple2[Double, Double]) = null,
    style: TextStyle = null,
    zooms: js.Tuple2[Double, Double] = null
  ): TextOptions = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (zooms != null) __obj.updateDynamic("zooms")(zooms)
    __obj.asInstanceOf[TextOptions]
  }
}

