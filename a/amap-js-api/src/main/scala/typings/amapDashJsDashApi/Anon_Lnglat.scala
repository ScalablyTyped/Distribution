package typings.amapDashJsDashApi

import typings.amapDashJsDashApi.AMap.LngLat
import typings.amapDashJsDashApi.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lnglat[I] extends js.Object {
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

object Anon_Lnglat {
  @scala.inline
  def apply[I](lnglat: LngLat, pixel: Pixel, target: I): Anon_Lnglat[I] = {
    val __obj = js.Dynamic.literal(lnglat = lnglat.asInstanceOf[js.Any], pixel = pixel.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Lnglat[I]]
  }
}

