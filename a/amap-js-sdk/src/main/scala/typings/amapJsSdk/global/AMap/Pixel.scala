package typings.amapJsSdk.global.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* --------------------------- 基础类 --------------------------- */
/* 参考地址:http://lbs.amap.com/api/javascript-api/reference/core */
/**
  * 像素坐标，确定地图上的一个像素点。
  */
@JSGlobal("AMap.Pixel")
@js.native
class Pixel protected ()
  extends typings.amapJsSdk.AMap.Pixel {
  /**
    * 构造一个像素坐标对象。
    */
  def this(x: Double, y: Double) = this()
}

