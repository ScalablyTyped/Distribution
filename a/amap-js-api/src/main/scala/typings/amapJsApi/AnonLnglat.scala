package typings.amapJsApi

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLnglat[I] extends js.Object {
  /**
    * 经纬度坐标
    */
  var lnglat: LngLat
  /**
    * 像素坐标
    */
  var pixel: Pixel
  /**
    * 触发对象
    */
  var target: I
}

object AnonLnglat {
  @scala.inline
  def apply[I](lnglat: LngLat, pixel: Pixel, target: I): AnonLnglat[I] = {
    val __obj = js.Dynamic.literal(lnglat = lnglat.asInstanceOf[js.Any], pixel = pixel.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLnglat[I]]
  }
}

