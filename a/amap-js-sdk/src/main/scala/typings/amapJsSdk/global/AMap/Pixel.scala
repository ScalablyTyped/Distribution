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
  /**
    * 当前像素坐标与传入像素坐标是否相等
    */
  /* CompleteClass */
  override def equals(point: typings.amapJsSdk.AMap.Pixel): Boolean = js.native
  /**
    * 获得X方向像素坐标
    */
  /* CompleteClass */
  override def getX(): Double = js.native
  /**
    * 获得Y方向像素坐标
    */
  /* CompleteClass */
  override def getY(): Double = js.native
}

