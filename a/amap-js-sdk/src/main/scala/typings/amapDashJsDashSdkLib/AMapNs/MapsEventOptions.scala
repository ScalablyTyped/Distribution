package typings
package amapDashJsDashSdkLib.AMapNs

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
  var `type`: java.lang.String
}

object MapsEventOptions {
  @scala.inline
  def apply(lnglat: LngLat, pixel: Pixel, target: js.Any, `type`: java.lang.String): MapsEventOptions = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("lnglat")(lnglat)
    __obj.updateDynamic("pixel")(pixel)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[MapsEventOptions]
  }
}

