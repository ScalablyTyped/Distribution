package typings.amapDashJsDashApi.AMap.View2D

import typings.amapDashJsDashApi.AMap.LocationValue
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.EPGS3395
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.EPGS3857
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.EPGS4326
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * 地图中心点坐标值
    */
  var center: js.UndefOr[LocationValue] = js.undefined
  /**
    * 地图显示的参考坐标系
    */
  var crs: js.UndefOr[EPGS3857 | EPGS3395 | EPGS4326] = js.undefined
  /**
    * 地图顺时针旋转角度
    */
  var rotation: js.UndefOr[Double] = js.undefined
  /**
    * 地图显示的缩放级别
    */
  var zoom: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    center: LocationValue = null,
    crs: EPGS3857 | EPGS3395 | EPGS4326 = null,
    rotation: Int | Double = null,
    zoom: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (crs != null) __obj.updateDynamic("crs")(crs.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

