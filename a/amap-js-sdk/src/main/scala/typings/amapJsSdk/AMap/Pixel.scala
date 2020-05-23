package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* --------------------------- 基础类 --------------------------- */
/* 参考地址:http://lbs.amap.com/api/javascript-api/reference/core */
/**
  * 像素坐标，确定地图上的一个像素点。
  */
trait Pixel extends js.Object {
  /**
    * 当前像素坐标与传入像素坐标是否相等
    */
  def equals(point: Pixel): Boolean
  /**
    * 获得X方向像素坐标
    */
  def getX(): Double
  /**
    * 获得Y方向像素坐标
    */
  def getY(): Double
}

object Pixel {
  @scala.inline
  def apply(equals: Pixel => Boolean, getX: () => Double, getY: () => Double): Pixel = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), getX = js.Any.fromFunction0(getX), getY = js.Any.fromFunction0(getY))
    __obj.asInstanceOf[Pixel]
  }
}

