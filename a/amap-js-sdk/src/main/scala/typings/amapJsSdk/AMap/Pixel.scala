package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* --------------------------- 基础类 --------------------------- */
/* 参考地址:http://lbs.amap.com/api/javascript-api/reference/core */
/**
  * 像素坐标，确定地图上的一个像素点。
  */
trait Pixel extends StObject {
  
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
  def apply(equals_ : Pixel => Boolean, getX: () => Double, getY: () => Double): Pixel = {
    val __obj = js.Dynamic.literal(getX = js.Any.fromFunction0(getX), getY = js.Any.fromFunction0(getY))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Pixel]
  }
  
  @scala.inline
  implicit class PixelMutableBuilder[Self <: Pixel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEquals_(value: Pixel => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetX(value: () => Double): Self = StObject.set(x, "getX", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetY(value: () => Double): Self = StObject.set(x, "getY", js.Any.fromFunction0(value))
  }
}
