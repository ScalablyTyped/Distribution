package typings.amapDashJsDashApi.AMap.LabelMarker

import typings.amapDashJsDashApi.AMap.LocationValue
import typings.amapDashJsDashApi.AMap.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[ExtraData]
  extends typings.amapDashJsDashApi.AMap.Overlay.Options[ExtraData] {
  var icon: js.UndefOr[IconOptions] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[String | LocationValue] = js.undefined
  var rank: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[TextOptions] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  // internal
  var zIndex: js.UndefOr[Double] = js.undefined
  var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply[ExtraData](
    bubble: js.UndefOr[Boolean] = js.undefined,
    clickable: js.UndefOr[Boolean] = js.undefined,
    cursor: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    extData: ExtraData = null,
    icon: IconOptions = null,
    map: Map = null,
    opacity: Int | Double = null,
    position: String | LocationValue = null,
    rank: Int | Double = null,
    text: TextOptions = null,
    title: String = null,
    zIndex: Int | Double = null,
    zooms: js.Tuple2[Double, Double] = null
  ): Options[ExtraData] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubble)) __obj.updateDynamic("bubble")(bubble)
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (extData != null) __obj.updateDynamic("extData")(extData.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (map != null) __obj.updateDynamic("map")(map)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms)
    __obj.asInstanceOf[Options[ExtraData]]
  }
}

