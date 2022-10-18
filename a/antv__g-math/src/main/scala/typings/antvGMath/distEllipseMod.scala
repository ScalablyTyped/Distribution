package typings.antvGMath

import typings.antvGMath.anon.X
import typings.antvGMath.distTypesMod.BBox
import typings.antvGMath.distTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEllipseMod {
  
  object default {
    
    @JSImport("@antv/g-math/dist/ellipse", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 包围盒计算
      * @param {number} x  椭圆中心 x
      * @param {number} y  椭圆中心 y
      * @param {number} rx 椭圆 x 方向半径
      * @param {number} ry 椭圆 y 方向半径
      * @return {object} 包围盒
      */
    inline def box(x: Double, y: Double, rx: Double, ry: Double): BBox = (^.asInstanceOf[js.Dynamic].applyDynamic("box")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any])).asInstanceOf[BBox]
    
    /**
      * 计算周长，使用近似法
      * @param {number} x  椭圆中心 x
      * @param {number} y  椭圆中心 y
      * @param {number} rx 椭圆 x 方向半径
      * @param {number} ry 椭圆 y 方向半径
      * @return {number} 椭圆周长
      */
    inline def length(x: Double, y: Double, rx: Double, ry: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("length")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any])).asInstanceOf[Double]
    
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
    inline def nearestPoint(x: Double, y: Double, rx: Double, ry: Double, x0: Double, y0: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("nearestPoint")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[X]
    
    /**
      * 根据比例获取点
      * @param {number} x 椭圆中心 x
      * @param {number} y 椭圆中心 y
      * @param {number} rx 椭圆 x 方向半径
      * @param {number} ry 椭圆 y 方向半径
      * @param {number} t 指定比例，x轴方向为 0
      * @return {object} 点
      */
    inline def pointAt(x: Double, y: Double, rx: Double, ry: Double, t: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAt")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Point]
    
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
    inline def pointDistance(x: Double, y: Double, rx: Double, ry: Double, x0: Double, y0: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pointDistance")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * 根据比例计算切线角度
      * @param {number} x 椭圆中心 x
      * @param {number} y 椭圆中心 y
      * @param {number} rx 椭圆 x 方向半径
      * @param {number} ry 椭圆 y 方向半径
      * @param {number} t 指定比例 0 - 1 之间，x轴方向为 0。在 0-1 范围之外是循环还是返回 null，还需要调整
      * @return {number} 角度，在 0 - 2PI 之间
      */
    inline def tangentAngle(x: Double, y: Double, rx: Double, ry: Double, t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tangentAngle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
