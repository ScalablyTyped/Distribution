package typings.antvGMath

import typings.antvGMath.typesMod.BBox
import typings.antvGMath.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleMod {
  
  object default {
    
    @JSImport("@antv/g-math/lib/circle", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 计算包围盒
      * @param {number} x 圆心 x
      * @param {number} y 圆心 y
      * @param {number} r 半径
      * @return {object} 包围盒
      */
    inline def box(x: Double, y: Double, r: Double): BBox = (^.asInstanceOf[js.Dynamic].applyDynamic("box")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[BBox]
    
    /**
      * 计算周长
      * @param {number} x 圆心 x
      * @param {number} y 圆心 y
      * @param {number} r 半径
      * @return {number} 周长
      */
    inline def length(x: Double, y: Double, r: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("length")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * 根据比例获取点
      * @param {number} x 圆心 x
      * @param {number} y 圆心 y
      * @param {number} r 半径
      * @param {number} t 指定比例，x轴方向为 0
      * @return {object} 点
      */
    inline def pointAt(x: Double, y: Double, r: Double, t: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAt")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], r.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    /**
      * 点到圆的距离
      * @param {number} x 圆心 x
      * @param {number} y 圆心 y
      * @param {number} r 半径
      * @param {number} x0  指定的点 x
      * @param {number} y0  指定的点 y
      * @return {number} 距离
      */
    inline def pointDistance(x: Double, y: Double, r: Double, x0: Double, y0: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pointDistance")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], r.asInstanceOf[js.Any], x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * 根据比例计算切线角度
      * @param {number} x 圆心 x
      * @param {number} y 圆心 y
      * @param {number} r 半径
      * @param {number} t 指定比例 0 - 1 之间，x轴方向为 0。在 0-1 范围之外是循环还是返回 null，还需要调整
      * @return {number} 角度，在 0 - 2PI 之间
      */
    inline def tangentAngle(x: Double, y: Double, r: Double, t: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tangentAngle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], r.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
