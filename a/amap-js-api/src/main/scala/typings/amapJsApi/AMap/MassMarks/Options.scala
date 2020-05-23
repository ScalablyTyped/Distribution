package typings.amapJsApi.AMap.MassMarks

import typings.amapJsApi.AMap.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typings.amapJsApi.AMap.Layer.Options {
  /**
    * 是否在拖拽缩放过程中实时重绘
    */
  var alwayRender: js.UndefOr[Boolean] = js.undefined
  /**
    * 指针样式
    */
  var cursor: js.UndefOr[String] = js.undefined
  /**
    * 设置点的样式
    */
  var style: Style | js.Array[Style]
  /**
    * 显示层级
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    style: Style | js.Array[Style],
    alwayRender: js.UndefOr[Boolean] = js.undefined,
    cursor: String = null,
    map: Map = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (!js.isUndefined(alwayRender)) __obj.updateDynamic("alwayRender")(alwayRender.get.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

