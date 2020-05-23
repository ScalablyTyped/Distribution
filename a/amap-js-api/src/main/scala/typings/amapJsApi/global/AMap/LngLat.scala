package typings.amapJsApi.global.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.LngLat")
@js.native
class LngLat protected ()
  extends typings.amapJsApi.AMap.LngLat {
  /**
    * 构造一个地理坐标对象
    * @param lng 经度
    * @param lat 纬度
    * @param noAutofix 是否自动修正
    */
  def this(lng: Double, lat: Double) = this()
  def this(lng: Double, lat: Double, noAutofix: Boolean) = this()
}

