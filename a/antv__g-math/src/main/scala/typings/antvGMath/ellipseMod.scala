package typings.antvGMath

import typings.antvGMath.anon.X
import typings.antvGMath.typesMod.BBox
import typings.antvGMath.typesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-math/lib/ellipse", JSImport.Namespace)
@js.native
object ellipseMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    /**
      * 包围盒计算
      * @param {number} x  椭圆中心 x
      * @param {number} y  椭圆中心 y
      * @param {number} rx 椭圆 x 方向半径
      * @param {number} ry 椭圆 y 方向半径
      * @return {object} 包围盒
      */
    def box(x: Double, y: Double, rx: Double, ry: Double): BBox = js.native
    
    /**
      * 计算周长，使用近似法
      * @param {number} x  椭圆中心 x
      * @param {number} y  椭圆中心 y
      * @param {number} rx 椭圆 x 方向半径
      * @param {number} ry 椭圆 y 方向半径
      * @return {number} 椭圆周长
      */
    def length(x: Double, y: Double, rx: Double, ry: Double): Double = js.native
    
    /**
      * 距离椭圆最近的点
      * @param {number} x  椭圆中心 x
      * @param {number} y  椭圆中心 y
      * @param {number} rx 椭圆 x 方向半径
      * @param {number} ry 椭圆 y 方向半径
      * @param {number} x0  指定的点 x
      * @param {number} y0  指定的点 y
      * @return {object} 椭圆上距离指定点最近的点
      */
    def nearestPoint(x: Double, y: Double, rx: Double, ry: Double, x0: Double, y0: Double): X = js.native
    
    /**
      * 根据比例获取点
      * @param {number} x 椭圆中心 x
      * @param {number} y 椭圆中心 y
      * @param {number} rx 椭圆 x 方向半径
      * @param {number} ry 椭圆 y 方向半径
      * @param {number} t 指定比例，x轴方向为 0
      * @return {object} 点
      */
    def pointAt(x: Double, y: Double, rx: Double, ry: Double, t: Double): Point = js.native
    
    /**
      * 点到椭圆最近的距离
      * @param {number} x  椭圆中心 x
      * @param {number} y  椭圆中心 y
      * @param {number} rx 椭圆 x 方向半径
      * @param {number} ry 椭圆 y 方向半径
      * @param {number} x0  指定的点 x
      * @param {number} y0  指定的点 y
      * @return {number} 点到椭圆的距离
      */
    def pointDistance(x: Double, y: Double, rx: Double, ry: Double, x0: Double, y0: Double): Double = js.native
    
    /**
      * 根据比例计算切线角度
      * @param {number} x 椭圆中心 x
      * @param {number} y 椭圆中心 y
      * @param {number} rx 椭圆 x 方向半径
      * @param {number} ry 椭圆 y 方向半径
      * @param {number} t 指定比例 0 - 1 之间，x轴方向为 0。在 0-1 范围之外是循环还是返回 null，还需要调整
      * @return {number} 角度，在 0 - 2PI 之间
      */
    def tangentAngle(x: Double, y: Double, rx: Double, ry: Double, t: Double): Double = js.native
  }
}
