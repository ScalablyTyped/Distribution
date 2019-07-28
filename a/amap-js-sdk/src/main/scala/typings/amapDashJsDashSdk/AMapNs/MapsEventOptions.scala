package typings.amapDashJsDashSdk.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 此对象用于表示地图、覆盖物、叠加层上的各种鼠标事件返回，包含以下字段：
  */
trait MapsEventOptions extends js.Object {
  var lnglat: LngLat
  var pixel: Pixel
  var target: js.Any
  var `type`: String
}

object MapsEventOptions {
  @scala.inline
  def apply(lnglat: LngLat, pixel: Pixel, target: js.Any, `type`: String): MapsEventOptions = {
    val __obj = js.Dynamic.literal(lnglat = lnglat, pixel = pixel, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MapsEventOptions]
  }
}

