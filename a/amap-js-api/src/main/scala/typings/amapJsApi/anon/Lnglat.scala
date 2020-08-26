package typings.amapJsApi.anon

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lnglat[I] extends js.Object {
  /**
    * 经纬度坐标
    */
  var lnglat: LngLat = js.native
  /**
    * 像素坐标
    */
  var pixel: Pixel = js.native
  /**
    * 触发对象
    */
  var target: I = js.native
}

object Lnglat {
  @scala.inline
  def apply[I](lnglat: LngLat, pixel: Pixel, target: I): Lnglat[I] = {
    val __obj = js.Dynamic.literal(lnglat = lnglat.asInstanceOf[js.Any], pixel = pixel.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lnglat[I]]
  }
  @scala.inline
  implicit class LnglatOps[Self <: Lnglat[_], I] (val x: Self with Lnglat[I]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLnglat(value: LngLat): Self = this.set("lnglat", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixel(value: Pixel): Self = this.set("pixel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: I): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

