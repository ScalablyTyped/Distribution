package typings.amapJsSdk.global.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 地物对象的经纬度矩形范围
  */
@JSGlobal("AMap.Bounds")
@js.native
class Bounds protected ()
  extends typings.amapJsSdk.AMap.Bounds {
  /**
    * 构造一个矩形范围
    * @param southWest 西南角经纬度坐标
    * @param northEast 东北角经纬度坐标
    */
  def this(southWest: typings.amapJsSdk.AMap.LngLat, northEast: typings.amapJsSdk.AMap.LngLat) = this()
}

