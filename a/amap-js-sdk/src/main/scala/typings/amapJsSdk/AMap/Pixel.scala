package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* --------------------------- 基础类 --------------------------- */
/* 参考地址:http://lbs.amap.com/api/javascript-api/reference/core */
/**
  * 像素坐标，确定地图上的一个像素点。
  */
@js.native
trait Pixel extends js.Object {
  /**
    * 当前像素坐标与传入像素坐标是否相等
    */
  def equals(point: Pixel): Boolean = js.native
  /**
    * 获得X方向像素坐标
    */
  def getX(): Double = js.native
  /**
    * 获得Y方向像素坐标
    */
  def getY(): Double = js.native
}

object Pixel {
  @scala.inline
  def apply(equals: Pixel => Boolean, getX: () => Double, getY: () => Double): Pixel = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), getX = js.Any.fromFunction0(getX), getY = js.Any.fromFunction0(getY))
    __obj.asInstanceOf[Pixel]
  }
  @scala.inline
  implicit class PixelOps[Self <: Pixel] (val x: Self) extends AnyVal {
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
    def setEquals(value: Pixel => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def setGetX(value: () => Double): Self = this.set("getX", js.Any.fromFunction0(value))
    @scala.inline
    def setGetY(value: () => Double): Self = this.set("getY", js.Any.fromFunction0(value))
  }
  
}

